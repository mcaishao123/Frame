package com.qianzhihe.base.rx;

public class BaseException extends Throwable{

    private int status;
    private String message;

    public BaseException(int status, String message) {
        this.status = status;
        this.message = message;
    }

}
