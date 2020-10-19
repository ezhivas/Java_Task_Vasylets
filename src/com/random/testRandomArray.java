package com.random;

public class testRandomArray {




        public static void main(String[] args) {


            int[] sampleArray = new int [10];
            System.out.println("Random array:");

            for (int i=0; i<10;i++){

                int a = (int) (Math.random()*(200+1))-100;
                sampleArray[i] = a;
                System.out.print(sampleArray[i] + " ");
            }
            System.out.println();
            System.out.println("Array without negative numbers: ");

            for (int i=0;i<10;i++){
                if (sampleArray[i] < 0) sampleArray[i] = 0;
                System.out.print(sampleArray[i] + " ");
            }


        }
    }

