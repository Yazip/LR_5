package com.github.Yazip.LR3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Попытка вставить пустое название издателя в его конструктор
        Publisher publisher = new Publisher("");
        // Работа с одномерным массивом объектов книг
        Book[] books1 = new Book[4];
        for (int i = 0; i < 4; i++) {
            books1[i] = new Book();
            books1[i].enterBookData();
        }
        // Работа с двумерным массивом объектов книг
        Book[][] books2 = new Book[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                books2[i][j] = new Book();
                books2[i][j].enterBookData();
            }
        }
        new Scanner(System.in).nextLine();
    }
}