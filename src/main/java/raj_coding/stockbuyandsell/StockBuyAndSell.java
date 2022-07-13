package raj_coding.stockbuyandsell;

public class StockBuyAndSell {

    public static void main(String[] args) {

        int []prices = new int[]{7,1,5,3,6,4};

        int min_value = prices[0];

        int max_value = prices[0];

        int max_profit = 0;
        for(int i = 0 ; i < prices.length ; i++) {
            if(prices[i] < min_value) {
                min_value = prices[i];
            }
            max_profit = Math.max(prices[i] - min_value,max_profit);
        }
        System.out.println(max_profit);
    }
}
