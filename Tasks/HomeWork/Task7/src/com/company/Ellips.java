package com.company;

public class Ellips extends Geometry {
    int a, b;

    public Ellips (int a, int b){
        this.a = a;
        this.b = b;
    }

    public void solutionSquare () {
        double square = 3.14 * a *b;


        System.out.println("Площадь эллипса: " + square);


    }

    public void solutionPerimetr () {
        double perimetr = 2 * 3.14 * Math.pow((Math.pow(a, 2)+ Math.pow( b, 2))/2,0.5);
        System.out.println("Периметр эллипса: " + perimetr);


    }
}
