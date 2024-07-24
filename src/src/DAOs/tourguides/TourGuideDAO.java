package src.DAOs.tourguides;

import src.models.TourGuide;
import src.DAOs.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TourGuideDAO implements ITourGuideDAO {

    private static TourGuideDAO instance;
    private final Connection connection;

    private TourGuideDAO() {
        connection = ConnectDatabase.getConnection();
    }

    public static TourGuideDAO getInstance() {
        if (instance == null) {
            instance = new TourGuideDAO();
        }
        return instance;
    }

    @Override
    public boolean add(TourGuide tourGuide) {
        String query = "INSERT INTO tour_guides (name, phone, experience, age, gender) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, tourGuide.getName());
            preparedStatement.setString(2, tourGuide.getPhone());
            preparedStatement.setString(3, tourGuide.getExperience());
            preparedStatement.setInt(4, tourGuide.getAge());
            preparedStatement.setBoolean(5, tourGuide.isGender());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for adding tour guide");
            return false;
        }
    }

    @Override
    public boolean update(TourGuide tourGuide) {
        String query = "UPDATE tour_guides SET name = ?, phone = ?, experience = ?, age = ?, gender = ? WHERE tour_guide_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, tourGuide.getName());
            preparedStatement.setString(2, tourGuide.getPhone());
            preparedStatement.setString(3, tourGuide.getExperience());
            preparedStatement.setInt(4, tourGuide.getAge());
            preparedStatement.setBoolean(5, tourGuide.isGender());
            preparedStatement.setInt(6, tourGuide.getTourGuideId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for updating tour guide");
            return false;
        }
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM tour_guides WHERE tour_guide_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, key);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for deleting tour guide");
            return false;
        }
    }

    @Override
    public List<TourGuide> findAll() {
        List<TourGuide> tourGuides = new ArrayList<>();
        String query = "SELECT * FROM tour_guides";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    TourGuide tourGuide = new TourGuide();
                    tourGuide.setTourGuideId(resultSet.getInt("tour_guide_id"));
                    tourGuide.setName(resultSet.getString("name"));
                    tourGuide.setPhone(resultSet.getString("phone"));
                    tourGuide.setExperience(resultSet.getString("experience"));
                    tourGuide.setAge(resultSet.getInt("age"));
                    tourGuide.setGender(resultSet.getBoolean("gender"));
                    tourGuides.add(tourGuide);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for finding all tour guides");
        }
        return tourGuides;
    }
}
