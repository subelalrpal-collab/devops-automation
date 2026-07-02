package main.java.com;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String department;
    private Integer salary;

    public Employee() {
    }

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }
}
public class MainExe {

    public static void main(String[] args) {
    	
    	Map<Integer, String> map = new HashMap<>();

        List<Employee> employees = List.of(
                new Employee("Ram", "IT", 100),
                new Employee("Shyam", "HR", 200),
                new Employee("Jon", "Fin", 300),
                new Employee("Ravi", "IT", 200),
                new Employee("Hari", "Fin", 500),
                new Employee("Deepak", "HR", 200),
                new Employee("Dev", "IT", 400));

        // Employee salary greater than 250

        List<Employee> salaryGr250 = employees.stream()
                .filter(emp -> emp.getSalary() > 250)
                .collect(Collectors.toList());

        System.out.println(salaryGr250);


    }
}
