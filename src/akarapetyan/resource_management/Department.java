package akarapetyan.resource_management;

public class Department {

    private String departmentName;
    Employee [] employees;
    Employee departmentHeadEmployee;
    private double departmentSalary;

    public Department (String departmentName){
    }

    public Department (String departmentName, Employee [] employees, Employee departmentHeadEmployee, double departmentSalary){
        this.departmentName = departmentName;
        this.employees = employees;
        this.departmentHeadEmployee = departmentHeadEmployee;
        this.departmentSalary = departmentSalary;
    }

    public Employee [] setDepartmentforEmployee (String depName, Employee employee){
        departmentName = depName;
        Employee [] employee_update = new Employee[employees.length +1];
        for (int i = 0; i < employees.length; i++)
        {
            employee_update[i] = employees[i];
        }
        employee_update [employees.length] = employee;
        employees = employee_update;
        return employees;
    }


    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setDepartmentHeadEmployee(Employee departmentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public void setDepartmentSalary(double departmentSalary) {
        this.departmentSalary = departmentSalary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmployee;
    }

    public double getDepartmentSalary() {
        return departmentSalary;
    }

    @Override
    public String toString() {
        return "Department name: " + departmentName + "\n\nEmployee1: " + employees[0].getPerson() + employees[0].toString() + "\n\nEmployee2: " +
                employees[1].getPerson() + employees[1].toString() +"\n\nDepartment Head: " + departmentHeadEmployee.getPerson()
                + "\nDepartment salary: " + departmentSalary;
    }


}
