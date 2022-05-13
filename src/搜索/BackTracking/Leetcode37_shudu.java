package 搜索.BackTracking;

public class Leetcode37_shudu {
    public void solveSudoku(char[][] board) {
        fill(board,0,0);
    }
    private boolean fill(char[][] board ,int i,int j){
        int  l=j, k = i;
        for (; k <9; k++) {
            for (; l < 9; l++) {
                if (board[k][l]=='.') {
                    for (int m = 1; m <10 ; m++) {
                        if (check(board,k,l,m)){
                            board[k][l]=(char)('0'+m);
                            if (fill(board,k,l))
                                return true;
                        }
                    }
                    board[k][l]='.';
                    return false;
                }
            }
            l=0;
        }
        return k==9&&l==0;
    }
    private boolean check(char[][] board ,int i,int j,int m){
        //检查行
        for (int k = 0; k < 9; k++) {
            if (board[i][k]==m+'0')
                return false;
        }
        //检查列
        for (int k = 0; k < 9; k++) {
            if (board[k][j]==m+'0')
                return false;
        }
        //检查方格
        int r=i/3*3;
        int c=j/3*3;
        for (int k = r; k <r+3; k++) {
            for (int l = c; l <c+3; l++) {
                if (board[k][l]=='0'+m)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Leetcode37_shudu l =new Leetcode37_shudu();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        l.solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
