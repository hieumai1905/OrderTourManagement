package src.DAOs.touristattractions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import src.DAOs.ConnectDatabase;
import src.models.TouristAttraction;

public class TouristAttractionDAO implements ITouristAttractionDAO {

    private static TouristAttractionDAO instance;
    private final Connection connection;

    private TouristAttractionDAO() {
        connection = ConnectDatabase.getConnection();
    }

    public static TouristAttractionDAO getInstance() {
        if (instance == null) {
            instance = new TouristAttractionDAO();
        }
        return instance;
    }

    @Override
    public boolean add(TouristAttraction touristAttraction) {
        String query = "INSERT INTO tourist_attractions (name, address) VALUES (?, ?)";
        return executeUpdate(query, touristAttraction.getName(), touristAttraction.getAddress());
    }

    @Override
    public boolean update(TouristAttraction touristAttraction) {
        String query = "UPDATE tourist_attractions SET name = ?, address = ? WHERE tourist_attraction_id = ?";
        return executeUpdate(query, touristAttraction.getName(), touristAttraction.getAddress(), touristAttraction.getTouristAttractionId());
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM tourist_attractions WHERE tourist_attraction_id = ?";
        return executeUpdate(query, key);
    }

    @Override
    public List<TouristAttraction> findAll() {
        String query = "SELECT * FROM tourist_attractions";
        return executeQuery(query);
    }

    private boolean executeUpdate(String query, Object... params) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing update for Tourist attraction");
            return false;
        }
    }

    private List<TouristAttraction> executeQuery(String query, Object... params) {
        List<TouristAttraction> touristAttractions = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    touristAttractions.add(createTouristAttractionFromResultSet(resultSet));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing add for Hotel");
        }
        return touristAttractions;
    }

    private TouristAttraction createTouristAttractionFromResultSet(ResultSet resultSet) throws SQLException {
        TouristAttraction touristAttraction = new TouristAttraction();
        touristAttraction.setTouristAttractionId(resultSet.getInt("tourist_attraction_id"));
        touristAttraction.setName(resultSet.getString("name"));
        touristAttraction.setAddress(resultSet.getString("address"));
        return touristAttraction;
    }

    @Override
    public List<TouristAttraction> search(Object content) {
        List<TouristAttraction> touristAttractions = new ArrayList<>();
        String searchContent = "%" + content.toString().toLowerCase() + "%";
        String query = "SELECT * FROM tourist_attractions WHERE tourist_attraction_id = ? OR LOWER(name) COLLATE SQL_Latin1_General_CP1_CI_AI LIKE ?";

        int searchId = 0;
        if (isNumeric(content.toString())) {
            searchId = Integer.parseInt(content.toString());
        }

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, searchId);
            preparedStatement.setString(2, searchContent);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    TouristAttraction touristAttraction = mapResultSetToTouristAttraction(resultSet);
                    touristAttractions.add(touristAttraction);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for searching tourist attractions");
        }

        return touristAttractions;
    }

    private TouristAttraction mapResultSetToTouristAttraction(ResultSet resultSet) throws SQLException {
        int touristAttractionId = resultSet.getInt("tourist_attraction_id");
        String name = resultSet.getString("name");
        String address = resultSet.getString("address");

        TouristAttraction touristAttraction = new TouristAttraction();
        touristAttraction.setTouristAttractionId(touristAttractionId);
        touristAttraction.setName(name);
        touristAttraction.setAddress(address);

        return touristAttraction;
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
