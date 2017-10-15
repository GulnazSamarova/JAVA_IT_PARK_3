package com.company;

public class Triangle extends Geometry {
    int side1, side2 , side3;//стороны треугольника

    public Triangle (int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void solutionSquare () {
        int p = (side1 + side2 + side3)/2;
        double square = Math.pow((p*(p-side1)*(p-side2)*(p-side3)),0.5);


        System.out.println("Площадь треугольника: " + square);


    }

    public void solutionPerimetr () {
        double perimetr = side1  +  side2 + side3;
        System.out.println("Периметр треугольника: " + perimetr);


    }


}
