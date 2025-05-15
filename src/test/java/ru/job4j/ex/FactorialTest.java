package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void whenNegativeNumberThenIllegalArgumentException() {
        Factorial factorial = new Factorial();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    factorial.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    void whenNumberIsThreeThenResultIsSix() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(3);
        assertThat(result).isEqualTo(6);
    }
}