package model.animals.Predators;

import model.Cell;
import model.Island;

public class Eagle extends Predators {

    public Eagle() {
        this.weight = 6;
        this.maxPerLocation = 20;
        this.speed = 3;
        this.foodRequired = 1;
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
