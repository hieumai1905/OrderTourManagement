package src.DAOs.billdetails;

import src.models.BillDetail;
import src.DAOs.ConnectDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillDetailDAO implements IBillDetailDAO {

    private static BillDetailDAO instance;
    private final Connection connection;

    private BillDetailDAO() {
        connection = ConnectDatabase.getConnection();
    }

    public static BillDetailDAO getInstance() {
        if (instance == null) {
            instance = new BillDetailDAO();
        }
        return instance;
    }

    @Override
    public boolean add(BillDetail billDetail) {
        String query = "INSERT INTO bill_details (quantity, unit_price, tour_id, bill_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, billDetail.getQuantity());
            preparedStatement.setInt(2, billDetail.getUnitPrice());
            preparedStatement.setInt(3, billDetail.getTourId());
            preparedStatement.setInt(4, billDetail.getBillId());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1);
                    billDetail.setBillDetailId(generatedId);
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for adding bill detail");
        }
        return false;
    }

    @Override
    public boolean update(BillDetail billDetail) {
        String query = "UPDATE bill_details SET quantity = ?, unit_price = ?, tour_id = ?, bill_id = ? WHERE bill_detail_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, billDetail.getQuantity());
            preparedStatement.setInt(2, billDetail.getUnitPrice());
            preparedStatement.setInt(3, billDetail.getTourId());
            preparedStatement.setInt(4, billDetail.getBillId());
            preparedStatement.setInt(5, billDetail.getBillDetailId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for updating bill detail");
        }
        return false;
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM bill_details WHERE bill_detail_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, key);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for deleting bill detail");
        }
        return false;
    }

    @Override
    public List<BillDetail> findAll() {
        List<BillDetail> billDetails = new ArrayList<>();
        String query = "SELECT * FROM bill_details";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    BillDetail billDetail = new BillDetail();
                    billDetail.setBillDetailId(resultSet.getInt("bill_detail_id"));
                    billDetail.setQuantity(resultSet.getInt("quantity"));
                    billDetail.setUnitPrice(resultSet.getInt("unit_price"));
                    billDetail.setTourId(resultSet.getInt("tour_id"));
                    billDetail.setBillId(resultSet.getInt("bill_id"));
                    billDetails.add(billDetail);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for finding all bill details");
        }
        return billDetails;
    }

    @Override
    public List<BillDetail> findAllByBillId(int billId) {
        List<BillDetail> billDetails = new ArrayList<>();
        String query = "SELECT * FROM bill_details WHERE bill_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, billId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    BillDetail billDetail = new BillDetail();
                    billDetail.setBillDetailId(resultSet.getInt("bill_detail_id"));
                    billDetail.setQuantity(resultSet.getInt("quantity"));
                    billDetail.setUnitPrice(resultSet.getInt("unit_price"));
                    billDetail.setTourId(resultSet.getInt("tour_id"));
                    billDetail.setBillId(resultSet.getInt("bill_id"));
                    billDetails.add(billDetail);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for finding bill details by bill id");
        }
        return billDetails;
    }
}
