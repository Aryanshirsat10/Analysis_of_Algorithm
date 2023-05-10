package DynamicProgramming;

import java.util.*;
import java.lang.*;
import java.io.*;;
class Allpairsp{
final static int INF = 99999, V = 3;
void floydWarshall(int dist[][])
{
int i, j, k;
for (k = 0; k < V; k++) {
for (i = 0; i < V; i++) {
for (j = 0; j < V; j++) {
    if (dist[i][k] + dist[k][j]
< dist[i][j])
dist[i][j]
= dist[i][k] + dist[k][j];
}
}
}
printSolution(dist);
}
void printSolution(int dist[][])
{
System.out.println(
"The following matrix shows the shortest "
+ "distances between every pair of vertices");
for (int i = 0; i < V; ++i) {
for (int j = 0; j < V; ++j) {
if (dist[i][j] == INF)
System.out.print("INF ");
else
System.out.print(dist[i][j] + " ");
}
System.out.println();
}
}
}
class Apsp {
public static void main(String[] args) {
int graph[][]= {{0,4,11},
{6,0,2},
{3,Allpairsp.INF,0}
};
Allpairsp a = new Allpairsp();
a.floydWarshall(graph);
}
}
