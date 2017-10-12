package com.company;

public class Rectangle extends Geometry {
   private int a;
   private int b;


   public Rectangle (int a, int b) {
       this.a = a;
       this.b = b;
   }

   public void solutionSquare () {
       double square = a * b;


       System.out.println("Площадь прямоугольника: " + square);


   }

   public void solutionPerimetr () {
       double perimetr = 2 * a + 2 * b;
       System.out.println("Периметр прямоугольника: " + perimetr);
   }
}
