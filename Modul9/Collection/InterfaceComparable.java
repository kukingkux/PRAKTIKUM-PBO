package Modul9.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
    }
    public String getName() {
    return name;
    }
    public int getSalary() {
    return salary;
    }
    @Override
    public String toString() {
    return "name=" + name + ", salary=" + salary;
    }
    @Override
    public int compareTo(Employee e) {
    return name.compareTo(e.name);
    }
    public static void main(String[] args) {
    List<Employee> listEmp = new ArrayList();
        listEmp.add(new Employee("bobby", 3000));
        listEmp.add(new Employee("erick", 1600));
        listEmp.add(new Employee("rey", 2500));
        listEmp.add(new Employee("anna", 3500));
        Collections.sort(listEmp);
        listEmp.forEach(System.out::println);
    }
}
