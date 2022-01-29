package sky.pro.skyexceptions23;
import sky.pro.skyexceptions23.classes.Employee;
import java.util.ArrayList;

public class Repository {

    private ArrayList<Employee> employeeArrayList;

    public Repository(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public ArrayList<Employee> addEmployee(String employeeFirstName, String employeeLastName){
        employeeArrayList.add(new Employee(employeeFirstName, employeeLastName));
        return employeeArrayList;
    }
    public ArrayList<Employee> removeEmployee(String employeeFirstName, String employeeLastName){
        employeeArrayList.remove(employeeArrayList.contains(employeeFirstName) && employeeArrayList.contains(employeeLastName));
        return employeeArrayList;
    }
    public Integer findEmployee(String employeeFirstName, String employeeLastName){
       return employeeArrayList.indexOf(employeeArrayList.contains(employeeFirstName)&&employeeArrayList.contains(employeeLastName));
    }
    public Employee getEmployee(Integer id){
        return employeeArrayList.get(id);
    }
}
