package ru.omsu.imit.sem5.behavioral;

import org.junit.Test;
import ru.omsu.imit.sem5.behavioral.command.Button;
import ru.omsu.imit.sem5.behavioral.command.OrderCommand;
import ru.omsu.imit.sem5.behavioral.command.TableWithButtons;

public class CommandTest {
    @Test
    public void testCommand() {
        TableWithButtons tableWithButtons = new TableWithButtons(100);

        tableWithButtons.addButton(new Button("order pizza", 25, new OrderCommand(tableWithButtons, 25)));
        tableWithButtons.addButton(new Button("order burger", 10, new OrderCommand(tableWithButtons, 10)));

        tableWithButtons.pressButton("order pizza");
    }
}
