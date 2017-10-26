package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class SorterAge {

    private InputStream input;

    public SorterAge (String filename){
        try {
            input = new FileInputStream(filename);
        }
        catch (FileNotFoundException e){
            throw new IllegalArgumentException(e);
        }
    }

    public int sortList(){
        try {
            return sortList0();
        }catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }


    private int sortList0() throws IOException {
        //текущий массив связанных списков
        ArrayList<LinkedList> sortedList[] = new ArrayList<LinkedList>[100];
        //считываем первый символ из файла
        int currentByte = input.read();
        String result = null;

        nameRead()

        if (currentByte >= '0' && currentByte <='9') {
            sortedList[currentByte-'0'] =

        }


    }

    private String nameRead() throws IOException{
        //текущий связанны список строк
       // LinkedList<String> nameList[]=new LinkedList <String> [1];
        //текущий массив символов
        char currentName [] = new char [20];
        //количество букв в имени
          int lettersCount = 0;
        //считали первый символ из файла
        int currentByte = input.read();
         //результирующая строка
        String result = null;
        //пока не прочитали символ пробела
        while (currentByte != 32){
            if (currentByte >= 'A' && currentByte<='Z' ||
                    currentByte>= 'a' && currentByte<='z')
            //кидаем символ в массив
            currentName[lettersCount] = (char)currentByte;
            lettersCount++;
        }
        //создаем строку на основе массива символов
        result = new String(currentName,0, lettersCount);

        return result;


        }

    }
}
