package src.DAOs.employees;

import java.util.List;
import src.DAOs.IGeneralDAO;
import src.models.Employee;
import src.models.EmployeeLogin;

public interface IEmployeeDAO extends IGeneralDAO<Employee> {

    Employee login(EmployeeLogin employeeLogin);

    List<Employee> search(Object content);
}
