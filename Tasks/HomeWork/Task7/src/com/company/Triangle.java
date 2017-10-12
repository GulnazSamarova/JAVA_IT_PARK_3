package com.company;

public class Triangle extends Geometry {
    int a, b , c;//стороны треугольника

    public Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solutionSquare () {
        int p = (a + b + c)/2;
        double square = Math.pow((p*(p-a)*(p-b)*(p-c)),0.5);


        System.out.println("Площадь треугольника: " + square);


    }

    public void solutionPerimetr () {
        double perimetr = a  +  b + c;
        System.out.println("Периметр треугольника: " + perimetr);


    }


}
