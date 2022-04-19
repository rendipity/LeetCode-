package 搜索.DFS;

import java.util.Arrays;

public class Leetcode130 {
    public void solve(char[][] board) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j]=='O'){
                update(board,0,j);
            }
            if (board[board.length-1][j]=='O'){
                update(board,board.length-1,j);
            }
        }
        for (int i = 1; i <board.length ; i++) {
            if (board[i][0]=='O'){
                update(board,i,0);
            }
            if (board[i][board[0].length-1]=='O'){
                update(board,i,board[0].length-1);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]=='O')
                    board[i][j]='X';
                else if (board[i][j]=='0')
                    board[i][j]='O';
            }
        }

        System.out.println(1);
    }
    void update(char[][] board,int i,int j){
        board[i][j]='0';
        if (i-1>=0&&board[i-1][j]=='O')
            update(board,i-1,j);
        if (i+1<board.length&&board[i+1][j]=='O')
            update(board,i+1,j);
        if (j-1>=0&&board[i][j-1]=='O')
            update(board,i,j-1);
        if (j+1<board[i].length&&board[i][j+1]=='O')
            update(board,i,j+1);
    }

    public static void main(String[] args) {
        //[["X","O","X"],["O","X","O"],["X","O","X"]]
        //char[][] board={{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] board={{'X','O','X'},{'O','X','O'},{'X','O','X'}};
        Leetcode130 l =new Leetcode130();
        l.solve(board);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
}
