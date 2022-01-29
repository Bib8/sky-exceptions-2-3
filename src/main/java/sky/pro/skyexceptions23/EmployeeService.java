package sky.pro.skyexceptions23;

public interface EmployeeService {
    String getEmployee(Integer id);
    String getFullNameEmployee(Integer id);
    String addEmployee(String firstName, String lastName);
    String removeEmployee(String firstName, String lastName);
    String findEmployee(String firstName, String lastName);
}
