package com.cy.pj.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ResponseResult {
    private static final int SUCCESS = 1;
    private static final int ERROR = 0;

    private Integer status=SUCCESS;
    private String message="not assign yet";
    private Object data;

    public ResponseResult(Throwable e){
        this.status=0;
        this.message=e.getMessage();
    }
    public ResponseResult(String message){
        this.message=message;
    }
    public ResponseResult(Integer status){
        this.status=status;
    }
    public ResponseResult(Object data){
        this.data=data;
    }
}
