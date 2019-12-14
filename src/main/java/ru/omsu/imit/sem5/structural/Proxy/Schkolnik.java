package ru.omsu.imit.sem5.structural.Proxy;

import java.util.Random;

public class Schkolnik implements SchoolProgramm {


    @Override
    public int solve(Lesson lesson, String shporgalka) {
        if (shporgalka == null) {
            try
            {
                System.out.println("Гуглим как выполнять задачу...");
                System.out.println("Долго решаем задачку...");
                Thread.sleep(5000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        } else {
            try
            {
                if (shporgalka.contains("новая")) {
                    System.out.println("У нас есть алгоритм решения задачи, но решаем в первый раз");
                    System.out.println("Средне решаем задачку...");
                    Thread.sleep(2000);
                } else {
                    System.out.println("У нас есть алгоритм решения задачи, и мы её решали");
                    System.out.println("Быстро решаем задачку...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("Готово");
        return new Random().nextInt(1000);
    }
}
