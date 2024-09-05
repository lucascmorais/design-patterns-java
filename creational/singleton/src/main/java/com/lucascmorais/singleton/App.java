package com.lucascmorais.singleton;

import com.lucascmorais.singleton.db.MyDataBaseClassic;
import com.lucascmorais.singleton.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        var myDatabaseClassic1 = MyDataBaseClassic.getInstance();
        myDatabaseClassic1.add(new User("Lucas", 25));
        myDatabaseClassic1.add(new User("Kelly", 25));
        myDatabaseClassic1.add(new User("Luis", 45));

        var myDatabaseClassic2 = MyDataBaseClassic.getInstance();
        myDatabaseClassic2.add(new User("João", 22));
        myDatabaseClassic2.add(new User("Micael", 26));
        myDatabaseClassic2.add(new User("Ademar", 55));
        myDatabaseClassic2.remove(2);

        myDatabaseClassic2.show();

        LOGGER.info("O primeiro objeto é igual ao segundo?: {}", myDatabaseClassic1 == myDatabaseClassic2);

    }
}
