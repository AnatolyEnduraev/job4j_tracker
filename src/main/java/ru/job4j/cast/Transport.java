package ru.job4j.cast;

public class Transport {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicle = new Vehicle[]{airplane, train, bus};
        for (Vehicle object : vehicle) {
            object.move();
        }
    }
}
