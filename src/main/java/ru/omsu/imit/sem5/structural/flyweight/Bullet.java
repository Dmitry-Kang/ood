package ru.omsu.imit.sem5.structural.flyweight;


import java.util.Objects;

public class Bullet {
    private int x;
    private int y;
    private BulletType type;

    public Bullet(int x, int y, BulletType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public BulletType getType()
    {
        return type;
    }

    public void setType(BulletType type)
    {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bullet)) return false;
        Bullet bullet = (Bullet) o;
        return getX() == bullet.getX() &&
                getY() == bullet.getY() &&
                Objects.equals(getType(), bullet.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getType());
    }
}
