package ru.omsu.imit.sem5.structural.Proxy;

import java.util.Random;

public class Schkolnik implements SchoolProgramm {


    @Override
    public int solve(Lesson lesson) {
        try
        {
            System.out.println("Гуглим как выполнять задачу...");
            System.out.println("Долго решаем задачку...");
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Готово");
        return new Random().nextInt(1000);
    }
}
