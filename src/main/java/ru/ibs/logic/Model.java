package ru.ibs.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {

    private static final Model instance = new Model();

    private final Map<Integer, User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new HashMap<>();

        model.put(1, new User("Nikita", "Khvalin", 50000));
        model.put(2, new User("Nazar", "Grehov", 50000));
        model.put(3, new User("Gleb", "Boos", 100000));
        model.put(4, new User("Victor","Balyabin", 50000));
    }

    public void add(int id, User user) {
        model.put(id, user);
    }

    public void delete(int id){
        model.remove(id);
    }

    public Map<Integer, User> getFromList() {
        return model;
    }
}
