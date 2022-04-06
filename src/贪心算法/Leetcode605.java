package 贪心算法;

public class Leetcode605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i <flowerbed.length&&n>0 ; i++) {
            if (flowerbed[i]==0&&(i-1<0||flowerbed[i-1]==0)&&(i+1>= flowerbed.length||flowerbed[i+1]==0)) {
                n--;
                flowerbed[i]=1;
            }
        }
        return n==0;
    }
    public static void main(String[] args) {
            Leetcode605 l=new Leetcode605();
            int[] flowerBed={1,0,0,0,1};
            int n=2;
        System.out.println(l.canPlaceFlowers(flowerBed,n));
    }
}
