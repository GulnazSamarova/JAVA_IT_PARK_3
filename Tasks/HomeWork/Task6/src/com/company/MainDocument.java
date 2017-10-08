package com.company;

import java.io.IOException;
import java.util.Scanner;

public class MainDocument {

    public static void workWithDocument (Document document) throws IOException {
        //Document document = new Document();
        // Обеспечить функционал:
        // добавить строку в конец, в начало, в заданную
        // позицию, заменить строку, удалить строку, вывести весь документ
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    document.showDocument();
                }
                break;
                case 2: {
                    if (document.count == document.lines.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document.addLineToBegin(newLine);
                }
                break;
                case 3: {
                    if (document.count == document.lines.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document.addLineToEnd(newLine);
                }
                break;

                case 4: {
                    System.out.println("Какую строку удалить?");
                    int lineDelete = scanner.nextInt();
                    document.deleteLine(lineDelete);

                }
                break;

                case 5: {
                    System.out.println("Какую строку заменить?");
                    int lineNumber1 = scanner.nextInt();
                    System.out.println("На какую строку заменить?");
                    int lineNamber2 = scanner.nextInt();
                    document.changeLine(lineNumber1, lineNamber2);

                }
                break;

                case 6: {
                    System.out.println("Какую строку очистить?");
                    int lineNumber = scanner.nextInt();
                    document.clearLine(lineNumber);

                }
                break;
                case 7:
                    System.exit(0);
            }
        }
    }
}

