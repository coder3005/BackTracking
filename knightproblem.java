//knight problem (horse in chess) 
package BackTracking;

public class solution {
    static int dr[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int dc[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static boolean knightTour(int row, int col, int move, int chess[][]) {
        if (move == 64) {
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                    System.out.print(chess[r][c] + " ");
                }
                System.out.println();
            }
            return true;
        }
        if (row < 0 || col < 0 || row >= 8 || col >= 8)
            return false;
        if (chess[row][col] != -1)
            return false;

        chess[row][col] = move;

        for (int choice = 0; choice < 8; choice++) {
            int newRow = row + dr[choice];
            int newCol = col + dc[choice];

            boolean res = knightTour(newRow, newCol, move + 1, chess);
            if (res == true)
                return res;
        }

        chess[row][col] = -1; // backtracking

        return false;
    }

    public static void main(String[] args) {
        int srcRow = 0, srcCol = 0;
        int chess[][] = new int[8][8];
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                chess[r][c] = -1;
            }
        }
        knightTour(srcRow, srcCol, 0, chess);
    }
}
