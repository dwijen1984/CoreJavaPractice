package com.dwijen.cyclic.barrie.practise;

/**
 * Created by dkirtan on 7/20/17.
 */
public enum Enum_GF {
    Rajashree("ChildHood", "10-12"),
    Parna_1("ChildHood", "15-16"),
    Parna_2("ChildHood", "10-12"),
    Debika("ChildHood", "10-12"),
    Jayashree("ChildHood", "10-12"),
    Utsa("ChildHood", "10-12"),
    Sonia("ChildHood", "10-12");

    private String description, age;
    Enum_GF(String description, String age){
        this.description = description;
        this.age = age;
    }

    public String getDescription(){
        return description;
    }
    public String getAge(){
        return age;
    }


}
