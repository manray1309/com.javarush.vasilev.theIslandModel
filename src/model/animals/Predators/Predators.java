package model.animals.Predators;

import model.Cell;
import model.animals.Animal;

import java.util.HashMap;
import java.util.Map;

public abstract class Predators extends Animal {
    // карта шансов на добычу
    public Map<Class<? extends Animal>, Integer> preyChanceMap = new HashMap<>();
    // добавить все возможные шансы на съедение.

    @Override
    public void eat(Cell cell) {

    }

    public Animal choosePrey(Cell cell) {
        for (Animal animal : cell.getAnimals()) {
            if(preyChanceMap.containsKey(animal.getClass())) {
                return animal;
            }
        }
        return null;
    }
}
