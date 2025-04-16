package model.animals;

public abstract class Plants {
    public double weight;
    public int maxPerLocation;

    public Plants(int maxPerLocation, double weight) {
        this.maxPerLocation = maxPerLocation;
        this.weight = weight;
    }
}
