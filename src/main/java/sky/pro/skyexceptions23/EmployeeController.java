package sky.pro.skyexceptions23;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

@GetMapping(path = "/employee/{id}")
    public String getFullNameEmployee(@PathVariable("id") Integer id) {
        return employeeService.getFullNameEmployee(id);
    }
@GetMapping(path = "/addEmployee")
    public String addEmployee(@RequestParam("fn") String firstname, @RequestParam("ln") String lastname) {
        return employeeService.addEmployee(firstname, lastname);
    }
@GetMapping(path = "/RMEmployee")
    public String removeEmployee(@RequestParam("fn") String firstname, @RequestParam("ln") String lastname) {
        return employeeService.removeEmployee(firstname, lastname);
    }

}
