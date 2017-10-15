package com.company;

public class Circle extends Geometry {
    int radius;

    public Circle (int radius){
        this.radius =radius;
    }

    public void solutionSquare () {
        double square = 2 * 3.14 * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + square);

    }

    public void solutionPerimetr () {
        double perimetr = 2 * 3.14 * radius;
        System.out.println("Периметр круга: " + perimetr);

    }
}
