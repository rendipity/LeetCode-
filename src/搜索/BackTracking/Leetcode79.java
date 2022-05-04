package 搜索.BackTracking;

public class Leetcode79 {
    char[][] board;
    String word;
    int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
    int[][] visited;
    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.word=word;
        visited=new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]==word.charAt(0)){
                    if (tryMatch(i,j,1))
                        return true;
                }
            }
        }
        return false;
    }
    private boolean tryMatch(int i,int j,int matchLen){
        if (matchLen>=word.length())
            return true;
        visited[i][j]=1;
        for (int k = 0; k < dir.length; k++) {
            int newI=i+dir[k][0];
            int newJ=j+dir[k][1];
            if (newI>=0&&newI<board.length&&newJ>=0&&newJ<board[newI].length&&visited[newI][newJ]==0
                    &&board[newI][newJ]==word.charAt(matchLen)) {
                if (tryMatch(newI, newJ, matchLen + 1))
                    return true;
            }
        }
        visited[i][j]=0;
        return false;
    }
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCEEE";
        Leetcode79 l =new Leetcode79();
        System.out.println(l.exist(board,word));
    }
}
