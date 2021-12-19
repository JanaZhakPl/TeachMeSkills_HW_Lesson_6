package com.teachmeskills.lesson_6.Task3;

import javax.xml.crypto.Data;

public abstract class BaseDocument {
    String documentNumber;
    Data dateOfDocument;

    public BaseDocument(String documentNumber, Data dateOfDocument) {
        this.documentNumber = documentNumber;
        this.dateOfDocument = dateOfDocument;
    }
}

