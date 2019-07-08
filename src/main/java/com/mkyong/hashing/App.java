package com.mkyong.hashing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> sortarr = new ArrayList<Integer>();

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter 5 Numbers to sort");

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter No " + (i + 1) + ":");
            n = sc.nextInt();


            sortarr.add(n);

        }

       sort();
    }

    public static void sort() {

        for (int i = 0; i < sortarr.size() - 1; i++) {
            for (int j = 0; j < sortarr.size() - 1 - i; j++) {

                if (sortarr.get(j) > sortarr.get(j + 1)) {
                    int temp = sortarr.get(j);
                    sortarr.set(j, sortarr.get(j + 1));
                    sortarr.set(j + 1, temp);
                }

            }
        }

        System.out.println("******-------sorted order-------*******");
        for (int m : sortarr) {
            System.out.print(m + " ");
        }
    }



}
