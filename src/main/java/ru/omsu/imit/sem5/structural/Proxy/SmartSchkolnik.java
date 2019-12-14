package ru.omsu.imit.sem5.structural.Proxy;

import java.util.HashMap;
import java.util.Map;

public class SmartSchkolnik implements SchoolProgramm {
    private Schkolnik schkolnik;
    private Map<String, Integer> shporgalki;

    public SmartSchkolnik() {
        this.schkolnik = new Schkolnik();
        shporgalki = new HashMap<>();
    }


    @Override
    public int solve(Lesson lesson) {
        if (shporgalki.containsKey(lesson.getType())) {
            System.out.println("Умный школьник уже решал такую задачку");
            return shporgalki.get(lesson.getType());
        }
        int res = schkolnik.solve(lesson);
        shporgalki.put(lesson.getType(), res);
        return res;
    }
}
