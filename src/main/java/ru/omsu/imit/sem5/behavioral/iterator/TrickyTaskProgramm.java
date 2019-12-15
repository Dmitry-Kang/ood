package ru.omsu.imit.sem5.behavioral.iterator;


import java.util.ArrayList;
import java.util.List;

public class TrickyTaskProgramm implements Iterable {
    private List<Task> tasks;

    public TrickyTaskProgramm() {
        tasks = new ArrayList<>();
    }

    public void addTask(String content) {
        tasks.add(new Task(content));
    }

    public Iterator getIterator() {
        return new TrickyTaskIterator(tasks);
    }


}
