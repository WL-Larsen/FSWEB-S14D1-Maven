package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer " + getName() + " starts to architect system.");
        setSalary(getSalary() * 1.2); // Increase salary by 20%
    }
}
