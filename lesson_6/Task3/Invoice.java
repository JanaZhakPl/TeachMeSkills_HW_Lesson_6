package com.teachmeskills.lesson_6.Task3;

public class Invoice extends BaseDocument implements Info{
    double totalSum;
    int departmentCode;

    public Invoice(String documentNumber, int dateOfDocument) {
        super(documentNumber, dateOfDocument); //why matching super have created?????

    }

    @Override
    public void showInfo() {

    }

    @Override
    public void addToRegister() {
        Invoice [] invoices = new Invoice[10];
        for (int i = 0 ; i < invoices.length ; i++){
            invoices[i] = new Invoice("I1",date);
        }
    }

}
