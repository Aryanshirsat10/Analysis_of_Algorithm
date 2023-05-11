package Backtracking;

import java.util.*;

public class Backtracking {
    final int V = 4;
    int[] color;
    boolean isSafeToColor(int v, int[][] graphMatrix, int[] color, int c) {
        for (int i = 0; i < V; i++) {
            if (graphMatrix[v][i] == 1 && c == color[i]) {
                return false;
            }
        }
        return true;
    }

    boolean graphColorUtil(int[][] graphMatrix, int m, int[] color, int v) {
        if (v == V) {
            return true;
        }
        for (int i = 1; i <= m; i++) {
            if (isSafeToColor(v, graphMatrix, color, i)) {
                color[v] = i;
                if (graphColorUtil(graphMatrix, m, color, v + 1)) {
                    return true;
                }
                color[v] = 0;
            }
        }
        return false;
    }

    void printColoringSolution(int color[]) {
        System.out.println("Color schema for vertices are: ");
        for (int i = 0; i < V; i++) {
            System.out.println(color[i]);
        }
    }

    boolean graphColoring(int[][] graphMatrix, int m) {
        color = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = 0;
        }
        if (!graphColorUtil(graphMatrix, m, color, 0)) {
            System.out.println("Color schema not possible");
            return false;
        }
        printColoringSolution(color);
        return true;
    }

    public static void main(String args[]) {
        Backtracking backtrack = new Backtracking();
        int graphMatrix[][] = new int[backtrack.V][backtrack.V];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the adjacency matrix of the graph:");
        for (int i = 0; i < backtrack.V; i++) {
            for (int j = 0; j < backtrack.V; j++) {
                graphMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of colors:");
        int m = sc.nextInt();
        sc.close();
        backtrack.graphColoring(graphMatrix, m);
    }
}
