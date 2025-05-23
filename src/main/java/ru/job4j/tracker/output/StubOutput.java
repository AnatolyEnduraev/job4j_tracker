package ru.job4j.tracker.output;

public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void println(Object obj) {
        buffer.append(obj).append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}
