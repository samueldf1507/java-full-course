package academy.devdojo.maratonajava.javacore.Bmethods.test;

import academy.devdojo.maratonajava.javacore.Bmethods.domain.Employee;

public class EmployeeMain01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Samuel";
        employee.age = 19;
        employee.salaries = new double[]{1000, 2000, 3000};

        employee.printEmployee();

        System.out.println("--");
        System.out.println(employee.getSalariesAvarage(employee.salaries));
    }
}
