package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Horse extends Herbivores {

    public Horse() {
        this.weight = 400;
        this.maxPerLocation = 20;
        this.speed = 4;
        this.foodRequired = 60;
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
