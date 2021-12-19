package com.teachmeskills.lesson_6.Task2;

public class Worker implements Printable {

    @Override
    public void print() {
        System.out.println("Holds the position of worker");
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.print();
    }
}
