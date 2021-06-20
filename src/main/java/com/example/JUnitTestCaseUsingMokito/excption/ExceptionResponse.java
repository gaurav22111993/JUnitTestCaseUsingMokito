package com.example.JUnitTestCaseUsingMokito.excption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    private Date timeStamp;
    private String msg;
    private String details;

}
