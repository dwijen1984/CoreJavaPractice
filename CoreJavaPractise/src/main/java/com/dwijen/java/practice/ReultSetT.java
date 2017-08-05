package com.dwijen.java.practice;

/**
 * Created by dkirtan on 4/27/17.
 */
public class ReultSetT {
    DummyResuleSet Rset;
    protected ReultSetT(DummyResuleSet rs){
        this.Rset = rs;
    }

    public DummyResuleSet getRset() {
        return Rset;
    }

    public void setRset(DummyResuleSet rset) {
        Rset = rset;
    }
}
