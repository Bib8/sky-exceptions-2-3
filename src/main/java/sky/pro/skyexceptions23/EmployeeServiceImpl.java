package sky.pro.skyexceptions23;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import sky.pro.skyexceptions23.classes.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl<employees> implements EmployeeService {

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
            return String.join(" ", employees[id].getFirstname(), employees[id].getLastName());
           //return employees[id].getFirstname() + " " + employees[id].getLastName();
        } catch (ArrayIndexOutOfBoundsException exception) {
            return "badRequest Not Found";
        }
    }

    @Override
    public String addEmployee(String firstName, String lastName) {
        int arrayLength = employees.length + 1;
        Employee[] buffer = new Employee[arrayLength];
        if (firstName != null && lastName != null){
            for (int i = 0; i < employees.length; i++) {

                    buffer[i] = employees[i];


            }
            buffer[arrayLength - 1] = new Employee(firstName, lastName);
            employees = buffer;}
        else {
            return "data missed, pls fill firstname and lastname";
        }
        return firstName + " " + lastName + ": added to rep";
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        Employee[] buffer = new Employee[employees.length];
        if (firstName != null && lastName != null){
            for (int i = 0; i < employees.length; i++) {
                    if (!employees[i].equals(firstName) && !employees[i].equals(lastName)){
                        buffer[i] = employees[i];
                        employees[i] = buffer [i];
                    }
            }
            employees = buffer;
        }
        return "done";
    }

    @Override
    public String findEmployee(String firstName, String lastName) {
        return null;
    }


}
