package com.example.JUnitTestCaseUsingMokito.controller;

import com.example.JUnitTestCaseUsingMokito.entity.Employee;
import com.example.JUnitTestCaseUsingMokito.entity.compositeKey.MainEntity;
import com.example.JUnitTestCaseUsingMokito.model.EmpResopnse;
import com.example.JUnitTestCaseUsingMokito.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;


    @GetMapping("/main/userdata")
    public ResponseEntity<EmpResopnse> getData(@RequestParam int id) {

        return ResponseEntity.ok().body(new EmpResopnse("Success", 2, empService.getData(id)));
    }

    @GetMapping("/main/alluserdata")
    public ResponseEntity<EmpResopnse> getAllData() {

        return ResponseEntity.ok().body(new EmpResopnse("Success", 2, empService.getAllData()));
    }

    @PostMapping("/saveuser")
    public ResponseEntity<EmpResopnse> saveData(@RequestBody Employee employee){
        String msg = empService.saveData(employee);
        return ResponseEntity.ok().body(new EmpResopnse(msg, 2, employee));
    }

    @PostMapping("/savestudent")
    public ResponseEntity<EmpResopnse> saveStudent(@RequestBody MainEntity mainEntity){
        String msg = empService.saveStudent(mainEntity);
        return ResponseEntity.ok().body(new EmpResopnse(msg, 2, mainEntity));
    }
}
