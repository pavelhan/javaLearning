package com.company;

public class Employee implements Comparable<Employee>{

    public int salary;

    public Employee(int salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee other) {
        return Integer.compare(salary, other.salary);
    }

    public int getSalary() {
        return salary;
    }
}
