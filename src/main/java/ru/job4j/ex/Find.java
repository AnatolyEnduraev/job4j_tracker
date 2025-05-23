package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        System.out.println("load config by " + data[index]);
        return data[index];
    }
}





