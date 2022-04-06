package 贪心算法;

public class Leetcode121 {
    public static void main(String[] args) {
    int [] prices={7,1,5,3,6,4};
    Leetcode121 l=new Leetcode121();
        System.out.println(l.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int minPrice=10000;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minPrice)
                minPrice=prices[i];
            else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
