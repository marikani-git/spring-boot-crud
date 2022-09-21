package org.mari.springbootsmsapi.repository;


import org.mari.springbootsmsapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.name like concat ('%', :searchText, '%')")
    List<Employee> searchEmployee(String searchText);

}
