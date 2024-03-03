package org.example.Ex2;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SimpleInterface {
    public static void main(String[] args) {
        // 1. Создать лямбда выражение, которое возвращает значение true,
        // если строка не null, используя функциональный интерфейс Predicate.
        Predicate<String> isStringNull = string -> string != null;
        System.out.println(isStringNull.test(null));
        System.out.println("--------------------------");

        // 2. Создать лямбда выражение, которое проверяет, что строка не пуста,
        // используя функциональный интерфейс Predicate.
        Predicate<String> isStringEmpty = string -> string.isEmpty();
        System.out.println(isStringEmpty.test(""));
        System.out.println("--------------------------");

        // 3. Написать программу, проверяющую, что строка не null и не пуста,
        // используя функциональный интерфейс Predicate.
        Predicate<String> stringCheck = string -> string != null && !string.isEmpty();
        System.out.println(stringCheck.test(""));
        System.out.println("--------------------------");

        // 4. Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
        // и заканчивается “A”. Используем функциональный интерфейс Predicate.
        Predicate<String> letterChecking =
                string -> (string.startsWith("J") || string.startsWith("N")) && string.endsWith("A");
        System.out.println(letterChecking.test("Jon"));
        System.out.println(letterChecking.test("JonA"));
        System.out.println(letterChecking.test("Tom"));
        System.out.println("--------------------------");

        // 5. Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
        // “Отрицательное число” или “Ноль”. Используем функциональный интерфейс Function.
        Function<Integer, String> numberCheck = number -> {
            if (number > 0) {
                return "Положительное число";
            } else if (number < 0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };
        System.out.println(numberCheck.apply(1));
        System.out.println(numberCheck.apply(-1));
        System.out.println(numberCheck.apply(0));
        System.out.println("--------------------------");

        // 6. Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
        // Используем функциональный интерфейс Supplier.
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 10);
        System.out.println(randomNumber.get());
    }
}
