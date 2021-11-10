import java.util.*;

public class MaxProfit {

    public int getMaxProfit(Integer[] arr){
        int max = Collections.max(Arrays.asList(arr));
        int min = Collections.min(Arrays.asList(arr));
        return max-min;
    }

    public static void main(String[] args) {
        MaxProfit profit = new MaxProfit();
        Integer arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        int maxProfit = profit.getMaxProfit(arr);
        System.out.println("The max profit is "  + maxProfit);
    }
}
