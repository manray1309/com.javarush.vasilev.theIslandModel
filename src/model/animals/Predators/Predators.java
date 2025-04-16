package model.animals.Predators;

import model.animals.Animal;

public abstract class Predators extends Animal {
    public Predators(double weight, int maxPerLocation, int speed, int foodRequired) {
        super(weight, maxPerLocation, speed, foodRequired);
    }
}
