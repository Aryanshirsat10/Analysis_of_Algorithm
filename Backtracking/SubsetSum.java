package Backtracking;

import java.util.Scanner;

public class SubsetSum {
    static int n, sum, count = 0;
    static int[] arr, sol;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        arr = new int[n];
        sol = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the required sum: ");
        sum = sc.nextInt();

        System.out.println("The subsets with the required sum are:");
        subsetSum(0, 0);

        if (count == 0) {
            System.out.println("No subsets with the required sum found.");
        }

        sc.close();
    }

    public static void subsetSum(int index, int currentSum) {
        if (currentSum == sum) {
            printSolution();
            return;
        }

        if (index == n || currentSum > sum) {
            return;
        }

        sol[index] = 1;
        subsetSum(index + 1, currentSum + arr[index]);
        sol[index] = 0;
        subsetSum(index + 1, currentSum);
    }

    public static void printSolution() {
        count++;
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            if (sol[i] == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("}");
    }
}

