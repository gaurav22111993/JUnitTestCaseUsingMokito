package com.example.JUnitTestCaseUsingMokito.repository;

import com.example.JUnitTestCaseUsingMokito.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

    @Query("SELECT new com.example.JUnitTestCaseUsingMokito.entity.Employee(e.id, e.name) FROM Employee e ")
    List<Employee> findNameAndId();
}
