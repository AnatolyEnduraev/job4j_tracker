package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        System.out.print("Волк хотел сьесть колобка: ");
        wolf.tryEat(kolobok);
        System.out.print("Заяц хотел сьесть колобка: ");
        hare.tryEat(kolobok);
        System.out.print("Лиса хотела сьесть колобка: ");
        fox.tryEat(kolobok);
    }
}

