package com.teachmeskills.lesson_6.Task2;

public class Director implements Printable {

    @Override
    public void print() {
        System.out.println("Holds the position of director");
    }

    public static void main(String[] args) {
        Director director = new Director();
        director.print();
    }
}