package src.DAOs.hotels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import src.DAOs.ConnectDatabase;
import src.models.Hotel;

public class HotelDAO implements IHotelDAO {

    private static HotelDAO instance;
    private final Connection connection;

    private HotelDAO() {
        connection = ConnectDatabase.getConnection();
    }

    public static HotelDAO getInstance() {
        if (instance == null) {
            instance = new HotelDAO();
        }
        return instance;
    }

    @Override
    public boolean add(Hotel hotel) {
        String query = "INSERT INTO hotels (name, address, phone, tourist_attraction_id) VALUES (?, ?, ?, ?)";
        return executeUpdate(query, hotel.getName(), hotel.getAddress(), hotel.getPhone(), hotel.getTouristAttractionId());
    }

    @Override
    public boolean update(Hotel hotel) {
        String query = "UPDATE hotels SET name = ?, address = ?, phone = ?, tourist_attraction_id = ? WHERE hotel_id = ?";
        return executeUpdate(query, hotel.getName(), hotel.getAddress(), hotel.getPhone(), hotel.getTouristAttractionId(), hotel.getHotelId());
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM hotels WHERE hotel_id = ?";
        return executeUpdate(query, key);
    }

    @Override
    public List<Hotel> findAll() {
        String query = "SELECT * FROM hotels";
        return executeQuery(query);
    }

    @Override
    public List<Hotel> search(Object content) {
        List<Hotel> hotels = new ArrayList<>();
        String searchContent = "%" + content.toString().toLowerCase() + "%";
        String query = "SELECT * FROM hotels WHERE hotel_id = ? OR LOWER(name) COLLATE SQL_Latin1_General_CP1_CI_AI LIKE ? OR phone LIKE ?";

        int searchCode = 0;
        if (isNumeric(content.toString())) {
            searchCode = Integer.parseInt(content.toString());
        }

        return executeQuery(query, searchCode, searchContent, searchContent);
    }

    private boolean executeUpdate(String query, Object... params) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing update for Hotel: " + e.getMessage());
            return false;
        }
    }

    private List<Hotel> executeQuery(String query, Object... params) {
        List<Hotel> hotels = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    hotels.add(createHotelFromResultSet(resultSet));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for Hotel: " + e.getMessage());
        }
        return hotels;
    }

    private Hotel createHotelFromResultSet(ResultSet resultSet) throws SQLException {
        Hotel hotel = new Hotel();
        hotel.setHotelId(resultSet.getInt("hotel_id"));
        hotel.setName(resultSet.getString("name"));
        hotel.setAddress(resultSet.getString("address"));
        hotel.setPhone(resultSet.getString("phone"));
        hotel.setTouristAttractionId(resultSet.getInt("tourist_attraction_id"));
        return hotel;
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
