package com.company;

public class Quadrate extends Geometry {

    int side;

    public Quadrate(int side) {
        this.side = side;
    }


    public void solutionSquare() {
        System.out.println("Площадь квадрата: " + (side * side));

    }


    public void solutionPerimetr() {
        System.out.println("Периметр квадрата: " + (4 * side));

    }
}
