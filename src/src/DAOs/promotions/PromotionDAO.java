package src.DAOs.promotions;

import src.models.Promotion;
import src.DAOs.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PromotionDAO implements IPromotionDAO {

    private static PromotionDAO instance;
    private final Connection connection;

    private PromotionDAO() {
        connection = ConnectDatabase.getConnection();
    }

    public static PromotionDAO getInstance() {
        if (instance == null) {
            instance = new PromotionDAO();
        }
        return instance;
    }

    @Override
    public boolean add(Promotion promotion) {
        String query = "INSERT INTO promotions (start_at, end_at, discount_code, discount_rate, quantity) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDate(1, promotion.getStartAt());
            preparedStatement.setDate(2, promotion.getEndAt());
            preparedStatement.setString(3, promotion.getDiscountCode());
            preparedStatement.setInt(4, promotion.getDiscountRate());
            preparedStatement.setInt(5, promotion.getQuantity());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for adding promotion");
            return false;
        }
    }

    @Override
    public boolean update(Promotion promotion) {
        String query = "UPDATE promotions SET start_at = ?, end_at = ?, discount_code = ?, discount_rate = ?, quantity = ? WHERE promotion_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDate(1, promotion.getStartAt());
            preparedStatement.setDate(2, promotion.getEndAt());
            preparedStatement.setString(3, promotion.getDiscountCode());
            preparedStatement.setInt(4, promotion.getDiscountRate());
            preparedStatement.setInt(5, promotion.getQuantity());
            preparedStatement.setInt(6, promotion.getPromotionId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for updating promotion");
            return false;
        }
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM promotions WHERE promotion_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, key);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when executing query for deleting promotion");
            return false;
        }
    }

    @Override
    public List<Promotion> findAll() {
        List<Promotion> promotions = new ArrayList<>();
        String query = "SELECT * FROM promotions";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Promotion promotion = new Promotion();
                    promotion.setPromotionId(resultSet.getInt("promotion_id"));
                    promotion.setStartAt(resultSet.getDate("start_at"));
                    promotion.setEndAt(resultSet.getDate("end_at"));
                    promotion.setDiscountCode(resultSet.getString("discount_code"));
                    promotion.setDiscountRate(resultSet.getInt("discount_rate"));
                    promotion.setQuantity(resultSet.getInt("quantity"));
                    promotions.add(promotion);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when executing query for finding all promotions");
        }
        return promotions;
    }
}
