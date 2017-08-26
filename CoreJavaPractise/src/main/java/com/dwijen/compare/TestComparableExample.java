package com.dwijen.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        System.out.println("Sorted : "+collection);

    }
}
