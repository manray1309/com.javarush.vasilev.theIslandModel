package model.animals.Herbivores;

import model.Cell;
import model.Island;
import model.animals.Animal;
import model.animals.Plant;

import java.util.ArrayList;

public class Duck extends Herbivores {

    public Duck() {
        this.weight = 1;
        this.maxPerLocation = 200;
        this.speed = 4;
        this.foodRequired = 0.15;
    }

    @Override
    public void eat(Cell cell) {
        for (Animal animal : new ArrayList<>(cell.getAnimals())) {
            if (animal instanceof Caterpillar) {
                cell.removeAnimal(animal);
                this.foodRequired = 0;
                System.out.println("The " + getName() + " ate the caterpillar");
                return;
            }
        }
        Plant plant = cell.getPlant();
        if (plant != null) {
            cell.removePlant();
            this.foodRequired = 0;
            System.out.println("The " + getName() + " ate the plant");
        }
    }

    @Override
    public Animal createOffSpring() {
        return new Duck();
    }
}
