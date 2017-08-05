package com.dwijen.executor.practice;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by dkirtan on 7/6/17.
 */
public class Create_table {

    public static void main(String args[]) {
        String query = "insert into dev.emp (empid, emp_first, emp_last, emp_dept) values (2,'Dwijen2','Kirtania2','eng');";
        ExecutorService ex = Executors.newFixedThreadPool(50);
        Cluster cluster = Cluster.builder().withPort(9042).addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();
        long starttime = System.currentTimeMillis();
        try {
            for (int i = 301; i < 400; i++) {
                String tmp = "insert into dev.emp (empid, emp_first, emp_last, emp_dept) values (" + i + ",'Dwijen" + i + "','Kirtania" + i + "','eng');";
                System.out.println(tmp);
                runnableTask r = new runnableTask(tmp, cluster.connect());
                ex.execute(r);
            }
        } catch (com.datastax.driver.core.exceptions.NoHostAvailableException e) {
            e.printStackTrace();
        } finally {
            System.out.print("This is the end");
            long endtime = System.currentTimeMillis();
            System.out.print("executionTime :"+(starttime - endtime));
            ex.shutdown();
        }
    }
}
