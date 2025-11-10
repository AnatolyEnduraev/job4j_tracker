package ru.job4j.queue;

import java.util.Deque;
import java.util.LinkedList;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder sb = new StringBuilder();
        Deque<Character> copy = new LinkedList<>(evenElements);
        int i = 0;
        while (!copy.isEmpty()) {
            char c = copy.pollFirst();
            if (i % 2 == 0) {
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        Deque<Character> copy = new LinkedList<>(descendingElements);
        while (!copy.isEmpty()) {
            sb.append(copy.pollLast());
        }
        return sb.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}


