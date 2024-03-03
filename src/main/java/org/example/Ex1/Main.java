package org.example.Ex1;

import java.util.function.Consumer;

/* Написать функциональный интерфейс Printable, который содержит один метод void print(String text).
Используя этот интерфейс, напишите lambda выражения для печати переданного текста большими буквами,
и маленькими буквами.
Возможно ли данный интерфейс заменить одним из стандартных функциональных интерфейсов?
Если да, приведите пример. */

public class Main {
    public static void main(String[] args) {
        Printable printUpperCase = text -> System.out.println(text.toUpperCase());
        printUpperCase.print("Это текст большими буквами");

        Printable printLowerCase = text -> System.out.println(text.toLowerCase());
        printLowerCase.print("Это текст маленькими буквами");

        Consumer<String> consumerUpperCase = text -> System.out.println(text.toUpperCase());
        consumerUpperCase.accept("Это текст большими буквами");

        Consumer<String> consumerLowerCase = text -> System.out.println(text.toLowerCase());
        consumerLowerCase.accept("Это текст большими буквами");
    }
}

@FunctionalInterface
interface Printable {
    void print(String text);
}