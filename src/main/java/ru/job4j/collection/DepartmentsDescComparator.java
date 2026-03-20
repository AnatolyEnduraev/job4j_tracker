package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] parts1 = o1.split("/");
        String[] parts2 = o2.split("/");

        int minLength = Math.min(parts1.length, parts2.length);
        for (int i = 0; i < minLength; i++) {
            int levelCompare = parts2[i].compareTo(parts1[i]);
            if (levelCompare != 0) {
                return levelCompare;
            }
        }
        return Integer.compare(parts1.length, parts2.length);
    }
}
