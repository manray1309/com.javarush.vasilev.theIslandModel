package model.animals.Predators;

import model.Cell;
import model.Island;

public class Snake extends Predators {

    public Snake() {
        this.weight = 15;
        this.maxPerLocation = 30;
        this.speed = 1;
        this.foodRequired = 3;
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
