package model.animals.Predators;

import model.Cell;
import model.Island;

public class Wolf extends Predators {

    public Wolf() {
        this.weight = 50;
        this.maxPerLocation = 30;
        this.speed = 3;
        this.foodRequired = 8;
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
