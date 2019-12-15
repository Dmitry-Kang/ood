package ru.omsu.imit.sem5.behavioral.iterator;

import java.util.Objects;

public class Task {
    private String content;

    public Task(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return Objects.equals(getContent(), task.getContent());
    }
}
