package model.animals.Predators;

import model.Cell;
import model.Island;
import model.animals.Herbivores.*;

public class Wolf extends Predators {

    public Wolf() {
        this.weight = 50;
        this.maxPerLocation = 30;
        this.speed = 3;
        this.foodRequired = 8;
        preyChanceMap.put(Horse.class, 10);
        preyChanceMap.put(Deer.class, 15);
        preyChanceMap.put(Rabbit.class, 60);
        preyChanceMap.put(Mouse.class, 80);
        preyChanceMap.put(Goat.class, 60);
        preyChanceMap.put(Sheep.class, 70);
        preyChanceMap.put(Duck.class, 40);
    }

    @Override
    public void move(Island island, int x, int y) {

    }

    @Override
    public void reproduce(Cell cell) {

    }
}
