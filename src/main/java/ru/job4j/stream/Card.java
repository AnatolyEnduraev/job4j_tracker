package ru.job4j.stream;

public class Card {
    private Generator.Suit suit;
    private Generator.Value value;

    public Card(Generator.Suit suit, Generator.Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }
}
