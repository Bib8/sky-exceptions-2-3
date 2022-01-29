package sky.pro.skyexceptions23;

import org.springframework.stereotype.Service;
import sky.pro.skyexceptions23.classes.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Employee[] employees = {
           new Employee("FirstName1", "LastName1"),
           new Employee("FirstName2", "LastName2"),
           new Employee("FirstName3", "LastName3")
    };




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
            System.arraycopy(employees, 0, buffer, 0, employees.length);
            buffer[arrayLength - 1] = new Employee(firstName, lastName);
            employees = buffer;}
        else {
            return "data missed, pls fill firstname and lastname";
        }
        return firstName + " " + lastName + ": added to rep";
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        Employee[] buffer = new Employee[employees.length - 1];
        if (firstName != null && lastName != null){
            for (int i = 0; i < employees.length; i++) {
                    if (!employees[i].getFirstname().equals(firstName) && !employees[i].getLastName().equals(lastName)){
                        buffer[i] = employees[i];
                    }
            }
            employees = buffer;
        }
        return "done";
    }

    @Override
    public String findEmployee(String firstName, String lastName) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstname().equals(firstName) && employees[i].getLastName().equals(lastName)) {
                index = i;
            }
        }

        return String.join(" ", "found on ID", Integer.toString(index), employees[index].getFirstname(), employees[index].getLastName());
    }

}
