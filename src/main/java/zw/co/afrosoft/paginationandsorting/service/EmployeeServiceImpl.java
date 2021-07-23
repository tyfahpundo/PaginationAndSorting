package zw.co.afrosoft.paginationandsorting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import zw.co.afrosoft.paginationandsorting.domain.Employee;
import zw.co.afrosoft.paginationandsorting.persistence.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repo;

    @Override
    public Page<Employee> getAllEmployees(Pageable pageable) {
        Page<Employee> pageResult = repo.findAll(pageable);
        return  pageResult;
    }
}
