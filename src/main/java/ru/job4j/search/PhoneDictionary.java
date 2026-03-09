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
        Predicate<Person> byName     = p -> p.getName().contains(key);
        Predicate<Person> bySurname  = p -> p.getSurname().contains(key);
        Predicate<Person> byPhone    = p -> p.getPhone().contains(key);
        Predicate<Person> byAddress  = p -> p.getAddress().contains(key);
        Predicate<Person> combined = byName
                .or(bySurname)
                .or(byPhone)
                .or(byAddress);

        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combined.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
