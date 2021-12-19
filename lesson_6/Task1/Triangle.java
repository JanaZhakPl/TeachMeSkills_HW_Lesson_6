package com.teachmeskills.lesson_6.Task1;

public class Triangle extends GeometricShape{
     double sideA;
     double sideB;
     double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;

    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
