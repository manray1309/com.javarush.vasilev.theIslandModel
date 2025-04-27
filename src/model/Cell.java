package model;

import model.animals.Animal;
import model.animals.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Cell {
    private final int x;
    private final int y;
    private final List<Animal> animals = new ArrayList<>();
    private Plant plant;
    public final ReentrantLock lock = new ReentrantLock();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int countOf(Class<? extends Animal> clazz) {
        int count = 0;
        for (Animal animal : animals) {
            if (clazz.equals(animal.getClass())) {
                count++;
            }
        }
        return count;
    }

    public boolean canAccept(Animal animal) {
        return countOf(animal.getClass()) < animal.maxPerLocation;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
