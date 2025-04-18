package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Caterpillar extends Herbivores {

    public Caterpillar() {
        this.weight = 0.01;
        this.maxPerLocation = 1000;
        this.speed = 0;
        this.foodRequired = 0;
    }

    @Override
    public void move(Island island, int x, int y) {

    }

    @Override
    public void reproduce(Cell cell) {

    }
}
