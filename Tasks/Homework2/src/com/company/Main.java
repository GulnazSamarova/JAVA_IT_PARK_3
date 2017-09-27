package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //вводим размер массива
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];

        // вводим элементы массива
        int i = 0;
        for (i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
                    }

        //вывод на просмотр исходного массива
        System.out.print("Исходный массив: " );
        for (i = 0; i < arraySize; i++) {
             System.out.print( array[i]+ " ");
        }
        System.out.print('\n');//окончание строки

        int sumChet = 0;
        int sumNechet = 0;
        int sumChetPosition = 0;
        int sumNechetPosition = 0;
        for (i = 0; i < arraySize; i++) {

            // определение суммы четных и нечетных элеметнов
            int b = array[i] % 2;
            if (b == 0) {
                sumChet = sumChet + array[i];
            } else {
                sumNechet = sumNechet + array[i];
            }
            // определение суммы элементов, стоящих на четных
            // и нечетных позициях
            b = i % 2;
            if (b == 0) {
                sumChetPosition = sumChetPosition + array[i];
            } else {
                sumNechetPosition = sumNechetPosition + array[i];
            }



        }

        //поиск локальных максимумов
        //под эту задачу  отдельный цикл

        int k = 0;
        for (i = 1; i < (arraySize - 1); i++) {
            if ( array[i]> array[i - 1] && array[i] > array[i + 1]) {
                k = k+1;
            }
        }

        //поиск максимально длинной подпоследовательности
        //под эту задачу отдельный цикл

         int j=1;
         int temp=1;
            for (i=0; i<(arraySize-1); i++) {
                if (array[i] < array[i + 1]) {
                j=j+1;
                 }
                    else if (array[i] > array[i + 1]&& j>temp){
                      temp=j;
                      j=1;
                }


            }

        // Замена нулей на следующее за этим элементом число с обратным знаком
        //под эту задачу отдельный цикл
        for (i=0; i< (arraySize-1); i++){
            if (array[i] ==0) {
            array [i] = - array [i+1];
            }
            }






            System.out.println("1. Сумма четных элементов: " + sumChet);
            System.out.println("2. Сумма нечетных элементов: " + sumNechet);
            System.out.println("3. Сумма элементов четных позиций: " + sumChetPosition);
            System.out.println("4. Сумма элементов нечетных позиций: " + sumNechetPosition);
            System.out.println("5. Количество локальных максимумов: " + k);
            System.out.println("6. Количество макс.подпоследовательности из возрастающих чисел: " + temp);

        //вывод на просмотр массива c заменнеыми нулями
        System.out.print("7. Массив с замененными нулями: " );
        for (i = 0; i < arraySize; i++) {
            System.out.print( array[i]+ " ");
        }

        }
    }
