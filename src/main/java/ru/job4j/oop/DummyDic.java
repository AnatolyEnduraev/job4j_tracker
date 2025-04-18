package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String word = "Hello";
        String translation = dictionary.engToRus(word);
        System.out.println(translation);
    }
}