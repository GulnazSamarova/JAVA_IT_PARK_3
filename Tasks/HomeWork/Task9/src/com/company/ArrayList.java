package com.company;

public class ArrayList implements List{
          int arrayLength=0;
          int array[] = new int[arrayLength];
         // int count = 0;
          
          ArrayList (int arrayLength, int []array){
              this.arrayLength = arrayLength;
              this.array = array;
          }

          public void addElement(int newElement){
            array[arrayLength] = newElement;
            arrayLength++;
          }


}
