package ru.omsu.imit.sem5.structural.flyweight;

public class RoomWithWalls {
    private int wallX;
    private BulletType bulletType;
    private Weapon weapon;
    private BulletTypeFactory btf;

    public RoomWithWalls(int wallX) {
        bulletType = new BulletType(Type.ArmorPiercing, State.FieldTested);

        this.wallX = wallX;

        weapon = new Weapon(bulletType);

        btf = new BulletTypeFactory();
        btf.add(bulletType);
    }

    public void work() {
        BulletType brokenBulletType = new BulletType(Type.ArmorPiercing, State.Broken);
        btf.add(brokenBulletType);
        boolean stop = false;

        while (true) {
            weapon.addAmmo();
            weapon.fire();
            for (Bullet bullet: weapon.getAmmo()) {
                if (bullet.getX() > wallX) {
                    bullet.setType(btf.get(State.Broken));
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
    }
}
