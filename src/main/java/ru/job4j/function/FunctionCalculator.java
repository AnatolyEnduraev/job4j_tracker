package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start,
                                 int end,
                                 Function<Double, Double> function) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            Double x = (double) i;
            Double y = function.apply(x);
            result.add(y);
        }
        return result;
    }
}
