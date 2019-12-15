package ru.omsu.imit.sem5.behavioral;

import org.junit.Test;
import ru.omsu.imit.sem5.behavioral.iterator.Iterator;
import ru.omsu.imit.sem5.behavioral.iterator.Task;
import ru.omsu.imit.sem5.behavioral.iterator.TrickyTaskProgramm;

public class IteratorTest {
    @Test
    public void TestIterator() {
        TrickyTaskProgramm programm = new TrickyTaskProgramm();
        programm.addTask("Написать паттерны");
        programm.addTask("Написать ассемблеры");
        programm.addTask("Написать контрольные");
        programm.addTask("Выжить");

        Iterator iterator = programm.getIterator();
        System.out.println(iterator.next().getContent());
        System.out.println(iterator.next().getContent());

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getContent());
            iterator.taskDone();
        }
    }
}
