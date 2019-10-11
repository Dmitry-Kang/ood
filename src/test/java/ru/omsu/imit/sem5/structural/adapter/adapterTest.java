package ru.omsu.imit.sem5.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class adapterTest {
    public void assertRegister(String name, int age, String mail, String pass, Site site) {
        Assert.assertTrue(site.registerUser(name, age, mail, pass));
        Assert.assertFalse(site.registerUser(name, age, mail, pass));
    }

    public void assertLoginLogout(String name, int age, String mail, String pass, Site site) {
        Assert.assertFalse(site.login(name, age, mail, pass));
        Assert.assertTrue(site.logout(name, age, mail, pass));
    }

    @Test
    public void testServer() {
        Site newSite = new Site();
        assertRegister("Dmitry", 20, "alexandrov.dp@mail.ru", "lol", newSite);
        assertRegister("Bob", 10, "bob.m@gmail.com", "stоol", newSite);
        assertRegister("Katya", 22, "Kate.beauty@rambler.ru", "jap@n", newSite);
        assertRegister("Lissa", 21, "leassa@bk.ru", "r2D2", newSite);

        assertLoginLogout("Dmitry", 20, "alexandrov.dp@mail.ru", "lol", newSite);
        assertLoginLogout("Bob", 10, "bob.m@gmail.com", "stоol", newSite);
        assertLoginLogout("Katya", 22, "Kate.beauty@rambler.ru", "jap@n", newSite);
        assertLoginLogout("Lissa", 21, "leassa@bk.ru", "r2D2", newSite);
    }
}
