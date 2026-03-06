package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(left.getSize(), right.getSize());
            }
        };
        Arrays.sort(attachments, comparator);

        // 1. Компаратор для лексикографической сортировки строк
        Comparator<String> comparatorText = (left, right) -> left.compareTo(right);

        // 2. Компаратор для сортировки строк по убыванию длины
        Comparator<String> comparatorDescSize = (left, right) ->
                Integer.compare(right.length(), left.length());

        String[] strings = {"I", "Anatoly", "DD", "Nikolai"};

        Arrays.sort(strings, comparatorText);
        System.out.println("Лексикографический порядок: " + Arrays.toString(strings));

        Arrays.sort(strings, comparatorDescSize);
        System.out.println("По убыванию длины: " + Arrays.toString(strings));
    }
}

