package com.company;

public class Quadrate extends Geometry {

    int a;

    public Quadrate (int a){
        this.a = a;
    }


    public void solutionSquare(int a) {
        System.out.println("Площадь квадрата: " + (a*a));

    }


    public void solutionPerimetr() {
        System.out.println("Периметр квадрата: " + (4*a));
    }
}
