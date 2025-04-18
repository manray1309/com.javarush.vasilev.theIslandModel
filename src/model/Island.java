package model;

import java.util.ArrayList;
import java.util.List;

public class Island {
     private final int width;
     private final int height;
     Cell[][] grid;

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new Cell[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                grid[y][x] = new Cell();
            }
        }
    }

    public List<Cell> getNeighborCells (int x, int y) {
        List<Cell> neighbors = new ArrayList<>();
        if(x > 0) neighbors.add(grid[y][x - 1]); // левая
        if(x < width - 1) neighbors.add(grid[y][x + 1]); // правая
        if(y > 0) neighbors.add(grid[y - 1][x]); // верхняя
        if(y < height - 1) neighbors.add(grid[y + 1][x]); // нижняя
        return neighbors;
    }

    public Cell getCell(int x, int y) {
        return grid[y][x];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
