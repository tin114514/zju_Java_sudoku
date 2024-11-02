public class Solve {
    public static boolean SolveSudoku(int[][] mask,int[][] arr) {
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(arr[row][col]==0){
                    for (int i = 1; i <= 9; i++) {
                        if(isValid(mask, arr, row, col, i)) {
                            arr[row][col] = i;
                        if(SolveSudoku(mask, arr)) return true;
                        arr[row][col]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int[][] mask,int[][] arr,int row,int col,int num){
        for(int i=0;i<9;i++){
            if((arr[row][i]==num && i!=col) || (arr[i][col]==num && i!=row)){
                return false;
            }
        }
        int maskArea = mask[row][col];
        for(int i=0;i<9;i++){
            for (int j = 0; j < 9; j++) {
                if (mask[i][j] == maskArea && arr[i][j] == num && (i != row || j != col)) return false;
            }
        }
        return true;
    }
}
