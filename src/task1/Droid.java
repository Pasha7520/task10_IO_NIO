package task1;

import java.io.Serializable;

public class Droid implements Serializable {
    private String name;
    private int damage;
    private int health;
    private transient String model = "331A";

    public Droid() {
    }

    public Droid(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", model='" + model + '\'' +
                '}';
    }
}
