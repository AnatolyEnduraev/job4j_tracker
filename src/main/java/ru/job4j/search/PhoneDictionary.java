package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        var combined = (Predicate<Person>) p ->
                p.getName().contains(key)
                        || p.getSurname().contains(key)
                        || p.getPhone().contains(key)
                        || p.getAddress().contains(key);

        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combined.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

