package com.example.JUnitTestCaseUsingMokito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpResopnse {

    private String msg;
    private int status;
    private Object data;
//	public EmpResopnse(String msg, int status, Object obj) {
//		super();
//		this.msg = msg;
//		this.status = status;
//		this.obj = obj;
//	}
    
    
    
}
