package Modul9.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class Filtering {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("erick", 3500));
        listEmp.add(new Employee("donny", 2500));
        listEmp.add(new Employee("fauzan", 4000));

        System.out.println("Employee with salary minimal 3000");
        for (Employee e : listEmp) {
            if (e.getSalary() >= 3000) {
                System.out.println(e);
            }
        }

        System.out.println("\nEmployee with salary minimal 3000 (Lambda)");
        List<Employee> temp = listEmp.stream()
                .filter(e -> e.getSalary() >= 3000)
                .collect(Collectors.toList());
        temp.forEach(System.out::println);

        System.out.println("\nEmployee erick");
        for (Employee e : listEmp) {
            if (e.getName().equals("erick")) {
                System.out.println(e);
            }
        }

        System.out.println("\nEmployee erick (Lambda)");
        System.out.println(listEmp.stream()
                .filter(e -> e.getName().equals("erick"))
                .findFirst()
                .orElse(null));
    }
}