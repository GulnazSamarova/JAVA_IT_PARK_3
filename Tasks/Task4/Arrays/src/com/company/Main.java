package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {3, 5, 2, 3, 1, 6, 9};


        int n = a.length/2;
        for (int i = 0; i < n; i++) {
           // System.out.print(array[i] + " ");


            int temp = a [i];
            a [i] =  a [n-1-i];
            a [n-1-i] = temp;

           // System.out.print(a[i] + " ");

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
