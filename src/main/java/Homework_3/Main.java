package Homework_3;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        words();
        book();
    }

    public static void words() {
        Map<String, Integer> uniqueWords = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Two");
        list.add("Three");
        list.add("Two");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Four");
        list.add("Seven");
        System.out.println("Массив с повторяющимися элементами:" + list);

        Set<String> list1 = new HashSet<>(list);
        System.out.println("Массив с уникальными элементами: " + list1);

        for (int i = 0; i < list.size(); i++) {
            if (uniqueWords.containsKey(list.get(i)))
                uniqueWords.put(list.get(i), uniqueWords.get(list.get(i)) + 1);
            else
                uniqueWords.put(list.get(i), 1);
        }
        System.out.print("Массив с подсчетом дублирующихся элементов: ");
        System.out.println(uniqueWords);
    }

    public static void book(){
        Phonebook phonebook = new Phonebook();
        phonebook.add("Сидоров", "42356");
        phonebook.add("Иванов", "11224");
        phonebook.add("Сидоров", "45245");
        phonebook.add("Сидоров", "75642");
        phonebook.add("Петров", "22222");
        phonebook.add("Соколов", "36454");
        phonebook.add("Петров", "47865");
        phonebook.add("Алексеев", "75864");


        System.out.println("********** Телефонный справочник **********");
        System.out.println("У Сидорова в тел. справочнике есть номера: " + phonebook.get("Сидоров"));
        System.out.println("У Иванова в тел. справочнике есть номера: " + phonebook.get("Иванов"));
        System.out.println("У Петрова в тел. справочнике есть номера: " + phonebook.get("Петров"));


    }
}
