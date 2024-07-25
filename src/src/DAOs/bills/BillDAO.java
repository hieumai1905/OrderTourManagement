package src.DAOs.bills;

import src.models.Bill;
import src.DAOs.ConnectDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillDAO implements IBillDAO {

    private static BillDAO instance;
    private final Connection connection;

    private BillDAO() {
        connection = ConnectDatabase.getConnection();
    }

    public static BillDAO getInstance() {
        if (instance == null) {
            instance = new BillDAO();
        }
        return instance;
    }

    @Override
    public boolean add(Bill bill) {
        String query = "INSERT INTO bills (total_price, pay_at, client_id, discount, employee_id) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, bill.getTotalPrice());
            preparedStatement.setDate(2, bill.getPayAt());
            preparedStatement.setInt(3, bill.getClientId());
            preparedStatement.setDouble(4, bill.getDiscount());
            preparedStatement.setInt(5, bill.getEmployeeId());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1);
                    bill.setBillId(generatedId);
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for adding bill");
        }
        return false;
    }

    @Override
    public boolean update(Bill bill) {
        String query = "UPDATE bills SET total_price = ?, pay_at = ?, client_id = ?, discount = ?, employee_id = ? WHERE bill_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, bill.getTotalPrice());
            preparedStatement.setDate(2, bill.getPayAt());
            preparedStatement.setInt(3, bill.getClientId());
            preparedStatement.setDouble(4, bill.getDiscount());
            preparedStatement.setInt(5, bill.getEmployeeId());
            preparedStatement.setInt(6, bill.getBillId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for updating bill");
        }
        return false;
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM bills WHERE bill_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, key);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for deleting bill");
        }
        return false;
    }

    @Override
    public List<Bill> findAll() {
        List<Bill> bills = new ArrayList<>();
        String query = "SELECT * FROM bills";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Bill bill = new Bill();
                    bill.setBillId(resultSet.getInt("bill_id"));
                    bill.setTotalPrice(resultSet.getInt("total_price"));
                    bill.setPayAt(resultSet.getDate("pay_at"));
                    bill.setClientId(resultSet.getInt("client_id"));
                    bill.setDiscount(resultSet.getDouble("discount"));
                    bill.setEmployeeId(resultSet.getInt("employee_id"));
                    bills.add(bill);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for finding all bills");
        }
        return bills;
    }
}
