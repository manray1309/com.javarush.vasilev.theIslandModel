package model.animals;

import model.Cell;
import model.Island;

public abstract class Animal {
    public double weight;
    public int maxPerLocation;
    public int speed;
    public double foodRequired;
    public boolean isAlive = true;

    public abstract void eat(Cell cell);

    public abstract void move(Island island, int x, int y);

    public abstract void reproduce(Cell cell);

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
