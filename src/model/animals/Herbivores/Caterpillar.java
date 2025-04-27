package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;

public class Caterpillar extends Herbivores {

    public Caterpillar() {
        this.weight = 0.01;
        this.maxPerLocation = 1000;
        this.speed = 0;
        this.foodRequired = 0;
    }

    @Override
    public Animal createOffSpring() {
        return new Caterpillar();
    }
}
