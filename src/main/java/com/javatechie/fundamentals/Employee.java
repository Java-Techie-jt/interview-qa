package com.javatechie.fundamentals;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {

    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(101, "Basant");
        Employee employee2 = new Employee(101, "Basant");

        System.out.println("is hashcode() same : " + (employee1.hashCode() == employee2.hashCode()));
        System.out.println("is equals() same : " + (employee1.equals(employee2)));


        Set<Employee> employees=new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees);

    }
}
