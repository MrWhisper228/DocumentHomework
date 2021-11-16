package com.company;

public class DocumentWorkerExpert extends DocumentWorkerPro {
    public DocumentWorkerExpert() {
    }

    @Override
    public void SaveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
