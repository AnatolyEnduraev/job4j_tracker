package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class DepartmentsDescComparatorTest {

    @Test
    void whenSortDepartmentsThenCorrectOrder() {
        List<String> input = List.of("K2", "K2/SK1", "K1", "K1/SK1", "K2/SK2");
        List<String> expected = List.of("K2", "K2/SK2", "K2/SK1", "K1", "K1/SK1");

        List<String> sorted = new java.util.ArrayList<>(input);
        sorted.sort(new DepartmentsDescComparator());

        assertThat(sorted).isEqualTo(expected);
    }
}
