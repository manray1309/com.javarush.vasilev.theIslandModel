package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Goat extends Herbivores {

    public Goat() {
        this.weight = 60;
        this.maxPerLocation = 140;
        this.speed = 3;
        this.foodRequired = 10;
    }

    @Override
    public void move(Island island, int x, int y) {

    }

    @Override
    public void reproduce(Cell cell) {

    }
}
