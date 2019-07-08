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

        System.out.println("Which Sort Method You Need ");
        System.out.println("1.0 Bubble Sort \n2.0 Selection Sort");
        System.out.println("Press Option 1 OR 2 :");
        int option=sc.nextInt();

        if(option==1){
            System.out.println("implementing Bubble sort .........");
            sort();
        }
        else if(option==2){
            System.out.println("implementing selection sort .........");
            selection_sort();
        }
        else{
            System.out.println("Sort option not given Deafault method selected");
            System.out.println("implementing Bubble sort .........");
            sort();
        }


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

    public static void selection_sort() {

        int min = 0;
        for (int i = 0; i < sortarr.size(); i++) {
            min = i;
            for (int j = i + 1; j < sortarr.size(); j++) {
                if (sortarr.get(min) > sortarr.get(j)) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = sortarr.get(i);
                sortarr.set(i, sortarr.get(min));
                sortarr.set(min, temp);

            }


        }

        System.out.println("******-------sorted order-------*******");
        for (int m : sortarr) {
            System.out.print(m + " ");
        }
    }



}
