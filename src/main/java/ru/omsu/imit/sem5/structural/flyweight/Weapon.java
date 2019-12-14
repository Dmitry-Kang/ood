package ru.omsu.imit.sem5.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Weapon {
    private int x;
    private int y;
    private List<Bullet> ammo;
    private BulletType bulletType;

    public Weapon(BulletType bulletType) {
        ammo = new ArrayList<>();
        this.bulletType = bulletType;
    }

    public void addAmmo() {
        for (int i = 0; i < 100000; i++) {
            ammo.add(new Bullet(x,y,bulletType));
        }
    }

    public void fire() {
        for (Bullet bullet: ammo) {
            bullet.setX(bullet.getX() + 10);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Bullet> getAmmo() {
        return ammo;
    }

    public void setAmmo(List<Bullet> ammo) {
        this.ammo = ammo;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weapon)) return false;
        Weapon weapon = (Weapon) o;
        return getX() == weapon.getX() &&
                getY() == weapon.getY() &&
                Objects.equals(getAmmo(), weapon.getAmmo()) &&
                Objects.equals(getBulletType(), weapon.getBulletType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getAmmo(), getBulletType());
    }
}
