package com.company;

public class DocumentWorkerPro extends DocumentWorker {
    public DocumentWorkerPro() {
    }

    @Override
    public void EditDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Документ сохранен в старом формате. Сохранение в других форматах доступно в версии Эксперт");
    }
}
