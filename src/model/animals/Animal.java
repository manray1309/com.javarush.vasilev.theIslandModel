package model.animals;

import model.Cell;
import model.Island;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class Animal {
    public double weight;
    public int maxPerLocation;
    public int speed;
    public double foodRequired;
    public boolean isAlive = true;
    private Cell currentCell;


    public abstract void eat(Cell cell);

    public void move(Island island) {
        Cell currentCell = getCurrentCell();
        int x = currentCell.getX();
        int y = currentCell.getY();

        List<Cell> neighbors = island.getNeighborCells(x, y);

        if(!neighbors.isEmpty()) {
            Cell targetCell = neighbors.get(new Random().nextInt(neighbors.size()));

            if(targetCell.canAccept(this)) {
                currentCell.removeAnimal(this);
                targetCell.addAnimal(this);
                this.setCurrentCell(targetCell);
                System.out.println("The " + getClass().getSimpleName() + " moved to [" + targetCell.getY() + "," + targetCell.getX() + "]");
            }
        }

    }

    public final void reproduce(Cell cell) {
        List<Animal> list = cell.getAnimals().stream()
                .filter(a -> a.getClass().equals(this.getClass()))
                .collect(Collectors.toList());
        long count = list.stream().count();

        if(count >= 2 && count < this.maxPerLocation) {
            Animal baby = createOffSpring();
            cell.addAnimal(baby);
            baby.setCurrentCell(cell);
            System.out.println("The " + getName() + " has multiplied.");
        }
    }

    public abstract Animal createOffSpring();

    public boolean isAlive() {
        return isAlive;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(Cell currendCell) {
        this.currentCell = currendCell;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
