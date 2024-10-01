import java.util.*;
public class CharGrid {
    private char[][] grid;
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }
    public int charArea(char ch) {
        int minrow = 100;
        int mincol = 100;
        int maxrow = -1;
        int maxcol = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ch) {
                    minrow = Math.min(minrow, i);
                    mincol = Math.min(mincol, j);
                    maxrow = Math.max(maxrow, i);
                    maxcol = Math.max(maxcol, j);
                }
            }
        }
        int s = (maxrow - minrow + 1) * (maxcol - mincol +1);
        return s;
    }

    public int left(int i, int j) {
        int count = 0;
        for (int l = j-1; l >= 0; l--) {
            if (grid[i][l] == grid[i][j]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int right(int i, int j) {
        int count = 0;
        int col = grid[0].length;
        for (int r = j+1; r < col; r++) {
            if (grid[i][r] == grid[i][j]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int up(int i, int j) {
        int count = 0;
        for (int u = i-1; u >= 0; u--) {
            if (grid[u][j] == grid[i][j]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int down(int i, int j) {
        int count = 0;
        int row = grid.length;
        for (int d = i+1; d < row; d++) {
            if (grid[d][j] == grid[i][j]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int countPlus() {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 1; i < row-1; i++) {
            for (int j = 1; j < col-1; j++) {
                if (up(i, j) != 0 && up(i, j) == down(i,j) && left(i,j) == right(i,j) && up(i, j) == left(i,j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        char[][] grid = new char[][]{
//            {'c', 'a', 'x'},
//            {'b', ' ', 'b'},
//            {' ', ' ',  'a'},
//
//        };

        char[][] grid = new char[][]{
                {' ', ' ', 'p', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'p', ' ', ' ', ' ', ' ', 'x', ' '},
                {'p', 'p', 'p', 'p', 'p', ' ', 'x', 'x', 'x'},
                {' ', ' ', 'p', ' ', ' ', 'y', ' ', 'x', ' '},
                {' ', ' ', 'p', ' ', 'y', 'y', 'y', ' ', ' '},
                {'z', 'z', 'z', 'z', 'z', 'y', 'z', 'z', 'z'},
                {' ', ' ', 'x', 'x', ' ', 'y', ' ', ' ', ' '},
        };
        CharGrid CharGrid = new CharGrid(grid);
//        System.out.println(CharGrid.charArea('c'));
//        System.out.println(CharGrid.charArea('a'));
//        System.out.println(CharGrid.charArea('x'));
        System.out.println(CharGrid.countPlus());

    }


}
