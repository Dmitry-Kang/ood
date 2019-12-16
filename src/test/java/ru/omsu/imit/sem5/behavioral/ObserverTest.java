package ru.omsu.imit.sem5.behavioral;

import org.junit.Test;
import ru.omsu.imit.sem5.behavioral.observer.Mart;
import ru.omsu.imit.sem5.behavioral.observer.Observer;
import ru.omsu.imit.sem5.behavioral.observer.Subscriber;

public class ObserverTest {
    @Test
    public void testObserver() {
        Mart mart = new Mart();

        Observer subscriber1 = new Subscriber("a@mail.ru");
        Observer subscriber2 = new Subscriber("b@mail.ru");
        Observer subscriber3 = new Subscriber("c@mail.ru");
        mart.subscribe("Хлеб", subscriber1);
        mart.subscribe("Молоко", subscriber2);
        mart.subscribe("Мандарин", subscriber3);

        mart.addGood("Хлеб");
        mart.addGood("Молоко");
        mart.addGood("Мандарин");
        mart.addGood("Курица");

    }
}
