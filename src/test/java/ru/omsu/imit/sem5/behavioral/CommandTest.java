package ru.omsu.imit.sem5.behavioral;

import org.junit.Test;
import ru.omsu.imit.sem5.behavioral.command.Button;
import ru.omsu.imit.sem5.behavioral.command.OrderCommand;
import ru.omsu.imit.sem5.behavioral.command.TableWithButtons;

public class CommandTest {
    @Test
    public void testCommand() {
        TableWithButtons tableWithButtons = new TableWithButtons(100);

        tableWithButtons.addButton(new Button("pizza", 25, new OrderCommand(tableWithButtons, 25)));
        tableWithButtons.addButton(new Button("burger", 10, new OrderCommand(tableWithButtons, 10)));

        System.out.println(tableWithButtons.pressButton("pizza")); // true
        System.out.println(tableWithButtons.pressButton("pizza")); // true
        System.out.println(tableWithButtons.pressButton("pizza")); // true
        System.out.println(tableWithButtons.pressButton("pizza")); // true
        System.out.println(tableWithButtons.pressButton("pizza")); // false < 0 cash
    }
}
