package model.animals.Predators;

import model.Cell;
import model.Island;

public class Fox extends Predators {

    public Fox() {
        this.weight = 8;
        this.maxPerLocation = 30;
        this.speed = 2;
        this.foodRequired = 2;
    }

    @Override
    public void eat(Cell cell) {

    }

    @Override
    public void move(Island island, int x, int y) {

    }

    @Override
    public void reproduce(Cell cell) {

    }
}
