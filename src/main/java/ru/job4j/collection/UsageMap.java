package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("eao73@mail.ru", "Anatoly Enduraev");
        map.put("eao73@mail.ru", "Anatoly Enduraev Olegovich");
        map.put("dmz73@mail.ru", "Ekaterina Orlova");
        map.put("parsentev@yandex.ru", "Petr Arsentev");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}

