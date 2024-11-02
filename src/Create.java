import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Create {
    public static int[][] CreateSudoku(int[][] mask,int hints){
        int[][] board = new int[9][9];
        if(Solve.SolveSudoku(mask,board)) {
            return getRandomizedArray(board, hints);
        }
        else{
            int[][] blank = new int[9][9];
            return blank;
        }
    }

    public static int[][] getRandomizedArray(int[][] arr, int n) {
        int[][] index = {
                {74, 32, 41, 24, 49, 1, 56, 6, 65},
                {35, 38, 34, 66, 61, 48, 57, 16, 3},
                {23, 5, 31, 17, 81, 46, 62, 42, 40},
                {15, 13, 44, 80, 79, 59, 77, 54, 69},
                {70, 28, 37, 55, 26, 27, 71, 51, 58},
                {25, 7, 53, 64, 8, 21, 20, 76, 19},
                {39, 72, 43, 33, 30, 47, 29, 63, 67},
                {18, 60, 10, 22, 2, 9, 45, 78, 4},
                {50, 36, 75, 73, 68, 14, 52, 11, 12}
        };
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (index[i][j] > n) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
