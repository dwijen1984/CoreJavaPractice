package com.dwijen.java.practice;

/**
 * Created by dkirtan on 4/24/17.
 */
public class MainClass {
    public static void main(String[] args){
        boolean a = validate();
    }

    private static boolean validate() {
        ExceptionPractise practise = new ExceptionPractise();
        boolean check= true;
        try {
            check = practise.validatePO("111");
        } catch (SnapShotResponseException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }
        return check;
    }
}
