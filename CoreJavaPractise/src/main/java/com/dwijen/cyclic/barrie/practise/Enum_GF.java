package com.dwijen.cyclic.barrie.practise;

import org.junit.Test;

/**
 * Created by dkirtan on 7/20/17.
 */
public enum Enum_GF {
    Rajashree("Rajashree", "10-12"),
    Parna_1("Parna_1", "21-22"),
    Parna_2("Parna_2", "20-22"),
    Debika("Debika", "22-24"),
    Jayashree("Jayashree", "21-26"),
    Utsa("Utsa", "22-26"),
    Sonia("Sonia", "19-21");

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


    public static DealSource byDbId(String gf_name){
        for(Enum_GF e : Enum_GF.values()){
            if(e.getDescription().equalsIgnoreCase(gf_name)){
                e.ordinal();
                System.out.println("name: "+e.getDescription() +" age: "+e.getAge()+ " ordinal :"+(e.ordinal()+1));
            }
        }
/*        for (DealSource dealSource : DealSource.values()){
            if (dealSource.getDbId().equals(dbId)){
                return dealSource;
            }
        }*/
        return null;
    }

    public static void main(String args[]){

        byDbId("rajashree");
    }


}
