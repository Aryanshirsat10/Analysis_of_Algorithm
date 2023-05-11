package GreedyAlgorithms;

import java.util.*;

class Knapsack {
    void knapsack3(int n, int w, int wt[], int p[]) {
        double r[] = new double[n];
        double temp;
        double maxval = 0;
        int balance = w;
        for (int i = 0; i < n; i++) {
            r[i] = (double) p[i] / wt[i];
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (r[i] < r[j]) {
                    temp = r[i];
                    r[i] = r[j];
                    r[j] = temp;
                    int temp1 = wt[i];
                    wt[i] = wt[j];
                    wt[j] = temp1;
                    int temp2 = p[i];
                    p[i] = p[j];
                    p[j] = temp2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (wt[i] <= balance) {
                maxval = maxval + p[i];
                balance = balance - wt[i];
            } else {
                maxval = maxval + r[i] * balance;
            }
        }
        System.out.println("Final Profit is: " + maxval);
    }
}

public class Knapsack1 {
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
        kp.knapsack3(n, w, wt, p);
        sc.close();
    }
}
