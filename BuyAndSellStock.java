public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};

        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int num : arr)
        {
            if (num < minBuy)
            {
                minBuy = num;
            }
            else if (num - minBuy > maxProfit)
            {
                maxProfit = num - minBuy;
            }
        }
        System.out.println(maxProfit);
    }
}
