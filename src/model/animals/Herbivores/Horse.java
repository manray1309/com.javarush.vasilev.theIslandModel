package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;

public class Horse extends Herbivores {

    public Horse() {
        this.weight = 400;
        this.maxPerLocation = 20;
        this.speed = 4;
        this.foodRequired = 60;
    }

    @Override
    public Animal createOffSpring() {
        return new Horse();
    }
}
