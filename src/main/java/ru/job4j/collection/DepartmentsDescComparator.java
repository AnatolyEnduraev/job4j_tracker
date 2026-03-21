package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftParts = left.split("/");
        String[] rightParts = right.split("/");

        int minLength = Math.min(leftParts.length, rightParts.length);
        for (int i = 0; i < minLength; i++) {
            if (!leftParts[i].equals(rightParts[i])) {
                if (i == 0) {
                    return rightParts[i].compareTo(leftParts[i]);
                } else {
                    return leftParts[i].compareTo(rightParts[i]);
                }
            }
        }
        return leftParts.length - rightParts.length;
    }
}
