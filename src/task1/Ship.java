package task1;

import java.io.Serializable;
import java.util.List;

public class Ship implements Serializable {
    private String name;
    private int weight;
    private List<Droid> droids;
    private transient boolean damaged = false;

    public Ship() {
    }

    public Ship(String name, int weight, List<Droid> droids, boolean damaged) {
        this.name = name;
        this.weight = weight;
        this.droids = droids;
        this.damaged = damaged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Droid> getDroids() {
        return droids;
    }

    public void setDroids(List<Droid> droids) {
        this.droids = droids;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", droids=" + droids +
                ", damaged=" + damaged +
                '}';
    }
}
