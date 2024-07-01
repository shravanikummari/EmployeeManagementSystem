package employeemanagementsystem;
import java.util.ArrayList;

public class EmployeeManager implements EmployeeOperations {
    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    @Override
    public void removeEmployee(int employeeID) {
        Employee toRemove = null;
        for (Employee emp : employees) {
            if (emp.getEmployeeID() == employeeID) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    @Override
    public void updateEmployee(int employeeId, String name, String position, double salary) {

    }

    @Override
    public void updateEmployee(Employee updatedEmployee) {
        for (Employee emp : employees) {
            if (emp.getEmployeeID() == updatedEmployee.getEmployeeID()) {
                emp.setName(updatedEmployee.getName());
                emp.setPosition(updatedEmployee.getPosition());
                emp.setSalary(updatedEmployee.getSalary());
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    @Override
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }
}