package model.animals.Herbivores;

import model.Cell;
import model.animals.Animal;
import model.animals.Plant;


public abstract class Herbivores extends Animal {

    @Override
    public void eat(Cell cell) {
        Plant plant = cell.getPlant();
        if (plant != null) {
            cell.removePlant();
            this.foodRequired = 0;
            System.out.println("The " + getName() + " ate the plant");
        }
    }
}
