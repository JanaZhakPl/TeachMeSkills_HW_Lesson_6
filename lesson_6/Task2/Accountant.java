package com.teachmeskills.lesson_6.Task2;

public class Accountant implements Printable {

    @Override
    public void print() {
        System.out.println("Holds the position of accountant");
    }

    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.print();
    }
}