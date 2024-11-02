import java.util.*;

public class Main {
    public static int[][] defaultMask = {
            {1,1,1,2,2,2,3,3,3},
            {1,1,1,2,2,2,3,3,3},
            {1,1,1,2,2,2,3,3,3},
            {4,4,4,5,5,5,6,6,6},
            {4,4,4,5,5,5,6,6,6},
            {4,4,4,5,5,5,6,6,6},
            {7,7,7,8,8,8,9,9,9},
            {7,7,7,8,8,8,9,9,9},
            {7,7,7,8,8,8,9,9,9},
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("数独工具 by xxx\n生成数独请输入1，求解数独请输入2：");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("要生成哪种数独？\n生成传统数独请输入1，生成锯齿数独请输入2：");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.println("请输入你需要的提示数（建议在23到30之间）：");
                int hints = scanner.nextInt();
                int[][] sudoku = Create.CreateSudoku(defaultMask,hints);
                Print.PrintSudoku(sudoku,defaultMask);
                System.out.println("生成成功，是否求解？求解输入1，退出输入2");
                int m1 = scanner.nextInt();
                if (m1 == 1) {
                    Solve.SolveSudoku(defaultMask,sudoku);
                    Print.PrintSudoku(sudoku,defaultMask);
                }
            }
            else if (m == 2) {
                System.out.println("请输入你需要的提示数（建议在23到30之间）：");
                int hints = scanner.nextInt();
                System.out.println("请输入你的mask,每行输入9个数字，用空格隔开：\n示例：\n1 1 1 2 2 2 3 3 3\n1 1 1 2 2 2 3 3 3\n1 1 1 2 2 2 3 3 3\n4 4 4 5 5 5 6 6 6\n4 4 4 5 5 5 6 6 6\n4 4 4 5 5 5 6 6 6\n7 7 7 8 8 8 9 9 9\n7 7 7 8 8 8 9 9 9\n7 7 7 8 8 8 9 9 9");
                int[][] mask = new int[9][9];
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        mask[i][j] = scanner.nextInt();
                    }
                }
                System.out.println("正在生成，此过程可能要持续几分钟...");
                int[][] sudoku = Create.CreateSudoku(mask,hints);
                Print.PrintSudoku(sudoku,mask);
                System.out.println("生成成功，是否求解？求解输入1，退出输入2");
                int m1 = scanner.nextInt();
                if (m1 == 1) {
                    Solve.SolveSudoku(mask,sudoku);
                    Print.PrintSudoku(sudoku,mask);
                }
            }
        }
        else if (n == 2) {
            System.out.println("请输入你的数独,每行输入9个数字，用空格隔开，要填的空输0：\ntips:为了防止跑得太慢，可以多输几排0");
            int[][] sudoku = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = scanner.nextInt();
                }
            }
            System.out.println("请输入你的mask,每行输入9个数字，用空格隔开：\n示例：\n1 1 1 2 2 2 3 3 3\n1 1 1 2 2 2 3 3 3\n1 1 1 2 2 2 3 3 3\n4 4 4 5 5 5 6 6 6\n4 4 4 5 5 5 6 6 6\n4 4 4 5 5 5 6 6 6\n7 7 7 8 8 8 9 9 9\n7 7 7 8 8 8 9 9 9\n7 7 7 8 8 8 9 9 9");
            int[][] mask = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    mask[i][j] = scanner.nextInt();
                }
            }
            System.out.println("正在求解，此过程可能要持续几分钟...");
            Solve.SolveSudoku(mask,sudoku);
            Print.PrintSudoku(sudoku,mask);
        }
    }
}
