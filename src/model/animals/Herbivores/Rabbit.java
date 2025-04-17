package model.animals.Herbivores;

import model.Cell;
import model.Island;

public class Rabbit extends Herbivores {

    public Rabbit() {
        this.weight = 2;
        this.maxPerLocation = 150;
        this.speed = 2;
        this.foodRequired = 0.45;
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
