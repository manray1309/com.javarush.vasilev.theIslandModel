package model.animals.Predators;

import model.Cell;
import model.Island;
import model.animals.Animal;

import java.util.HashMap;
import java.util.Map;

public abstract class Predators extends Animal {
    // карта шансов на добычу
    public Map<Class<? extends Animal>, Integer> preyChanceMap = new HashMap<>();

    @Override
    public void eat(Cell cell) {
        Animal prey = choosePrey(cell);
         if(prey != null && Math.random() * 100 < preyChanceMap.get(prey.getClass())) {
             cell.removeAnimal(prey);
             this.foodRequired = 0;
             System.out.println("The " + getName() + " ate the " + prey.getName());
         }
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
