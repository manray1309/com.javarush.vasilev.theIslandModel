package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;

public class Rabbit extends Herbivores {

    public Rabbit() {
        this.weight = 2;
        this.maxPerLocation = 150;
        this.speed = 2;
        this.foodRequired = 0.45;
    }

    @Override
    public Animal createOffSpring() {
        return new Rabbit();
    }
}
