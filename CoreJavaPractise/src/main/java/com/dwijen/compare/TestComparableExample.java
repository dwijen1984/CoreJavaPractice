package com.dwijen.compare;

import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * Created by dkirtan on 8/26/17.
 */
public class TestComparableExample {

    @Test
    public void ArrangeItems(){
        List<ComparableExample> collection = Arrays.asList(new ComparableExample(2),
                new ComparableExample(3),
                new ComparableExample(2),
                new ComparableExample(4),
                new ComparableExample(7),
                new ComparableExample(1)
        );
        Collections.sort(collection);
        List<ComparableExample> c1 = collection.stream().filter(c-> c.comparingItem>3).collect(Collectors.toList());
        System.out.println("Sorted : "+c1);
/*
        ExecutorService ex  = Executors.newFixedThreadPool(10);
        ex.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("www.google.com");
                    URLConnection uc = url.openConnection();
                    uc.connect();

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });*/

    }
}
