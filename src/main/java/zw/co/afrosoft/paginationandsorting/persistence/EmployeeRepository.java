package zw.co.afrosoft.paginationandsorting.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import zw.co.afrosoft.paginationandsorting.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
