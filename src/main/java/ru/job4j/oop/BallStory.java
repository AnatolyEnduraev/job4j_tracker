package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();

        wolf.tryEat(kolobok);
        hare.tryEat(kolobok);
        fox.tryEat(kolobok);
    }
}

