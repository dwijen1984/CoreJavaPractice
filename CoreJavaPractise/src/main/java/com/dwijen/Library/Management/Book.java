package com.dwijen.Library.Management;

public class Book {
    private int inventory;
    private String name;
    private String author;
    private int insn;

    public Book(int inventory, int insn, String name, String author){
        this.author = author;
        this.insn = insn;
        this.inventory = inventory;
        this.name = name;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getInsn() {
        return insn;
    }

    public void setInsn(int insn) {
        this.insn = insn;
    }

    @Override
    public String toString() {
        return name ;
    }
}
