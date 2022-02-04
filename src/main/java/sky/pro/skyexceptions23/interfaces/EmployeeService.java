package sky.pro.skyexceptions23.interfaces;

import sky.pro.skyexceptions23.exceptions.NotFoundAnyMatchException;

public interface EmployeeService {
    String getFullNameEmployee(Integer id) throws NullPointerException;
    String addEmployee(String firstName, String lastName);
    String removeEmployee(String firstName, String lastName) throws NotFoundAnyMatchException;
    String findEmployee(String firstName, String lastName) throws NotFoundAnyMatchException;

    String updateEmployee(String firstName, String lastName, Integer id);
    String addEmployeePerson(String firstName, String lastName);

    String deleteEmployee(Integer id);

}
