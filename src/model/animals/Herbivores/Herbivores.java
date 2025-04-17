package model.animals.Herbivores;

import model.Cell;
import model.animals.Animal;

import java.util.HashMap;
import java.util.Map;

public abstract class Herbivores extends Animal {
    public Map<Class<? extends Animal>, Integer> preyChanceMap = new HashMap<>();

    @Override
    public void eat(Cell cell) {

    }
}
