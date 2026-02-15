package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftNum = Integer.parseInt(left.split("\\.", 2)[0]);
        int rightNum = Integer.parseInt(right.split("\\.", 2)[0]);
        return Integer.compare(leftNum, rightNum);
    }
}
