package com.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testStringsArray {


        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            double sum = 0;

            System.out.println("Enter the number of strings: ");

            int numberOfStrings = Integer.parseInt(reader.readLine());

            String[] arrayOfStrings = new String[numberOfStrings];


            for (int i=0;i<numberOfStrings;i++) {
                System.out.println("Enter the value for the " + (i+1) + "string: ");
                arrayOfStrings[i] = reader.readLine();

            }

            for (int i=0;i<numberOfStrings;i++){
                sum += arrayOfStrings[i].length();
            }
            System.out.println("Average length of the string in array: " + (sum/numberOfStrings));
        }
    }

