package com.example.JUnitTestCaseUsingMokito.excption;

import com.example.JUnitTestCaseUsingMokito.excption.custom.BadRequestExp;
import javassist.NotFoundException;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.MalformedURLException;
import java.util.Date;
import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class )
    public ResponseEntity<?> noSuchElementException(NoSuchElementException noSuchElement, WebRequest request) {

        return new ResponseEntity<>
                (new ExceptionResponse(new Date(), "No such user Present in DB ",
                        request.getDescription(false)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BadRequestExp.class )
    public ResponseEntity<?> missingRequestParam(BadRequestExp missingParam, WebRequest request) {

        return new ResponseEntity<>
                (new ExceptionResponse(new Date(),"Please Enter parmameter value",
                        request.getDescription(false)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MalformedURLException.class )
    public ResponseEntity<?> malformedURLException(MalformedURLException missingParam, WebRequest request) {

        return new ResponseEntity<>
                (new ExceptionResponse(new Date(),"Worng URL",
                        request.getDescription(false)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class )
    public ResponseEntity<?> notFoundException(NotFoundException notFoundException, WebRequest request) {

        return new ResponseEntity<>
                (new ExceptionResponse(new Date(),"Worng URL",
                        request.getDescription(false)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class )
    public ResponseEntity<?> globalElementException(Exception noSuchElement, WebRequest request) {

        return new ResponseEntity<>
                (new ExceptionResponse(new Date(), noSuchElement.getMessage(),
                        request.getDescription(false)), HttpStatus.EXPECTATION_FAILED);
    }
}
