package src.DAOs.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import src.DAOs.ConnectDatabase;
import src.models.Employee;
import src.models.EmployeeLogin;

public class EmployeeDAO implements IEmployeeDAO {

    private static EmployeeDAO instance = null;
    private final Connection connectDatabase;

    private EmployeeDAO() {
        connectDatabase = ConnectDatabase.getConnection();
    }

    public static EmployeeDAO getInstance() {
        if (instance == null) {
            synchronized (EmployeeDAO.class) {
                if (instance == null) {
                    instance = new EmployeeDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public boolean add(Employee employee) {
        String query = "INSERT INTO employees (name, phone, email, password, age, gender, address, username, role, status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return executeUpdate(query, employee.getName(), employee.getPhone(), employee.getEmail(), employee.getPassword(),
                employee.getAge(), employee.isGender(), employee.getAddress(), employee.getUsername(),
                employee.getRole(), employee.getStatus());
    }

    @Override
    public boolean update(Employee employee) {
        String query = "UPDATE employees SET name = ?, phone = ?, email = ?, password = ?, age = ?, gender = ?, "
                + "address = ?, username = ?, role = ?, status = ? WHERE employee_id = ?";
        return executeUpdate(query, employee.getName(), employee.getPhone(), employee.getEmail(), employee.getPassword(),
                employee.getAge(), employee.isGender(), employee.getAddress(), employee.getUsername(),
                employee.getRole(), employee.getStatus(), employee.getEmployeeId());
    }

    @Override
    public boolean delete(Long key) {
        String query = "DELETE FROM employees WHERE employee_id = ?";
        return executeUpdate(query, key);
    }

    @Override
    public List<Employee> findAll() {
        String query = "SELECT * FROM employees";
        return executeQuery(query);
    }

    private boolean executeUpdate(String query, Object... params) {
        try (PreparedStatement preparedStatement = connectDatabase.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error when excute query for employee");
            return false;
        }
    }

    private List<Employee> executeQuery(String query, Object... params) {
        List<Employee> employees = new ArrayList<>();
        try (PreparedStatement preparedStatement = connectDatabase.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    employees.add(createEmployeeFromResultSet(resultSet));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error when excute query for employee");
        }
        return employees;
    }

    private Employee createEmployeeFromResultSet(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getInt("employee_id"));
        employee.setName(resultSet.getString("name"));
        employee.setPhone(resultSet.getString("phone"));
        employee.setEmail(resultSet.getString("email"));
        employee.setPassword(resultSet.getString("password"));
        employee.setAge(resultSet.getInt("age"));
        employee.setGender(resultSet.getBoolean("gender"));
        employee.setAddress(resultSet.getString("address"));
        employee.setUsername(resultSet.getString("username"));
        employee.setRole(resultSet.getBoolean("role"));
        employee.setStatus(resultSet.getBoolean("status"));
        return employee;
    }

    @Override
    public Employee login(EmployeeLogin employeeLogin) {
        String query = "SELECT * FROM employees WHERE username = ? AND password = ?";
        try {
            PreparedStatement preparedStatement = connectDatabase.prepareStatement(query);
            preparedStatement.setString(1, employeeLogin.getUsername());
            preparedStatement.setString(2, employeeLogin.getPassword());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return createEmployeeFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            System.out.println("Error when login");
        }

        return null;
    }

    @Override
    public List<Employee> search(Object content) {
        String searchContent = "%" + content.toString().toLowerCase() + "%";
        String query = "SELECT * FROM employees WHERE employee_id = ? OR LOWER(name) COLLATE SQL_Latin1_General_CP1_CI_AI LIKE ? OR LOWER(email) COLLATE SQL_Latin1_General_CP1_CI_AI LIKE ? OR phone LIKE ?";

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
