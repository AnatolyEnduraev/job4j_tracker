package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Ball bun = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();

        wolf.tryEat(bun);
        hare.tryEat(bun);
        fox.tryEat(bun);
    }
}

