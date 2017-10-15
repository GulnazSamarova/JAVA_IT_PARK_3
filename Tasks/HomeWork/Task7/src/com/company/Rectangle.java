package com.company;

public class Rectangle extends Geometry {
   private int side1;
   private int side2;


   public Rectangle (int side1, int side2) {
       this.side1 = side1;
       this.side2 = side2;
   }

   public void solutionSquare () {
       double square = side1 * side2;


       System.out.println("Площадь прямоугольника: " + square);


   }

   public void solutionPerimetr () {
       double perimetr = 2 * side1 + 2 * side2;
       System.out.println("Периметр прямоугольника: " + perimetr);
   }
}
