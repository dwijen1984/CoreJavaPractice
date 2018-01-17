package com.salesforce;

import org.junit.Test;

public class InstalledPackages {
    public boolean Explecit;

    public InstalledPackage Package;

    public boolean isExplecit() {
        return Explecit;
    }

    public void setExplecit(boolean explecit) {
        Explecit = explecit;
    }

    public InstalledPackage getPackage() {
        return Package;
    }

    public void setPackage(InstalledPackage aPackage) {
        Package = aPackage;
    }

    @Test
    public void test(){
        String s = "Depends telnet tel2";
        String[] s2 = s.split(" ");
        /*for(String  :s2){

        }*/
    }
}
