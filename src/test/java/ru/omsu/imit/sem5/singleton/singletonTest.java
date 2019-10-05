package ru.omsu.imit.sem5.singleton;

import org.junit.Assert;
import org.junit.Test;

public class singletonTest
{
    @Test
    public void testSingleton()
    {
//        Server a = new Server("ss"); // Создать копию неполучится, т.к. конструктор приватный
        Server site = Server.getServer("Site");
        Server game = Server.getServer("Game");
        Assert.assertTrue(game.getName() == "Site");
        Assert.assertTrue(site.getName() == "Site");
        Assert.assertTrue(site.work());
    }
}
