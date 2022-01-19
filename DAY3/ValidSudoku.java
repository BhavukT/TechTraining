public class ValidSudoku{
    public static void main(String[] args){
        char[][] arr = new char[][] {
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        boolean result = validSudoku(arr, 9);
        System.out.println(result);
    }
    public static boolean isValidPosition(char[][] arr, int row, int col, char ch){
        //Check for Row to End
        for(int i=row+1; i<9; i++){
            if(arr[i][col] == ch){
                return false;
            }
        }
        //check for Row to Start
        for(int i=row-1; i>=0; i--){
            if(arr[i][col] == ch){
                return false;
            }
        }
        //check for Col to Start
        for(int i=col+1; i<9; i++){
            if(arr[row][i] == ch){
                return false;
            }
        }
        //check for Col to End
        for(int i=col-1; i>=0; i--){
            if(arr[row][i] == ch){
                return false;
            }
        }

        //check in the small box
        int startRow = row - row%3;
        int startCol = col - col%3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(startRow+i == row && startCol+j == col){
                    continue;
                }
                if(arr[startRow+i][startCol+j] == ch){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean validSudoku(char[][] arr, int n){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] >= '1' && arr[i][j] <= '9'){
                    char ch = arr[i][j];
                    if(isValidPosition(arr, i, j, ch) == false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}