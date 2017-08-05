package com.dwijen.java.practice;

/**
 * Created by dkirtan on 4/24/17.
 */
public class SnapShotResponseException extends Exception{
    public SnapShotResponseException(String message) {
        super(message);
    }


    public SnapShotResponseException(String message, Throwable cause){
        super(message,cause);
    }
}
