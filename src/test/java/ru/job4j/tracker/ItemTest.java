package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {

    @Test
    public void whenSortAscByName() {
        // Создаем несортированный список
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, "Zebra"));
        items.add(new Item(1, "Apple"));
        items.add(new Item(2, "Banana"));
        items.add(new Item(4, "Antelope")); // Добавим еще один для наглядности

        // Создаем ожидаемый список, вручную отсортированный по возрастанию
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(4, "Antelope"));
        expected.add(new Item(1, "Apple"));
        expected.add(new Item(2, "Banana"));
        expected.add(new Item(3, "Zebra"));

        // Сортируем испытуемый список с помощью нашего компаратора
        Collections.sort(items, new Item.ItemAscByName());

        // Сравниваем результат с ожидаемым списком
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenSortDescByName() {
        // Создаем несортированный список
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, "Banana"));
        items.add(new Item(4, "Antelope"));
        items.add(new Item(1, "Apple"));
        items.add(new Item(3, "Zebra"));

        // Создаем ожидаемый список, вручную отсортированный по убыванию
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(3, "Zebra"));
        expected.add(new Item(2, "Banana"));
        expected.add(new Item(1, "Apple"));
        expected.add(new Item(4, "Antelope"));

        // Сортируем испытуемый список с помощью нашего компаратора
        Collections.sort(items, new Item.ItemDescByName());

        // Сравниваем результат с ожидаемым списком
        assertThat(items).isEqualTo(expected);
    }
}


