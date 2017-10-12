package com.company;

public class Main {

    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 6);
    Circle circle = new Circle(2);
    Triangle triangle = new Triangle(3, 5, 4);
    Quadrate quadrate = new Quadrate(5);
    Ellips ellips = new Ellips(5, 4);

    Geometry []figure = {rectangle, circle, triangle, quadrate, ellips};

    for (int i = 0; i < figure.length; i++) {
        figure[i].solutionSquare();
        figure[i].solutionPerimetr();
    }


    }
}
