package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> departments) {
        Set<String> temp = new LinkedHashSet<>();

        for (String dept : departments) {
            String[] parts = dept.split("/");
            StringBuilder current = new StringBuilder();
            for (int i = 0; i < parts.length; i++) {
                if (i > 0) {
                    current.append("/");
                }
                current.append(parts[i]);
                temp.add(current.toString());
            }
        }

        return new ArrayList<>(temp);
    }

    public static void sortAsc(List<String> departments) {
        departments.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> departments) {
        departments.sort(new DepartmentsDescComparator());
    }
}
