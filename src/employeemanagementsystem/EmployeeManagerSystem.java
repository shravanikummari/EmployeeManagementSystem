package employeemanagementsystem;

import java.util.Scanner;

public class EmployeeManagerSystem {
    public static void main(String[] args) {
        EmployeeManager manager=new EmployeeManager();
        Scanner scanner= new Scanner(System.in);
        boolean running =true;
        while (running){
            System.out.println("Employee Management System");
            System.out.println("1.add employee:");
            System.out.println("2.remove employee:");
            System.out.println("3.update employee:");
            System.out.println("4.display employees:");
            System.out.println("5.exit");
            System.out.println("choose an option");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Employee Id:");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Employee Name:");
                    String name=scanner.nextLine();
                    System.out.println("Enter Employee Position:");
                    String position=scanner.nextLine();
                    System.out.println("Enter Employee Salary");
                    double salary=scanner.nextInt();
                    Employee NewEmployee=new Employee(id,name,position,salary);
                    manager.addEmployee(NewEmployee);
                    break;
                case 2:
                    System.out.println("enter employee id to remove:");
                    int removeId=scanner.nextInt();
                    manager.removeEmployee(removeId);
                    break;
                case 3:
                    System.out.println("Enter employee id to update:");
                    int updateId= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new Name:");
                    String newname=scanner.nextLine();
                    System.out.println("Enter new position:");
                    String newPosition=scanner.nextLine();
                    System.out.println("Enter new salary:");
                    double newSalary=scanner.nextInt();
                    Employee updtedemployee=new Employee(updateId,newname,newPosition,newSalary);
                    manager.updateEmployee(updtedemployee);
                    break;
                case 4:
                    manager.displayEmployees();
                    break;
                case 5:
                    running=false;
                    break;
                default:
                    System.out.println("Invalid option.please try again.");
            }
        }
        scanner.close();
        System.out.println("System exited.");
    }
}
