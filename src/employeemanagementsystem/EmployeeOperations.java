package employeemanagementsystem;
import java.util.ArrayList;
public interface EmployeeOperations {
    void addEmployee(Employee employee);
    void removeEmployee(int employeeId);
    void updateEmployee(int employeeId,String name, String position,double salary);

    void updateEmployee(Employee updatedEmployee);

    void displayEmployees();
}
