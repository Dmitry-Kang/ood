package ru.omsu.imit.sem5.structural.flyweight;

public class BulletType {
    public Type type;
    public State state;

    public BulletType(Type type, State state) {
        this.type = type;
        this.state = state;
    }


}
