package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Deer extends Herbivores {

    public Deer() {
        this.weight = 300;
        this.maxPerLocation = 20;
        this.speed = 4;
        this.foodRequired = 50;
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
