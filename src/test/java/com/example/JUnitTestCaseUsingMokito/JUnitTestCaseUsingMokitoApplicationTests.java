package com.example.JUnitTestCaseUsingMokito;

import com.example.JUnitTestCaseUsingMokito.entity.CompanyInfo;
import com.example.JUnitTestCaseUsingMokito.entity.Employee;
import com.example.JUnitTestCaseUsingMokito.repository.EmpRepo;
import com.example.JUnitTestCaseUsingMokito.service.EmpService;
import com.example.JUnitTestCaseUsingMokito.util.Notification;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.powermock.api.mockito.PowerMockito;


//@RunWith(SpringRunner.class)
//@SpringBootTest

//@RunWith(PowerMockRunner.class)
//@PrepareForTest(fullyQualifiedNames = "com.example.JUnitTestCaseUsingMokito")

class JUnitTestCaseUsingMokitoApplicationTests {
//    @Autowired
//    EmpService empService;
//
//    @MockBean
//    EmpRepo empRepo;
//
//    @Test
//    public void getUsersTest() {
//        CompanyInfo obj = new CompanyInfo();
//        when(empRepo.findAll()).thenReturn(Stream.of(
//                new Employee(12, "Raju","cleark", 5000, obj ),
//                new Employee(101, "Nilesh","wardboy",2000, obj))
//                .collect(Collectors.toList()));
//        assertEquals(2, empService.getAllData().size());
//
//    }


//    @InjectMocks
//    EmpService empService;
//
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(Notification.class);
//    }
//    @Test
//    public void testStaticmethod() {
//        CompanyInfo obj = new CompanyInfo();
//        Employee emp = new Employee(12, "Raju","cleark", 5000, obj );
//
//        PowerMockito.mockStatic(Notification.class);
//
//    }
}
