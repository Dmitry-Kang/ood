package ru.omsu.imit.sem5.generating.singleton;

public final class Server {
    private static Server server;
    private String name;
//    private List<String> users;

    // Делаем конструктор приватным чтобы его не создавали по многу раз
    private Server(String value) {
        this.name = value;
//        users = new ArrayList<>();
    }

    // Возвращает первый созданный сервер, если сервер ещё не был создан - создаёт первый сервер
    public static Server getServer(String value) {
        if (server == null) {
            server = new Server(value);
        }
        return server;
    }

    public String getName()
    {
        return name;
    }

    public boolean work() {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return true;
    }
}
