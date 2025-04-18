package model.animals.Predators;

import model.Cell;
import model.Island;
import model.animals.Herbivores.Duck;
import model.animals.Herbivores.Mouse;
import model.animals.Herbivores.Rabbit;

public class Eagle extends Predators {

    public Eagle() {
        this.weight = 6;
        this.maxPerLocation = 20;
        this.speed = 3;
        this.foodRequired = 1;
        preyChanceMap.put(Fox.class, 10);
        preyChanceMap.put(Rabbit.class, 90);
        preyChanceMap.put(Mouse.class, 90);
        preyChanceMap.put(Duck.class, 80);
    }

    @Override
    public void move(Island island, int x, int y) {

    }

    @Override
    public void reproduce(Cell cell) {

    }
}
