package com.company;

public class Ellips extends Geometry {
    int semiaxis1, semiaxis2;

    public Ellips (int semiaxis1, int semiaxis2){
        this.semiaxis1 = semiaxis1;
        this.semiaxis2 = semiaxis2;
    }

    public void solutionSquare () {
        double square = 3.14 * semiaxis1 *semiaxis2;


        System.out.println("Площадь эллипса: " + square);


    }

    public void solutionPerimetr () {
        double perimetr = 2 * 3.14 * Math.pow((Math.pow(semiaxis1, 2)+ Math.pow( semiaxis2, 2))/2,0.5);
        System.out.println("Периметр эллипса: " + perimetr);


    }
}
