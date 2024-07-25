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

    private static final TourGuideDAO INSTANCE = new TourGuideDAO();
    private final Connection connection;

    private TourGuideDAO() {
        connection = ConnectDatabase.getConnection();
    }

    public static TourGuideDAO getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean add(TourGuide tourGuide) {
        String query = "INSERT INTO tour_guides (name, phone, age, gender, address) VALUES (?, ?, ?, ?, ?)";
        return executeUpdate(query, tourGuide, false);
    }

    @Override
    public boolean update(TourGuide tourGuide) {
        String query = "UPDATE tour_guides SET name = ?, phone = ?, age = ?, gender = ?, address = ? WHERE tour_guide_id = ?";
        return executeUpdate(query, tourGuide, true);
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
        try (PreparedStatement preparedStatement = connection.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                TourGuide tourGuide = mapResultSetToTourGuide(resultSet);
                tourGuides.add(tourGuide);
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for finding all tour guides");
        }
        return tourGuides;
    }

    @Override
    public List<TourGuide> search(Object content) {
        List<TourGuide> tourGuides = new ArrayList<>();
        String searchContent = "%" + content.toString().toLowerCase() + "%";
        String query = "SELECT * FROM tour_guides WHERE tour_guide_id = ? OR LOWER(name) COLLATE SQL_Latin1_General_CP1_CI_AI LIKE ? OR phone LIKE ?";

        int searchCode = 0;
        if (isNumeric(content.toString())) {
            searchCode = Integer.parseInt(content.toString());
        }

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, searchCode);
            preparedStatement.setString(2, searchContent);
            preparedStatement.setString(3, searchContent);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    TourGuide tourGuide = mapResultSetToTourGuide(resultSet);
                    tourGuides.add(tourGuide);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for searching tour guides");
        }

        return tourGuides;
    }

    private boolean executeUpdate(String query, TourGuide tourGuide, boolean isUpdate) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, tourGuide.getName());
            preparedStatement.setString(2, tourGuide.getPhone());
            preparedStatement.setInt(3, tourGuide.getAge());
            preparedStatement.setBoolean(4, tourGuide.isGender());
            preparedStatement.setString(5, tourGuide.getAddress());
            if (isUpdate) {
                preparedStatement.setInt(6, tourGuide.getTourGuideId());
            }
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for " + (isUpdate ? "updating" : "adding") + " tour guide");
            return false;
        }
    }

    private TourGuide mapResultSetToTourGuide(ResultSet resultSet) throws SQLException {
        TourGuide tourGuide = new TourGuide();
        tourGuide.setTourGuideId(resultSet.getInt("tour_guide_id"));
        tourGuide.setName(resultSet.getString("name"));
        tourGuide.setPhone(resultSet.getString("phone"));
        tourGuide.setAddress(resultSet.getString("address"));
        tourGuide.setAge(resultSet.getInt("age"));
        tourGuide.setGender(resultSet.getBoolean("gender"));
        return tourGuide;
    }

    private boolean isNumeric(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
