package model;

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
