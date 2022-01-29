package sky.pro.skyexceptions23.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sky.pro.skyexceptions23.interfaces.EmployeeService;
import sky.pro.skyexceptions23.exceptions.NotFoundAnyMatchException;

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
@GetMapping(path = "/rmEmployee")
    public String removeEmployee(@RequestParam("fn") String firstname, @RequestParam("ln") String lastname) throws NotFoundAnyMatchException {
        return employeeService.removeEmployee(firstname, lastname);
    }
    @GetMapping(path = "/findEmployee")
    public String findEmployee(@RequestParam("fn") String firstname,
                               @RequestParam("ln") String lastname) throws NotFoundAnyMatchException {
        return employeeService.findEmployee(firstname, lastname);
    }
    @GetMapping(path = "/employee/add")
    public String addEmployeeIvanov(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname) {
        return employeeService.addEmployee(firstname, lastname);
    }
    @GetMapping(path = "/employee/remove")
    public String removeEmployeeIvanov(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname) throws NotFoundAnyMatchException {
        return employeeService.removeEmployee(firstname, lastname);
    }
    @GetMapping(path = "/employee/find")
    @RequestMapping(value = "/employee/find", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String findEmployeeIvanov(@RequestParam("firstName") String firstname,
                               @RequestParam("lastName") String lastname) throws NotFoundAnyMatchException {
        return employeeService.findEmployee(firstname, lastname);
    }
}
