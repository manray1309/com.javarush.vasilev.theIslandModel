package model.animals.Predators;

import model.Cell;
import model.Island;
import model.animals.Animal;
import model.animals.Herbivores.Caterpillar;
import model.animals.Herbivores.Duck;
import model.animals.Herbivores.Mouse;
import model.animals.Herbivores.Rabbit;

public class Fox extends Predators {

    public Fox() {
        this.weight = 8;
        this.maxPerLocation = 30;
        this.speed = 2;
        this.foodRequired = 2;
        preyChanceMap.put(Rabbit.class, 70);
        preyChanceMap.put(Mouse.class, 90);
        preyChanceMap.put(Duck.class, 60);
        preyChanceMap.put(Caterpillar.class, 40);
    }

    @Override
    public Animal createOffSpring() {
        return new Fox();
    }
}
