package employeemanagementsystem;

public class Employee {
    private int employeeID;
    private String name;
    private String position;
    private double salary;

    public Employee(int employeeID, String name, String position, double salary){
         this.employeeID=employeeID;
         this.name=name;
         this.position=position;
         this.salary=salary;
     }
     public int getEmployeeID(){
         return employeeID;
     }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "employeemanagementsystem.Employee Id:"+ employeeID+",name:"+name+",position:"+position+",salary:"+salary;
    }
}
