package GreedyAlgorithms;
import java.util.*;
class Shortestpath{
// final public int V=5;
public int V=0;
int minDistance(int dist [],Boolean sSet[],int V){
// V=v;
int min = Integer.MAX_VALUE, min_index=-1;
for(int i=0;i<V;i++){
if(sSet[i]==false && dist[i]<=min){
min=dist[i];
min_index=i;
}
}
return min_index;
}
void printSolution(int dist[],int V){
System.out.println("Vertex \t\t Distance from Source");
for (int i = 0; i < V; i++)
System.out.println(i + " \t\t " + dist[i]);
}
void dijkstra(int graph[][],int src,int V){
int dist[]=new int [V];
Boolean sSet[]= new Boolean[V];
for(int i=0;i<V;i++){
dist[i]= Integer.MAX_VALUE;
sSet[i]=false;
}
dist[src]=0;
for(int count=0;count<V-1;count++){
int u=minDistance(dist,sSet,V);
sSet[u]=true;
for(int i=0;i<V;i++){
if(!sSet[i] && graph[u][i] !=0 && dist[u] != Integer.MAX_VALUE 
&& dist[u]+graph[u][i]<dist[i]){
dist[i]=dist[u]+graph[u][i];
}
}
}
printSolution(dist,V);
}
}

public class shortestpathgreedy{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of vertices in the graph");
    int m = sc.nextInt();
    int graph[][]= new int [m][m];
    int wt=0;
    System.out.println("Enter the values of the verices as in the value of each vertex");
    int vertices [] =new int [m];
    for(int i =0;i<m;i++){
    vertices[i]=sc.nextInt();
    }
    System.out.println("Enter the weights of the graph");
    for(int i=0;i<m;i++){
    for(int j=0;j<m;j++){
    System.out.println("Enter the weight between "+(i)+"th and "+(j)+"th node");
    wt=sc.nextInt();
    graph[i][j]=wt;
    }
    }
    Shortestpath sp = new Shortestpath();
    sp.dijkstra(graph, 0,m);
    sc.close();
    }
    }