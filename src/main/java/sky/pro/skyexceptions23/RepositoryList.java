package sky.pro.skyexceptions23;

import sky.pro.skyexceptions23.classes.Employee;

import java.util.List;

public class RepositoryList {
    private List<Employee> employees;

    public RepositoryList(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
