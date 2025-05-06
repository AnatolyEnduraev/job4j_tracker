package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус едет по маршруту ");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе пассажиров: " + count);
    }

    @Override
    public int refuel(int fuel) {
        int pricePerLiter = 50;
        int cost = fuel * pricePerLiter;
        System.out.println("Заправлено " + fuel + " литров на сумму " + cost + " рублей");
        return cost;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.passengers(25);
        bus.refuel(100);
    }
}

