package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Добро пожаловать в обратботчик документов!\s
                 На данный момент вы используете бесплатную версию\s
                 Чтобы пререйти на версию Про/Эксперт введите соотв-щие ключи
                 Если у вас нет ключей введите '1' чтобы продолжить\s
                 Для управления используйте цифры(1-открыть, 2-редактировать, 3-сохранить,4-выйти)""");
        int key = scanner.nextInt();
        DocumentWorker document1 = new DocumentWorker();
        switch (key) {
            case 1:
                break;
            case 137920:
                document1 = new DocumentWorkerPro();
                System.out.println("Вы пререшли на Про версию!");
                break;
            case 792031:
                document1 = new DocumentWorkerExpert();
                System.out.println("Вы пререшли на Эксперт версию!");

                break;
        }
        do {
            System.out.println("Введите действие(1,2,3,4)");

            int action = scanner.nextInt();
            switch (action) {
                case 1 -> document1.OpenDocument();
                case 2 -> document1.EditDocument();
                case 3 -> document1.SaveDocument();
                case 4 -> System.exit(2);
            }


        }while (true);


    }

}