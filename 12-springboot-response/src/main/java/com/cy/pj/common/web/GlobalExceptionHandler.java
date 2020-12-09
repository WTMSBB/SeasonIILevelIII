package com.cy.pj.common.web;

import com.cy.pj.common.pojo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseResult doHandlerRuntimeException(RuntimeException e){
        log.error("exception is "+e.getMessage());
        return new ResponseResult(e);
    }
}
