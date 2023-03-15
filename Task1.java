// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 
// 1) Добавление номера
// 2) Вывод всего

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Mechnikov", 849511111, bookPhone);
        addNumber("Mechnikov", 849522222, bookPhone);
        addNumber("Savina", 849533333, bookPhone);
        addNumber("Fedorova", 849544444, bookPhone);
        addNumber("Mechnikov", 849555555, bookPhone);
        addNumber("Savina", 849566666, bookPhone);
        printBook(bookPhone);
    }
    // Метод добавления номера
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод печати списока контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var el: map.entrySet()) {
            System.out.print(el.getKey() + ":"+ el.getValue());
            System.out.println();
        }
    }
}