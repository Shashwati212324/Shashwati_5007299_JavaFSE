package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        ems.addEmployee(new Employee("E001", "Alice Smith", "Manager", 75000));
        ems.addEmployee(new Employee("E002", "Bob Brown", "Developer", 60000));
        ems.addEmployee(new Employee("E003", "Charlie Johnson", "Designer", 55000));
        System.out.println("Employee List:");
        ems.traverseEmployees();

        System.out.println("\nSearching for employee with ID E002:");
        Employee employee = ems.searchEmployeeById("E002");
        if (employee != null) {
            System.out.println("Found: " + employee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee with ID E001:");
        ems.deleteEmployeeById("E001");

        System.out.println("\nEmployee List after deletion:");
        ems.traverseEmployees();
    }
}
