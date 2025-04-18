package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Sheep extends Herbivores {

    public Sheep() {
        this.weight = 70;
        this.maxPerLocation = 140;
        this.speed = 3;
        this.foodRequired = 15;
    }

    @Override
    public void move(Island island, int x, int y) {

    }

    @Override
    public void reproduce(Cell cell) {

    }
}
