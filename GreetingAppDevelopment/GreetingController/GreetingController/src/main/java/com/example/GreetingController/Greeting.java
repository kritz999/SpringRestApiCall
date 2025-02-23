package com.example.GreetingController;

public class Greeting {
    private String message;
    private String method;

    public Greeting(String message, String method){
        this.message = message;
        this.method = method;

    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
    public String getMethod(){
        return method;
    }

    public void setMethod(String method){
        this.method=method;
    }

}
