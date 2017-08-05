package com.dwijen.java.practice;

/**
 * Created by dkirtan on 4/24/17.
 */
public class ExceptionPractise {

    public boolean validatePO(String poNumber) throws SnapShotResponseException{
        if(poNumber.equals("111")){
            throw new IllegalArgumentException("No matching account id found for order number "+poNumber);
        }
        return false;

    }
}
