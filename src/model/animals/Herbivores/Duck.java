package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Duck extends Herbivores {

    public Duck() {
        this.weight = 1;
        this.maxPerLocation = 200;
        this.speed = 4;
        this.foodRequired = 0.15;
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
