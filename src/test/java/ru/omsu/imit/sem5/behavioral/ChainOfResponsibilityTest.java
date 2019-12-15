package ru.omsu.imit.sem5.behavioral;

import org.junit.Test;
import ru.omsu.imit.sem5.behavioral.ChainOfResponsibility.*;

public class ChainOfResponsibilityTest {

    @Test
    public void TestChainOfResponsibility() {
        Sinner sinner = new Sinner("Олег");

        CircleOfHell circle = new Limbo();
        CircleOfHell salacity = new Salacity();
        circle.setNextCircleOfHell(salacity);
        CircleOfHell gluttony = new Gluttony();
        salacity.setNextCircleOfHell(gluttony);
        CircleOfHell greed = new Greed();
        gluttony.setNextCircleOfHell(greed);
        CircleOfHell angerandlaziness = new AngerAndLaziness();
        greed.setNextCircleOfHell(angerandlaziness);
        CircleOfHell hereticsanfalseteachers = new HereticsAndFalseTeachers();
        angerandlaziness.setNextCircleOfHell(hereticsanfalseteachers);
        CircleOfHell rapistsandmurderers = new RapistsAndMurderers();
        hereticsanfalseteachers.setNextCircleOfHell(rapistsandmurderers);
        CircleOfHell deceivers = new Deceivers();
        rapistsandmurderers.setNextCircleOfHell(deceivers);
        CircleOfHell traitorsallsorts = new TraitorsAllSorts();
        deceivers.setNextCircleOfHell(traitorsallsorts);

        circle.goThrough(sinner);
    }
}
