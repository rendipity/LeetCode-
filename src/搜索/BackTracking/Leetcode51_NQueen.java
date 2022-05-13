package 搜索.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode51_NQueen {
    List<List<String>> list=new ArrayList<>();
    char[][] queenChessboard;
    int n;
    public List<List<String>> solveNQueens(int n) {
            queenChessboard=new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(queenChessboard[i],'.');
        }
            this.n=n;
            put(0);
            return list;
    }
    private void put(int num){
        if (num==n){
            List<String> rowList=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s3=String.valueOf(queenChessboard[i]);
                rowList.add(s3);
            }
            list.add(rowList);
            return ;
        }
        for (int j = 0; j < n; j++) {
            if (check(num,j)){
                queenChessboard[num][j]='Q';
                put(num+1);
                queenChessboard[num][j]='.';
            }
        }
    }
    private boolean check(int i,int j){
        // 行检查
        for (int k = 0; k <n ; k++) {
            if(queenChessboard[i][k]=='Q')
                return false;
        }
        // 列检查
        for (int k = 0; k < n; k++) {
            if (queenChessboard[k][j]=='Q')
                return false;
        }
        // \检查
        int k ,l;
        if (i>j){
            k = i - j;
            l=0;
        }else{
            l = j-i;
            k=0;
        }
        while(k<n&&l<n){
            if(queenChessboard[k][l]=='Q')
                return false;
            k++;
            l++;
        }
        // /检查
        if (i+j<n){
            k=i+j;
            l=0;
        }
        else{
            k=n-1;
            l=i+j-n+1;
        }
        while(k>=0&&l<n){
           if(queenChessboard[k][l]=='Q')
               return false;
            k--;
            l++;
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode51_NQueen l=new Leetcode51_NQueen();
        System.out.println(l.solveNQueens(4));
    }
}
