package ru.omsu.imit.sem5.structural.Proxy;

import java.util.HashMap;
import java.util.Map;

public class SmartSchkolnik implements SchoolProgramm {
    private Schkolnik schkolnik;
    private Map<String, String> shporgalki;

    public SmartSchkolnik() {
        this.schkolnik = new Schkolnik();
        shporgalki = new HashMap<>();
    }


    @Override
    public int solve(Lesson lesson, String shporgalka) {
        if (shporgalka != null) {
            if (shporgalki.containsValue(shporgalka)) {
                return schkolnik.solve(lesson, shporgalka);
            } else {
                shporgalki.put(lesson.getType(), shporgalka + " any solving");
                return schkolnik.solve(lesson, "новая" + shporgalka);
            }
        }

        if (shporgalki.containsKey(lesson.getType())) {
            // новая или знакомая
            if (shporgalki.get(lesson.getType().contains("новая"))) {

            }
        }
        return schkolnik.solve(lesson, null);
    }
}
