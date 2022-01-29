package sky.pro.skyexceptions23;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Repository employeesRepository;

    {
        employeesRepository.addEmployee("Name1", "LastName1");
        employeesRepository.addEmployee("Name2", "LastName2");
        employeesRepository.addEmployee("Name3", "LastName3");
        employeesRepository.addEmployee("Name4", "LastName4");
        employeesRepository.addEmployee("Name5", "LastName5");
        employeesRepository.addEmployee("Name6", "LastName6");
        employeesRepository.addEmployee("Name7", "LastName7");
    }


    @Override
    public String getEmployee(Integer id) {
        return getEmployee(id);
    }

    @Override
    public Object getFullNameEmployee(Integer id) {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        try {
            return employeesRepository.getEmployee(id);
        } catch (ArrayIndexOutOfBoundsException exception) {
            return "badRequest Not Found";
        } catch (NullPointerException nullPointerException){
            return "Employee is null";
        }
    }



}
