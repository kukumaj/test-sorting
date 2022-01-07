package com.epam.rd.autotasks;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(array);
        //throw new UnsupportedOperationException();
    }
}
