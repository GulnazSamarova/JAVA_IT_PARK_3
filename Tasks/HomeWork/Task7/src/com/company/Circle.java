package com.company;

public class Circle extends Geometry {
    int r;

    public Circle (int r){
        this.r =r;
    }

    public void solutionSquare () {
        double square = 2 * 3.14 * Math.pow(r, 2);
        System.out.println("Площадь круга: " + square);

    }

    public void solutionPerimetr () {
        double perimetr = 2 * 3.14 * r;
        System.out.println("Периметр круга: " + perimetr);

    }
}
