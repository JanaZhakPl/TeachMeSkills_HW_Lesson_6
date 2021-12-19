package com.teachmeskills.lesson_6.Task3;

import javax.xml.crypto.Data;

public class EmployeeContract implements  Info{
    Data terminationDate;
    String employeeName;

    public EmployeeContract() {
    }

    public EmployeeContract(int documentNumber, Data dateOfDocument, Data terminationDate, String employeeName) {
        this.terminationDate = terminationDate;
        this.employeeName = employeeName;
    }


    @Override
    public void showInfo() {
        System.out.println("Number of document: " );

    }

    @Override
    public void addToRegister() {
    }

}
