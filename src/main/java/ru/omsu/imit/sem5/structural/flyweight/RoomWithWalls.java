package ru.omsu.imit.sem5.structural.flyweight;

public class RoomWithWalls {
    private int wallX;
    private BulletType bulletType;
    private Weapon weapon;
    private BulletTypeFactory btf;

    public RoomWithWalls(int wallX) {
        bulletType.state = State.FieldTested;
        bulletType.type = Type.ArmorPiercing;
        this.wallX = wallX;
        weapon = new Weapon(bulletType);
        btf = new BulletTypeFactory();
        btf.add(bulletType);
    }

    public void work() {
        BulletType brokenBulletType = new BulletType(Type.ArmorPiercing, State.Broken);
        btf.add(brokenBulletType);

        weapon.addAmmo();
        weapon.fire();
        for (Bullet bullet: weapon.getAmmo()) {
            if (bullet.getX() > 100) {
                bullet.setType(btf.get(State.Broken));
            }
        }
    }
}
