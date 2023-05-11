package DynamicProgramming;

import java.util.*;

class Shortestpath {
    void dijkstra(int graph[][], int src, int V) {
        int dist[] = new int[V];
        boolean sSet[] = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sSet[i] = false;
        }
        dist[src] = 0;
        
        for (int count = 0; count < V - 1; count++) {
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            
            // Find the vertex with the minimum distance from the source
            for (int i = 0; i < V; i++) {
                if (!sSet[i] && dist[i] < minDist) {
                    minDist = dist[i];
                    u = i;
                }
            }
            if (u == -1) {
                break;
            }
            
            sSet[u] = true;
            
            // Update the distances of all the adjacent vertices of u
            for (int v = 0; v < V; v++) {
                if (!sSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE) {
                    dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
                }
            }
        }
        printSolution(dist, V);
    }

    void printSolution(int dist[], int V) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
}

public class ShortestPathDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices in the graph:");
        int V = sc.nextInt();
        int graph[][] = new int[V][V];
        int wt = 0;
        System.out.println("Enter the values of the vertices as in the value of each vertex:");
        int vertices[] = new int[V];
        for (int i = 0; i < V; i++) {
            vertices[i] = sc.nextInt();
        }
        System.out.println("Enter the weights of the graph:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.println("Enter the weight between " + i + "th and " + j + "th node:");
                wt = sc.nextInt();
                graph[i][j] = wt;
            }
        }
        Shortestpath sp = new Shortestpath();
        sp.dijkstra(graph, 0, V);
        sc.close();
    }
}
