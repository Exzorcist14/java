package ru.mirea.lab15.ex2;

class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }

    public String getEmployeeName(){
        return model.getName();
    }

    public void setEmployeeHourlyRate(int hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public int getEmployeeHourlyRate() {
        return model.getHourlyRate();
    }

    public void setEmployeeHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public int getEmployeeHoursWorked() {
        return model.getHoursWorked();
    }

    public int getEmployeeSalary() {
        return model.calculateSalary();
    }

    public void updateView() {
        view.printEmployeeDetails(getEmployeeName(), getEmployeeSalary());
    }
}