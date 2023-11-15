package ru.mirea.lab15.ex2;

class Employee {
    private String name;
    private int hourlyRate;
    private int hoursWorked;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}