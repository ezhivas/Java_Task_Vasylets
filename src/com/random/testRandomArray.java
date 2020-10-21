package com.random;

import java.util.Random;

public class testRandomArray {

    public static void main(String[] args) {

        Random random = new Random();
        int[] sampleArray = new int[10];
        System.out.println("Random array:");

        for (int i = 0; i < 10; i++) {
            sampleArray[i] = random.nextInt();
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (sampleArray[i] < 0) sampleArray[i] = 0;
        }
        System.out.println("Array without negative numbers: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(sampleArray[i] + " ");
        }
    }
}


