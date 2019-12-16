package ru.omsu.imit.sem5.behavioral.memento;

public class Minecraft {
    String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Memento createMemento() {
        return new Memento(version);
    }

    public void getDataFromMomento(Memento memento) {
        this.version = memento.getVersion();
    }
}
