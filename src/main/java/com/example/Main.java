package com.example;

public class Main {
    public static void main(String[] args) {

        Object[] first = {15, 23, 30, 35};
        Filter myfilter = o -> (Integer)(o) + 1;

        Object[] second = filter(first, myfilter);

        for (Object o : second) {
            System.out.println(o);
        }

    }

    public static Object[] filter(Object[] array, Filter filter) {

        Object[] res = new Object[array.length];
        for ( int i = 0; i < array.length; i++) {
            res[i] = filter.apply(array[i]);
        }
        return res;
    }
}