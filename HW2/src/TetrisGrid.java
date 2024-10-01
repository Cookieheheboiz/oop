import java.util.*;
public class TetrisGrid {
    private boolean[][] grid;
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public void clearRows() {
        for(int i = 0; i < grid[0].length; i++) {
            boolean check = true;
            for(int j = 0; j < grid.length; j++) {
                if(!grid[j][i]) {
                    check = false;
                    break;
                }
            }
            if(check) {
                for(int j = i; j < grid[0].length-1; j++) {
                    for(int k = 0; k < grid.length; k++) {
                        grid [k][j] = grid[k][j+1];
                    }
                }
                for(int j = 0 ; j<grid.length; j++) {
                    grid[j][grid[0].length-1] = false;
                }
                i--;
            }
        }
    }

    public boolean[][] getGrid() {
        return grid;
    }
}
