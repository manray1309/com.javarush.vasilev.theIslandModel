package model.animals.Predators;

import model.Cell;
import model.Island;
import model.animals.Animal;
import model.animals.Herbivores.*;

public class Bear extends Predators {

    public Bear() {
        this.weight = 500;
        this.maxPerLocation = 5;
        this.speed = 2;
        this.foodRequired = 80;
        preyChanceMap.put(Snake.class, 80);
        preyChanceMap.put(Horse.class, 40);
        preyChanceMap.put(Deer.class, 80);
        preyChanceMap.put(Rabbit.class, 80);
        preyChanceMap.put(Mouse.class, 90);
        preyChanceMap.put(Goat.class, 70);
        preyChanceMap.put(Sheep.class, 70);
        preyChanceMap.put(Duck.class, 10);
    }

    @Override
    public Animal createOffSpring() {
        return new Bear();
    }
}
