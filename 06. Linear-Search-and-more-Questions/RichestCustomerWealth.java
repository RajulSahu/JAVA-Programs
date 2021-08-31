package com.rajul;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int max_wealth = maximumWealth(arr);
        System.out.println(max_wealth);
    }
    static int maximumWealth(int[][] acc){
        int max_wealth = 0;
        int customer_wealth;
        for (int i = 0; i < acc.length; i++) {
            customer_wealth = calculateWealth(acc[i]);
            if(customer_wealth > max_wealth) {
                max_wealth = customer_wealth;
            }
        }

        return max_wealth;
    }
    static int calculateWealth(int[] person){
        int sum = 0;
        for (int w = 0; w < person.length; w++) {
            sum += person[w];
        }
        return sum;
    }
}
