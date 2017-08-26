package com.dwijen.compare;


/**
 * Created by dkirtan on 8/26/17.
 */
public class ComparableExample implements Comparable {
    public int comparingItem;

    public ComparableExample(int comparingItem ){
        this.comparingItem = comparingItem;
    }

    @Override
    public int compareTo(Object o) {
        ComparableExample comparableExample = (ComparableExample) o;
        return (comparingItem - comparableExample.comparingItem) ;
    }


}
