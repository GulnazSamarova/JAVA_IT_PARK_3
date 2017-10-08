package com.company;


import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args)  throws IOException{


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество создаваемых документов");
        int documentsSize = scanner.nextInt();
        Document massiveDocument[] = new Document[documentsSize];
        int count = 0;

        while (true) {
            Menu.showMenuDocuments();
            int command = scanner.nextInt();

            switch (command) {

                case 1: {
                    MassiveDocuments.showDocument(massiveDocument);

                }

                case 2:{
                    MassiveDocuments.createDocument(massiveDocument);

                    break;
                }

                case 3: {
                    System.out.println( "Какой документ хотите удалить?");
                    int deleteDocument = scanner.nextInt();
                    MassiveDocuments.deleteDocument(massiveDocument, deleteDocument, count);

                }
                break;

                case 4: {
                    System.out.println("Введите документ, с которым хотите работать");
                    int workNumber = scanner.nextInt();
                    MainDocument.workWithDocument(massiveDocument[workNumber]);
                }
                break;

                case 5:{
                    System.exit(0);

                }


            }
        }

    }
}
