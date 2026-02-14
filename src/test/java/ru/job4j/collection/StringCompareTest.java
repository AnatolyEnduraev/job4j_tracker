package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCompareTest {

    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("Ivanov", "Ivanov");
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("Ivanov", "Ivanova");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("Petrov", "Ivanova");
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("Petrov", "Patrov");
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("Patrova", "Petrov");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftEmptyRightNotEmptyThenNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("", "text");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftNotEmptyRightEmptyThenPositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("text", "");
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenBothEmptyThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("", "");
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenDifferentCharsAtFirstPosition() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("Apple", "Banana");
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenSamePrefixButDifferentLength() {
        StringCompare compare = new StringCompare();
        int result = compare.compare("Hello", "HelloWorld");
        assertThat(result).isLessThan(0);
    }
}

