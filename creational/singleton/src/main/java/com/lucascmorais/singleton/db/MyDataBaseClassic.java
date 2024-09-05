package com.lucascmorais.singleton.db;

import com.lucascmorais.singleton.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MyDataBaseClassic {
    private static MyDataBaseClassic instance;

    private final List<User> users = new ArrayList<>();

    private MyDataBaseClassic() {}

    public static MyDataBaseClassic getInstance() {
        if (MyDataBaseClassic.instance == null)
            MyDataBaseClassic.instance = new MyDataBaseClassic();
        return instance;
    }

    public void add(User user) {
        this.users.add(user);
    }
    
    public void remove(int index) {
        this.users.remove(index);
    }

    public void show() {
        this.users.forEach(user -> LOGGER.info("Nome: {}, idade: {}", user.getName(), user.getAge()));
    }
}
