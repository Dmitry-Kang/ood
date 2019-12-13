package ru.omsu.imit.sem5.structural.decorator;

import java.util.Random;

public class SmartHouseSmokeController extends SmartHouseDevice {
    // контроллер дыма в помещении
    // при значении smokelevel выше 5000 вызывает пожарных

    private int smokelevel;

    public SmartHouseSmokeController(SmartHouse smartHouse) {
        super(smartHouse);
        setSmokeLevel();
    }

    @Override
    public void work() {
        setSmokeLevel();
        System.out.println("Коэффициент дыма в помещении: " + smokelevel);
        if (smokelevel > 5000) {
            System.out.println("Вызвали пожарных на дом");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fixSmokeLevel();
            System.out.println("Коэффициент дыма в помещении: " + smokelevel);
        }
        System.out.println("Коэффициент дыма для помещения приемлимый");
        super.work();
    }

    public void setSmokeLevel() {
        Random rand = new Random();
        smokelevel = rand.nextInt(5500);
    }

    public void fixSmokeLevel() {
        Random rand = new Random();
        smokelevel = rand.nextInt(4000);
    }
}
