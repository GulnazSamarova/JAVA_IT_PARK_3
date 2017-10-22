package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int aLength = scanner.nextInt();
        int a [] = new int[aLength];

        for (int i = 0; i < aLength; i++){
        a[i] = scanner.nextInt();
        }

        ArrayList arrayList = new ArrayList(aLength, a);

        while (true){
            Menu.showMenu();

            System.out.println("Введите номер действия");
            int command = scanner.nextInt();

            switch (command){
                case 1:
                    System.out.println("Введите новый элемент");
                    int newElement = scanner.nextInt();
                    arrayList.addElement(newElement);

                case 7:
            }
        }



    }
}
