package com.dwijen.Library.Management;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LibrabyManager {
    private volatile List<Book> allBooks = new ArrayList<>();
    public LibrabyManager(List<Book> allBooks){
        this.allBooks = allBooks;
    }


    public  synchronized void returnBook(String bookname){
        for(Book book : allBooks){
            if(book.getName().equalsIgnoreCase(bookname)){
                if(book.getInventory() == 0) {
                    book.setInventory(book.getInventory() + 1);
                    System.out.println("Book returned .. "+book);
                    break;
                }else if(book.getInventory() > 1 ){
                    System.out.println("Not belongs to this library .. "+book);
                    break;
                }
                else if(book.getInventory() == 1 ){
                    System.out.println("Already returned .. "+book);
                    break;
                }
            }
        }
    }
    public synchronized void issueBook(String bookname){
        for(Book book : allBooks){
            if(book.getName().equalsIgnoreCase(bookname)){
                if(book.getInventory() == 0) {
                    System.out.println("no books available "+book);
                    break;
                }else if(book.getInventory() == 1 ){
                    book.setInventory(book.getInventory() - 1);
                    System.out.println("one book issued "+book);
                    break;
                }
            }
        }
    }



}
