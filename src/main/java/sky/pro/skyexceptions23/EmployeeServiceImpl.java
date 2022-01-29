package sky.pro.skyexceptions23;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import sky.pro.skyexceptions23.classes.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Employee[] employees = {
           new Employee("FirstName1", "LastName1"),
           new Employee("FirstName2", "LastName2"),
           new Employee("FirstName3", "LastName3")
    };




    @Override
    public String getEmployee(Integer id) {
        return getEmployee(id);
    }

    @Override
    public String getFullNameEmployee(Integer id) {
        try {
           return employees[id].getFirstname() + " " + employees[id].getLastName();
        } catch (ArrayIndexOutOfBoundsException exception) {
            return "badRequest Not Found";
        } catch (NullPointerException nullPointerException){
            return "Employee is null";
        }
    }



}
