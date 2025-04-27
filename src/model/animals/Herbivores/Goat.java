package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;

public class Goat extends Herbivores {

    public Goat() {
        this.weight = 60;
        this.maxPerLocation = 140;
        this.speed = 3;
        this.foodRequired = 10;
    }

    @Override
    public Animal createOffSpring() {
        return new Goat();
    }
}
