public class Data {
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int [][] grid; 
    public Data (int rows,int columns) {
        grid = new int [rows][columns];
    }
    public Data (int[][] arr) {
        grid = arr;
    }
    public String toString () {
        String s = ""; 
        for (int[] row : grid ) {
            for (int col : row ) {
                s+=col+ " ";
            }
            s+="/n ";
        }
        return s;
    }
    public void repopulate () {
        for (int r = 0 ; r<grid.length; r++) {
            for (int c=0; c<grid[0].length; c++ ){
                int val = 0;
                while (val%10 != 0 || val%100==0) {
                    val= (int) (Math.random() * MAX +1);
                }
                grid [r][c] = val;
            }
        }
    }
    public int countIncreasingCols () {
        int count =0; 
        int increase = 1; 
        for (int c = 0 ; c<grid [0].length; c++) {
            for (int r=1; r<grid.length; r++ ){
                if (grid [r][c] >= grid [r-1][c]) {
                    increase ++;
                }
            }
            if (increase == grid.length) {
                count++;
            }
        }
        return count;
    }
}