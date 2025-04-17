package model;

import model.animals.Animal;
import model.animals.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Cell {
    private final List<Animal> animals = new ArrayList<>();
    private Plant plant;
    public final ReentrantLock lock = new ReentrantLock();

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void removePlant() {
        plant = null;
    }
}
