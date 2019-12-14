package ru.omsu.imit.sem5.structural;

import org.junit.Test;
import ru.omsu.imit.sem5.structural.Proxy.Lesson;
import ru.omsu.imit.sem5.structural.Proxy.Schkolnik;
import ru.omsu.imit.sem5.structural.Proxy.SmartSchkolnik;

public class ProxyTest {
    @Test
    public void mainTest() {
        Lesson lesson1 = new Lesson("функциональный анализ");
        Lesson lesson2 = new Lesson("Задача о размещении объектов");
        Lesson lesson3 = new Lesson("Математика");

        String shporgalka1 = "сложноразборчивые формулы";
        String shporgalka2 = "формула на английском";

        SmartSchkolnik smartSchkolnik = new SmartSchkolnik();
        System.out.println("Ответ первой задачки: " + smartSchkolnik.solve(lesson1) + "\n");
        System.out.println("Ответ первой задачки: " + smartSchkolnik.solve(lesson1) + "\n");

        System.out.println("Ответ второй задачки: " + smartSchkolnik.solve(lesson2) + "\n");
        System.out.println("Ответ третьей задачки: " + smartSchkolnik.solve(lesson3) + "\n");

    }
}
