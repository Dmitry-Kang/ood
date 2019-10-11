package ru.omsu.imit.sem5.generating.prototype;

import java.util.Objects;

public class AndroidApp extends App {
    private int versionSupport;
    private String description;

    public AndroidApp() {
        super();
    }

    public AndroidApp(int versionSupport, String description, String name, int size) {
        super(name, size);
        this.description = description;
        this.versionSupport = versionSupport;
    }

    public AndroidApp(AndroidApp target) {
        super(target);
        if (target != null) {
            this.description = target.getDescription();
            this.versionSupport = target.getVersionSupport();
        }
    }

    @Override
    public AndroidApp clone() {
        return new AndroidApp(this);
    }

    public int getVersionSupport() {
        return versionSupport;
    }

    public void setVersionSupport(int versionSupport) {
        this.versionSupport = versionSupport;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AndroidApp that = (AndroidApp) o;
        return versionSupport == that.versionSupport &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), versionSupport, description);
    }
}
