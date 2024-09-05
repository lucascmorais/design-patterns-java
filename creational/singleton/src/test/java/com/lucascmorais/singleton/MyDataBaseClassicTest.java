package com.lucascmorais.singleton;

import com.lucascmorais.singleton.db.MyDataBaseClassic;

public class MyDataBaseClassicTest extends SingletonTest<MyDataBaseClassic> {

    public MyDataBaseClassicTest() {
        super(MyDataBaseClassic::getInstance);
    }
}
