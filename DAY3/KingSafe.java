public class KingSafe {
    public static void main(String[] args){
        char[][] board = new char[][] {
            { '.', '.', '.', '.', '.', '.', '.', '.'},
            { '.', '.', '.', '.', '.', '.', '.', '.'},
            { '.', '.', '.', '.', '.', '.', '.', '.'},
            { '.', '.', '.', '.', '.', '.', '.', '.'},
            { '.', '.', '.', '.', '.', '.', '.', '.'},
            { '.', '.', '.', 'K', '.', '.', '.', '.'},
            { '.', '.', '.', '.', '.', '.', '.', '.'},
            { 'H', '.', '.', '.', 'C', '.', 'E', 'Q'},
        };
        boolean result = isKingSafe(board);
        System.out.println(result);
    }

    public static boolean checkKingSafe(char[][] board, int row, int col, char ch){
        if(ch =='Q'){
            //For upper row
            for(int i=row-1 ; i>=0; i--){
                if(board[i][col] == 'K'){
                    return false;
                }
            }
            //for lower row
            for(int i=row+1; i<=8; i++){
                if(board[i][col] == 'K'){
                    return false;
                }
            }
            //for right column
            for(int i=col+1; i<=8; i++){
                if(board[row][i] == 'K'){
                    return false;
                }
            }
            //for left column
            for(int i=col-1; i>=0; i--){
                if(board[row][i] == 'K'){
                    return false;
                }
            }
            //for above left diagonal
            for(int i=row; i>=0; i--){
                if(board[i-1][i-1] == 'K'){
                    return false;
                }
            }
            return true;
        }
        else if(ch =='E'){
            //For upper row
            for(int i=row-1 ; i>=0; i--){
                if(board[i][col] == 'K'){
                    return false;
                }
            }
            //for lower row
            for(int i=row+1; i<=8; i++){
                if(board[i][col] == 'K'){
                    return false;
                }
            }
            //for right column
            for(int i=col+1; i<=8; i++){
                if(board[row][i] == 'K'){
                    return false;
                }
            }
            //for left column
            for(int i=col-1; i>=0; i--){
                if(board[row][i] == 'K'){
                    return false;
                }
            }
            return true;
        }
        else if(board[row][col] == 'C'){
            //for above left diagonal
            for(int i=row; i>=0; i--){
                if(board[i-1][i-1] == 'K'){
                    return false;
                }
            }
            return true;
        }
        else if(board[row][col] == 'H'){
            //for above right hand
            if(board[row-2][col+1] == 'K'){
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean isKingSafe(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] >= 'A' && board[i][j] <= 'Z'){
                    char ch = board[i][j];
                    if(ch != 'K'){
                        if(checkKingSafe(board, i, j, ch) == false){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
