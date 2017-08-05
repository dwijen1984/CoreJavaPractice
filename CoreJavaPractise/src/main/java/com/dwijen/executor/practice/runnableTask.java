package com.dwijen.executor.practice;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

/**
 * Created by dkirtan on 7/11/17.
 */
public class runnableTask implements Runnable{

    String query;
    Session session;
    runnableTask(String query, Session session){
        this.query= query;
        this.session = session;
    }
    @Override
    public void run() {
        session.execute(query);
        session.close();
        System.out.println("Insertion Done..");
    }
}
