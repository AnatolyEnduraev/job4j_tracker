package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element not found in array");
    }

    public static void main(String[] args) {
        String[] array = {"cat", "dog"};
        try {
            int index = indexOf(array, "cat");
            System.out.println("Index: " + index);
        } catch (ElementNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
