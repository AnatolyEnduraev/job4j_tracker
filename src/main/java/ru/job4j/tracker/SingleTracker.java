package ru.job4j.tracker;

public final class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    private Tracker getTracker() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        return getTracker().add(item);
    }

    public Item[] findAll() {
        return getTracker().findAll();
    }

    public Item[] findByName(String key) {
        return getTracker().findByName(key);
    }

    public Item findById(int id) {
        return getTracker().findById(id);
    }

    public boolean replace(int id, Item item) {
        return getTracker().replace(id, item);
    }

    public void delete(int id) {
        getTracker().delete(id);
    }
}





