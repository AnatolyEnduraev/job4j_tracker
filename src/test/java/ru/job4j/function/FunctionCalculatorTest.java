package ru.job4j.function;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {

    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator calculator = new FunctionCalculator();
        List<Double> result = calculator.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsExactlyElementsOf(expected);
    }

    @Test
    void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCalculator calculator = new FunctionCalculator();
        List<Double> result = calculator.diapason(1, 4, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D);
        assertThat(result).containsExactlyElementsOf(expected);
    }

    @Test
    void whenExponentialFunctionThenExponentialResults() {
        FunctionCalculator calculator = new FunctionCalculator();
        List<Double> result = calculator.diapason(0, 3, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(1D, 2D, 4D);
        assertThat(result).containsExactlyElementsOf(expected);
    }
}
