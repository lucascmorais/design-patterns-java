package com.lucascmorais.singleton;

import com.lucascmorais.singleton.db.MyDataBaseClassic;

public class TestMyDataBaseClassic extends SingletonTest<MyDataBaseClassic> {

    public TestMyDataBaseClassic() {
        super(MyDataBaseClassic::getInstance);
    }
}
