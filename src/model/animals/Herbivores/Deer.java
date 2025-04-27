package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;

public class Deer extends Herbivores {

    public Deer() {
        this.weight = 300;
        this.maxPerLocation = 20;
        this.speed = 4;
        this.foodRequired = 50;
    }

    @Override
    public Animal createOffSpring() {
        return new Deer();
    }
}
