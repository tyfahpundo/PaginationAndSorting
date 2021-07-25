package zw.co.afrosoft.paginationandsorting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.co.afrosoft.paginationandsorting.domain.Employee;
import zw.co.afrosoft.paginationandsorting.persistence.EmployeeRepository;


public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repo;

    @Override
    public Page<Employee> getAllEmployees(Pageable pageable) {
        Page<Employee> pageResult = repo.findAll(pageable);
        return  pageResult;
    }
}
