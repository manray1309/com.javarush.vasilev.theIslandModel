package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Mouse extends Herbivores {

    public Mouse() {
        this.weight = 0.05;
        this.maxPerLocation = 500;
        this.speed = 1;
        this.foodRequired = 0.01;
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
