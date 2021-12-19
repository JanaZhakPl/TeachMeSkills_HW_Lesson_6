package com.teachmeskills.lesson_6.Task3;

public class RegisterDocuments {
    public static void main(String[] args)
    {
        RegisterDocuments [] documents = new RegisterDocuments[10];

        for (int i = 0 ; i < documents.length ; i++){
            documents[i] = new RegisterDocuments();
        }
    }
}

