package ru.omsu.imit.sem5.behavioral.memento;

public class SimpleVersionController {
    // простой потомучто хранит прошлую версию
    // считается, что пользователь захочет пользоваться прошлой версией, если последняя ему не понравится
    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
