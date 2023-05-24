
public class Employee {
    private String name;
    private int age;
    private String address;
    private double salary;
    private String position;
    private String department;

    public Employee(String name, int age, String address, double salary, String position, String department) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public String getEmployeeInfo() {
        String info = "Name: " + name + ", Age: " + age + ", Address: " + address + "\n";
        info += "Salary: " + salary + ", Position: " + position + ", Department: " + department;
        return info;
    }

 
}