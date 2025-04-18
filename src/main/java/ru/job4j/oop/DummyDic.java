package ru.job4j.oop;

public class DummyDic {
    // Метод для перевода с английского на русский
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String word = "Hello"; // Пример слова для перевода
        String translation = dictionary.engToRus(word);
        System.out.println(translation); // Вывод: Неизвестное слово. Hello
    }
}
