class Solution {
   public int buyChoco(int[] prices, int money) {
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        for (int num : prices) {
            if (num < small1) {
                small2 = small1;
                small1 = num;
            } else if (num < small2) {
                small2 = num;
            }
        }

        if (money - (small1 + small2) > -1)
            return money - (small1 + small2);
        else
            return money;
    }
}