package model.animals;

public abstract class Plant {
    public double weight;
    public int maxPerLocation;

    public Plant(int maxPerLocation, double weight) {
        this.maxPerLocation = maxPerLocation;
        this.weight = weight;
    }
}
