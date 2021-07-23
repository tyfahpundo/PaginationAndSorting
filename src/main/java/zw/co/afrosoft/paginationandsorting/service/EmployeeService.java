package zw.co.afrosoft.paginationandsorting.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.co.afrosoft.paginationandsorting.domain.Employee;

import java.util.List;

public interface EmployeeService {
    Page<Employee> getAllEmployees(Pageable pageable);
}
