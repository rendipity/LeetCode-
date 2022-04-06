package 贪心算法;

public class Leetcode122 {
    public static void main(String[] args) {
            int []prices={7,1,5,3,6,4};
            Leetcode122 l=new Leetcode122();
        System.out.println(l.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int sum=0;
        int cost=0;
        boolean buy=false;
        for (int i = 0; i < prices.length-1; i++) {
            if (!buy){
                if (prices[i+1]>prices[i])
                {
                    cost=prices[i];
                    buy=true;
                }
            }else if(prices[i+1]<prices[i]){
                    sum+=prices[i]-cost;
                    buy=false;
                }
        }
        if (buy){
            sum+=prices[prices.length-1]-cost;
        }
        return sum;
    }
}
