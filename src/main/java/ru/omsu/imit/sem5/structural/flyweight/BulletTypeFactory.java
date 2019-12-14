package ru.omsu.imit.sem5.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BulletTypeFactory {
    private List<BulletType> types;

    public BulletTypeFactory() {
        types = new ArrayList<>();
    }

    public void add(BulletType type) {
        if (!types.contains(type)) {
            types.add(type);
        }
    }

    public BulletType get(State state) {
        for(BulletType bulletType: types) {
            if (bulletType.state == state) {
                return bulletType;
            }
        }
        return null;
    }
}
