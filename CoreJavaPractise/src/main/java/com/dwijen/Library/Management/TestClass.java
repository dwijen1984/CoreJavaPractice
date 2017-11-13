package com.dwijen.Library.Management;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {
    @Test
    public void LibTest(){
        Book b1 = new Book(1, 1, "Book-1", " Author-1");
        Book b2 = new Book(1, 2, "Book-2", " Author-13");
        Book b3 = new Book(1, 3, "Book-3", " Author-1");
        Book b4 = new Book(1, 4, "Book-4", " Author-12");
        List<Book> l = Arrays.asList(b1, b2,b3,b4);

        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(new Runnable() {
            @Override
            public void run() {
                LibrabyManager libM = new LibrabyManager(l);
                libM.issueBook("Book-1");
                libM.returnBook("Book-1");
            }
        });
        ex.execute(new Runnable() {
            @Override
            public void run() {
                LibrabyManager libM = new LibrabyManager(l);
                libM.returnBook("Book-1");
                libM.returnBook("Book-1");
            }
        });
        ex.execute(new Runnable() {
            @Override
            public void run() {
                LibrabyManager libM = new LibrabyManager(l);
                libM.issueBook("Book-1");
                libM.issueBook("Book-1");
            }
        });

        /*LibrabyManager libM = new LibrabyManager(l);
        LibrabyManager libM2 = new LibrabyManager(l);
        libM.issueBook("Book-1");
        libM.returnBook("Book-1");
        libM.issueBook("Book-1");
        libM2.issueBook("Book-1");*/
    }


}
