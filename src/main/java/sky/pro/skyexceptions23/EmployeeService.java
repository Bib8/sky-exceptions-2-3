package sky.pro.skyexceptions23;

public interface EmployeeService {
    String getFullNameEmployee(Integer id);
    String addEmployee(String firstName, String lastName);
    String removeEmployee(String firstName, String lastName);
    String findEmployee(String firstName, String lastName);
}
