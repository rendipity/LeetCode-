package 搜索.数学;

import java.util.Arrays;

public class sumAB {
    static int solve(int[] arr, int n, int m) {
        int sum=0;
        Arrays.sort(arr);
        for (int i = 0; arr[i]<m/2&&i<arr.length; i++) {
            int l=0,r=arr.length-1;
            int t=m-arr[i];
            boolean find=false;
            while(l<=r){
                int c=(l+r)/2;
                if (arr[c]==t) {
                    find = true;
                    break;
                }
                else if (arr[c]<t)
                    l=c+1;
                else
                    r=c-1;
            }
                if (find) {
                    sum++;
                }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumAB. solve(new int[]{0,1,2 ,3, 4, 5 ,6 ,7 ,8 ,9 },10,6));
    }
}
