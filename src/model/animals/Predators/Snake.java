package model.animals.Predators;

import model.Cell;
import model.Island;
import model.animals.Animal;
import model.animals.Herbivores.Duck;
import model.animals.Herbivores.Mouse;
import model.animals.Herbivores.Rabbit;

public class Snake extends Predators {

    public Snake() {
        this.weight = 15;
        this.maxPerLocation = 30;
        this.speed = 1;
        this.foodRequired = 3;
        preyChanceMap.put(Fox.class, 15);
        preyChanceMap.put(Rabbit.class, 20);
        preyChanceMap.put(Mouse.class, 40);
        preyChanceMap.put(Duck.class, 10);
    }

    @Override
    public Animal createOffSpring() {
        return new Snake();
    }
}
