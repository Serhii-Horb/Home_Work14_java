package org.example.Ex3;

import java.util.ArrayList;
import java.util.List;

/* У нас есть профессия в строительстве - чернорабочий. Он может выполнять любые низкоквалифицированные
работы на стройке. На каждый день ему дается список работ, которые он должен выполнить, но не факт,
что в течении рабочего времени его задание может измениться.
Напишите программу рабочего дня профессии, которая позволяет динамический давать ему задание на работу,
в любое нужное время. И он их должен выполнять. Применяйте функциональные интерфейсы.
*/
public class WorkingDay {
    public static void main(String[] args) {
        List<String> exercisesList = new ArrayList<>();
        exercisesList.add("Выкопать яму");
        exercisesList.add("Покрасить трубу");
        exercisesList.add("Разгрузить кирпич");
        System.out.println("Начинаем рабочий день!");
        startDay(exercisesList);

        System.out.println("Ваш любимый шеф добавил задание!");
        AddTask addTask = (list, exercise) -> list.add(exercise);
        addTask.addToList(exercisesList, "Принести воду");
        addTask.addToList(exercisesList, "Разгрузить цемент");
        System.out.println(exercisesList);

        System.out.println("Ваш любимый шеф отменил задание");
        DeleteTask deleteTask = (list, position) -> list.remove(position);
        deleteTask.removeFromList(exercisesList, 1);
        System.out.println(exercisesList);

    }

    private static void startDay(List<String> list) {
        System.out.println(list);
    }
}

@FunctionalInterface
interface AddTask {
    void addToList(List<String> list, String exercise);
}

@FunctionalInterface
interface DeleteTask {
    void removeFromList(List<String> list, int position);
}
