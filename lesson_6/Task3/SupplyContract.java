package com.teachmeskills.lesson_6.Task3;

import javax.xml.crypto.Data;
import java.util.Date;

public class SupplyContract extends BaseDocument implements Info{
    String goodsType;
    int goodsQuantity;

    public SupplyContract(String documentNumber, Data dateOfDocument) {
        super(documentNumber, dateOfDocument);
    }


    @Override
    public void showInfo() {

    }

    @Override
    public void addToRegister() {

    }
}
