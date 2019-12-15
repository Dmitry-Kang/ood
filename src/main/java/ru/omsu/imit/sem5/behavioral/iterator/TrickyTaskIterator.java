package ru.omsu.imit.sem5.behavioral.iterator;

import java.util.List;

public class TrickyTaskIterator implements Iterator {
    private List<Task> tasks;
    private int curPos;
    private boolean seenTask;

    public TrickyTaskIterator(List<Task> tasks) {
        this.tasks = tasks;
        seenTask = false;
    }

    @Override
    public boolean hasNext() {
        return curPos < tasks.size();
    }

    @Override
    public void taskDone() {
        if (seenTask) {
            curPos++;
            seenTask = false;
        }
    }

    @Override
    public Task next() {
        if (hasNext()) {
            Task res = tasks.get(curPos);
            seenTask = true;
            return res;
        }
        return null;
    }
}
