public class Print {
    public static void PrintSudoku(int[][] sudoku,int[][] mask)  {
        String RESET = "\033[0m";
        String RED = "\033[41m";
        String WHITE = "\033[47m";
        String BLUE = "\033[44m";
        String AOI = "\033[46m";
        String REDD = "\033[45m";
        String BLACK = "\033[40m";
        String YELLOW = "\033[43m";
        String GREEN = "\033[42m";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int a = mask[i][j] + 39;
                if(sudoku[i][j]!=0 && mask[i][j] == 1) System.out.print(BLACK + sudoku[i][j] + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 2) System.out.print(RED + sudoku[i][j] + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 3) System.out.print(GREEN + sudoku[i][j] + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 4) System.out.print(YELLOW + sudoku[i][j] + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 5) System.out.print(BLUE + sudoku[i][j] + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 6) System.out.print(REDD + sudoku[i][j] + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 7) System.out.print(AOI + sudoku[i][j] + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 8) System.out.print(WHITE + sudoku[i][j]  + " " + RESET);
                else if(sudoku[i][j]!=0 && mask[i][j] == 9) System.out.print(sudoku[i][j] + " ");
                else System.out.print("\033[" + a + "m  " + RESET);
            }
            System.out.println();
        }
    }
}
