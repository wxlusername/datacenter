package com.terryxi.datacenter.handler;

import com.terryxi.datacenter.vo.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    public Response unknownExceptionHandler(Exception e) {
        e.printStackTrace();
        return new Response(-1,"系统未知错误");
    }
}
