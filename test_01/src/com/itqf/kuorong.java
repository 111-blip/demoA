package com.itqf;

import java.util.Arrays;

public class kuorong {
    public static void main(String[] args) {
        int[] old= new int[]{11,12,13,14};
        int[] ints = Arrays.copyOf(old, old.length * 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
