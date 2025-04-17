package model.animals.Predators;

import model.Cell;
import model.Island;

public class Bear extends Predators {

    public Bear() {
        this.weight = 500;
        this.maxPerLocation = 5;
        this.speed = 2;
        this.foodRequired = 80;
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
