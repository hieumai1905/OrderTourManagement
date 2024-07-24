package src.DAOs.clients;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import src.DAOs.ConnectDatabase;
import src.models.Client;

public class ClientDAO implements IClientDAO {

    private static ClientDAO instance = null;
    private final Connection connectDatabase;

    private ClientDAO() {
        connectDatabase = ConnectDatabase.getConnection();
    }

    public static ClientDAO getInstance() {
        if (instance == null) {
            synchronized (ClientDAO.class) {
                if (instance == null) {
                    instance = new ClientDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public boolean add(Client client) {
        String query = "INSERT INTO clients (name, age, gender, email, phone, address) "
                + "VALUES (?, ?, ?, ?, ?)";
        return executeUpdate(query, client.getName(), client.getAge(), client.isGender(), client.getEmail(),
                client.getPhone(),
                client.getAddress()
        );
    }

    @Override
    public boolean update(Client client) {
        String query = "UPDATE clients SET name = ?, age = ?, gender = ?, email = ?, phone = ?, address = ? "
                + "WHERE client_id = ?";
        return executeUpdate(query, client.getName(), client.getAge(), client.isGender(), client.getEmail(),
                client.getPhone(), client.getAddress(), client.getClientId());
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM clients WHERE client_id = ?";
        return executeUpdate(query, key);
    }

    @Override
    public List<Client> findAll() {
        String query = "SELECT * FROM clients";
        return executeQuery(query);
    }

    private boolean executeUpdate(String query, Object... params) {
        try (PreparedStatement preparedStatement = connectDatabase.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for client");
            return false;
        }
    }

    private List<Client> executeQuery(String query, Object... params) {
        List<Client> clients = new ArrayList<>();
        try (PreparedStatement preparedStatement = connectDatabase.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    clients.add(createClientFromResultSet(resultSet));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for client");
        }
        return clients;
    }

    private Client createClientFromResultSet(ResultSet resultSet) throws SQLException {
        Client client = new Client();
        client.setClientId(resultSet.getInt("client_id"));
        client.setName(resultSet.getString("name"));
        client.setAge(resultSet.getInt("age"));
        client.setGender(resultSet.getBoolean("gender"));
        client.setEmail(resultSet.getString("email"));
        client.setPhone(resultSet.getString("phone"));
        client.setAddress(resultSet.getString("address"));
        return client;
    }

    @Override
    public List<Client> search(Object content) {
        String searchContent = "%" + content.toString().toLowerCase() + "%";
        String query = "SELECT * FROM clients WHERE client_id = ? OR LOWER(name) COLLATE SQL_Latin1_General_CP1_CI_AI LIKE ? OR LOWER(email) COLLATE SQL_Latin1_General_CP1_CI_AI LIKE ? OR phone LIKE ?";

        int searchCode = 0;
        if (isNumeric(content.toString())) {
            searchCode = Integer.parseInt(content.toString());
        }

        return executeQuery(query, searchCode, searchContent, searchContent, searchContent);
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
