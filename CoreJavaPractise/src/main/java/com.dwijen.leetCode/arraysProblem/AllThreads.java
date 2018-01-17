package com.dwijen.leetCode.arraysProblem;

import org.junit.Test;

public class AllThreads {

    public class A extends Thread{
        public void run(){
            System.out.println("A");
        }
    }
    public class B extends Thread{
        public void run(){
            System.out.println("B");
        }
    }
    public class C extends Thread{
        public void run(){
            System.out.println("C");
        }
    }

    @Test
    public void test() throws InterruptedException {
        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
       // a.join();
        b.start();
        //b.join();
        c.start();
       // c.join();
    }

}
