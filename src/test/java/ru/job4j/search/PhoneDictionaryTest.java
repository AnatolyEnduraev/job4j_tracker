package ru.job4j.search;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        List<Person> result = phones.find("Petr");
        assertThat(result)
                .hasSize(1)
                .first()
                .extracting(Person::getSurname)
                .isEqualTo("Arsentev");
    }

    @Test
    void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Ivan", "Ivanov", "12345", "Moscow"));
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        List<Person> result = phones.find("Arsentev");
        assertThat(result)
                .hasSize(1)
                .first()
                .extracting(Person::getName)
                .isEqualTo("Petr");
    }

    @Test
    void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        List<Person> result = phones.find("534");
        assertThat(result).hasSize(1);
    }

    @Test
    void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        List<Person> result = phones.find("Bry");
        assertThat(result).hasSize(1);
    }

    @Test
    void whenFindByKeyThenEmptyList() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        List<Person> result = phones.find("eao");
        assertThat(result).isEmpty();
    }
}
