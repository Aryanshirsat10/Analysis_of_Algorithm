package DynamicProgramming;

import java.util.*;

class Knapsack {
    void knapsackDP(int n, int w, int wt[], int p[]) {
        int dp[][] = new int[n+1][w+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i-1] <= j) {
                    dp[i][j] = Math.max(p[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println("Final Profit is: " + dp[n][w]);
    }
}

public class KnapsackDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Knapsack kp = new Knapsack();
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        System.out.println("Enter the sack size:");
        int w = sc.nextInt();
        int wt[] = new int[n];
        int p[] = new int[n];
        System.out.println("Enter the weight of " + n + " items");
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        System.out.println("Enter the profit of " + n + " items");
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        kp.knapsackDP(n, w, wt, p);
        sc.close();
    }
}
