package com.yuanren.exception.myException;

public class MyException extends  Exception{


    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
