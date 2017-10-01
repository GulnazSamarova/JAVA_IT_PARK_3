package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

		System.out.println("Размер массива не должен быть больше 9");
		Scanner scanner = new Scanner (System.in);
		int arraySise = scanner.nextInt();
// этим условием ограничиваем размер массива 9 элементами
		if ( arraySise > 9) {
			arraySise = 9;
		}

		char c [] = new char[arraySise];

//Вводим символьный массив с консоли

		for (int i =0; i < c.length; i++){

			c [i] = scanner.next().charAt(0);
		}


		int array[] = new int [c.length];

		//Вывод исходно массива типа char
	 System.out.print("Исходный массив символов: " );
		for (int i=0; i < c.length; i++){
			System.out.print(c[i]+" ");

					}
		System.out.println();

		//Вывод приведеного массива типа int, содержащего код элементов массива типа char

		System.out.print("Массив символов, привиденный к типу int: " );

		for (int i=0; i < c.length; i++) {
			array [i]= c [i];
			System.out.print(array[i]+" ");
		}
		System.out.println();

		int finalArray [] = new int [array.length];

		//Вывод массива, содержащего соответствующие цифры

		System.out.print("Массив типа int: ");
		for (int i=0; i < array.length; i++) {
			finalArray [i] = array[i] - 48;
			System.out.print(finalArray[i]+" ");
		}
		System.out.println(" ");

		// Создание числа, состоящего из цифр-элементов массива типа char

		int temp [] = {1, 10, 100, 1000, 10000, 100000,1000000, 10000000, 100000000, 1000000000};
		int sum = 0;

		for (int i=0; i< finalArray.length; i++) {
			int f = finalArray[i]* temp [finalArray.length-(i+1)];
        sum = sum + f;
        //System.out.println(f);
		}
		System.out.println("Число типа int: " +sum);






	}
}
