package ru.mirea.lab15.ex2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        EmployeeView view = new EmployeeView();
        Employee employee = retieveEmployeeFromDatebase();
        EmployeeController controller = new EmployeeController(employee, view);
        controller.updateView();

        controller.setEmployeeName("Alyona");
        controller.setEmployeeHourlyRate(600);
        controller.setEmployeeHoursWorked(35);
        controller.updateView();
    }

    public static Employee retieveEmployeeFromDatebase(){
        Employee employee = new Employee();
        employee.setName("Vladimir");
        employee.setHourlyRate(500);
        employee.setHoursWorked(40);

        return employee;
    }
}
