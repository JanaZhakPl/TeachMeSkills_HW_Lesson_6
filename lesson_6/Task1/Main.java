package com.teachmeskills.lesson_6.Task1;

public class Main {
    public static void main(String[] args) {
        GeometricShape[] figure = {new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10),
                new Circle(12),
                new Triangle(4, 5, 6)};

        System.out.println("Areas:");
        int count = 1;
        for (GeometricShape element : figure) {
            System.out.printf(count + ". " +  "%.2f",element.getArea());
            System.out.println();
            count++;
        }

        System.out.println("Perimeters:");
         count = 1;
        for (GeometricShape element : figure) {
            System.out.printf(count + ". " +  "%.2f",element.getPerimeter());
           System.out.println();
            count++;
        }

       double  sum = 0;
        for (GeometricShape element : figure) {
           sum += (double)element.getPerimeter();
        }
        System.out.printf("Total perimeters:" + "%.2f",sum);



    }
}
