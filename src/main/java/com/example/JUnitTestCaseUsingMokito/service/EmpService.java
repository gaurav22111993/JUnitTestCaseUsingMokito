package com.example.JUnitTestCaseUsingMokito.service;

import com.example.JUnitTestCaseUsingMokito.entity.Employee;
import com.example.JUnitTestCaseUsingMokito.entity.compositeKey.MainEntity;
import com.example.JUnitTestCaseUsingMokito.mapper.EmpMapper;
import com.example.JUnitTestCaseUsingMokito.repository.CompositeRepo;
import com.example.JUnitTestCaseUsingMokito.repository.EmpRepo;
import com.example.JUnitTestCaseUsingMokito.util.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;
    @Autowired
    CompositeRepo compositeRepo;

    public Employee getData(int id) {

        Optional<Employee> empResponse =  empRepo.findById(id);
        Employee employee = empResponse.get();
        return employee;
    }

    public List<EmpMapper> getAllData() {

        List<Employee> employeeList = empRepo.findAll();
        List<EmpMapper> employeeList2 = new ArrayList<>();

        for(Employee list : employeeList) {

            employeeList2.add(new EmpMapper(list.getId(), list.getName() + " " + list.getDesignation()));
        }

        System.out.println(employeeList);
        return employeeList2;
    }


    public String saveData(Employee employee) {
        String msg = Notification.sendReply();
        empRepo.save(employee);
        return employee.getName()+ msg;
    }


    public String saveStudent(MainEntity mainEntity) {
        String msg = Notification.sendReply();
        compositeRepo.save(mainEntity);
        return mainEntity.getEmail() + msg;
    }
}
