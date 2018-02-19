package com.dwijen.jconsole.jmx;

public interface HelloMBean {
    public void setMessage(String message);
    public String getMessage();
    public void sayHello();
    public void saySomething(String messages);
}
