package com.terryxi.datacenter.vo;

public class Response<T> {

    private int status = 1;
    private String errorMsg;
    private T data;

    public Response() {
        super();
    }

    public Response(T data) {
        this.data = data;
    }

    public Response(int status ,String errorMsg) {
        this.status = status;
        this.errorMsg = errorMsg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
