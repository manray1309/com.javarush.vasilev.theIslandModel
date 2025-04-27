package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;

public class Mouse extends Herbivores {

    public Mouse() {
        this.weight = 0.05;
        this.maxPerLocation = 500;
        this.speed = 1;
        this.foodRequired = 0.01;
    }

    @Override
    public Animal createOffSpring() {
        return new Mouse();
    }
}
