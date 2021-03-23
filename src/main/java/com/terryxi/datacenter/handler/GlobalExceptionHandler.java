package com.terryxi.datacenter.handler;

import com.terryxi.datacenter.vo.Response;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
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
    @ExceptionHandler(UnauthenticatedException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response unauthenticatedExceptionHandler(UnauthenticatedException e) {
//        e.printStackTrace();
        return new Response(401,"未登录");
    }
    @ExceptionHandler(IncorrectCredentialsException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response incorrectCredentialsException(IncorrectCredentialsException e) {
//        e.printStackTrace();
        return new Response(2,"账号密码不匹配");
    }
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response unauthorizedException(UnauthorizedException e) {
//        e.printStackTrace();
        return new Response(403,"无权限访问");
    }
}
