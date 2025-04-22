package ru.job4j.oop;

public class Eror {
    private boolean active;
    private int status;
    private String message;

    public Eror(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Eror() {
    }

    public void info() {
        System.out.println("Наличие ошибки: " + active);
        System.out.println("Количество ошибок: " + status);
        System.out.println("Сообщение об ошибке: " + message);
    }

    public static void main(String[] args) {
        Eror eror = new Eror();
        eror.info();
        System.out.println();
        Eror one = new Eror(true, 2, "Исправить ошибки?");
        one.info();
        System.out.println();
        Eror two = new Eror(false, 0, "Нет ошибок!");
        two.info();
    }
}
