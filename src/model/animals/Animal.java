package model.animals;

import model.Cell;
import model.Island;

public abstract class Animal {
    public double weight;
    public int maxPerLocation;
    public int speed;
    public int foodRequired;
    public boolean isAlive;

    public Animal(double weight, int maxPerLocation, int speed, int foodRequired) {
        this.weight = weight;
        this.maxPerLocation = maxPerLocation;
        this.speed = speed;
        this.foodRequired = foodRequired;
        this.isAlive = true;
    }

    public abstract void eat(Cell cell);

    public abstract void move(Island island, int x, int y);

    public abstract void reproduce(Cell cell);

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
