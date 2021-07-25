package zw.co.afrosoft.paginationandsorting.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.afrosoft.paginationandsorting.domain.Employee;
import zw.co.afrosoft.paginationandsorting.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public ResponseEntity<Page<Employee>> getAllEmployees(@PageableDefault Pageable pageable){
        Page<Employee> list = employeeService.getAllEmployees(pageable);

        return new ResponseEntity<Page<Employee>>(list, HttpStatus.OK);
    }
}
