package sky.pro.skyexceptions23;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("hi")
        public String hello() {
            return "hi";
        }
    @GetMapping(path = "/employee/{id}")
    public String getFullNameEmployee(@PathVariable("id") Integer id) {
        return getFullNameEmployee(id);
    }

}
