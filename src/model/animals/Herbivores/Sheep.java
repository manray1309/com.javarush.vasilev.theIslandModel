package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;

public class Sheep extends Herbivores {

    public Sheep() {
        this.weight = 70;
        this.maxPerLocation = 140;
        this.speed = 3;
        this.foodRequired = 15;
    }

    @Override
    public Animal createOffSpring() {
        return new Sheep();
    }
}
