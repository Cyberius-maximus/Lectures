package Tutorial6;

public class Employee {
    private int empId;
    private String empName;
    private double sal;
    private String dept;

    // Default constructor
    public Employee() {
        // Initialize default values or leave them as null/0
    }

    // Parameterized constructor
    public Employee(int empId, String empName, double sal, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.dept = dept;
    }

    // Getter and Setter methods for attributes

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static void main(String[] args) {
        // Create two different Employee objects and display their values
        Employee emp1 = new Employee(1, "John", 50000, "HR");
        Employee emp2 = new Employee(2, "Alice", 60000, "IT");

        System.out.println("Employee 1 Details:");
        System.out.println("EmpId: " + emp1.getEmpId());
        System.out.println("EmpName: " + emp1.getEmpName());
        System.out.println("Salary: " + emp1.getSal());
        System.out.println("Department: " + emp1.getDept());

        System.out.println("\nEmployee 2 Details:");
        System.out.println("EmpId: " + emp2.getEmpId());
        System.out.println("EmpName: " + emp2.getEmpName());
        System.out.println("Salary: " + emp2.getSal());
        System.out.println("Department: " + emp2.getDept());
    }
}
