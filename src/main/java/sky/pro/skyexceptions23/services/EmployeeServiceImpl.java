package sky.pro.skyexceptions23.services;

import org.springframework.stereotype.Service;
import sky.pro.skyexceptions23.interfaces.EmployeeService;
import sky.pro.skyexceptions23.exceptions.NotFoundAnyFreeSlotException;
import sky.pro.skyexceptions23.exceptions.NotFoundAnyMatchException;
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
       } catch (NullPointerException | ArrayIndexOutOfBoundsException exception){
           return String.join(" ", "No match by your request id = ", Integer.toString(id));
       }
    }

    @Override
    public String addEmployee(String firstName, String lastName) {
        try {
            employees = doubleSizeOfRepository();
        } catch (NotFoundAnyFreeSlotException notFoundAnyFreeSlotException) {
            notFoundAnyFreeSlotException.printStackTrace();
        }  employees[employees.length / 2 + 1] = new Employee(firstName, lastName);
        return firstName + " " + lastName + ": added to rep";
    }

    public Integer employeeCount() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
            count = i;
        }
        return count;
    }

    public Employee[] doubleSizeOfRepository() throws NotFoundAnyFreeSlotException{
        Integer empolyeesQTY = employeeCount();
        if (empolyeesQTY <= employees.length){
            Employee[] buffer = new Employee[empolyeesQTY * 2];
            System.arraycopy(employees, 0, buffer, 0, employees.length);
            employees = buffer;
        }
        return employees;
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        if (firstName != null && lastName != null){
            try{
                Integer id = findId(firstName, lastName);
                Integer employersQTY = employeeCount();
                for (int i = 0; i < (employersQTY - id); i++) {
                    employees[id] = employees[id + i];
                }
            } catch (NotFoundAnyMatchException exception) {
                exception.printStackTrace();
            }
        }
        return "Employer removed";
    }




    @Override
    public String findEmployee(String firstName, String lastName) {
        try {
            Integer id = findId(firstName,lastName);
            if (id != null) {
                return employees[id].toString();
                        //String.join(" ", "found on ID", Integer.toString(id), employees[id].getFirstname(), employees[id].getLastName());
            } else return "Not Found any";
        }catch (NotFoundAnyMatchException exception){
            return "Not found";
        }
    }

    public Integer findId(String firstName, String lastName) throws NotFoundAnyMatchException{
        Integer id = null;
        for (int i = 0; i < employees.length; i++) {
            if (!(employees[i].getFirstname().equals(firstName) && employees[i].getLastName().equals(lastName))) {
                continue;
            }
            id = i;
        }
        return id;
    }



}




