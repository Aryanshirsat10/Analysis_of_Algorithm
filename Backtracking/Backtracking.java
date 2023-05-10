package Backtracking;

import java.util.*;
public class Backtracking {
final int V = 4;
int[] color;
boolean isSafeToColor(int v, int[][] graphMatrix, int[] color, int c)
{
for (int i = 0; i < V; i++)
if (graphMatrix[v][i] == 1 && c == color[i])
return false;
return true;
}
boolean graphColorUtil(int[][] graphMatrix, int m, int[] color, int v)
{
if (v == V)
return true;
for (int i = 1;i <= m; i++) 
{
if (isSafeToColor(v, graphMatrix, color, i))
{
color[v] =i;
if (graphColorUtil(graphMatrix, m, color, v + 1))
return true;
color[v] = 0;
}
}
return false;
}
void printColoringSolution(int color[])
{
System.out.println("Color schema for vertices are: ");
for (int i = 0; i < V; i++)
System.out.println(color[i]);
}
boolean graphColoring(int[][] graphMatrix, int m)
{
color = new int[V];
Arrays.fill(color,0);
if (!graphColorUtil(graphMatrix, m, color, 0)) 
{
System.out.println(
"Color schema not possible");
return false;
}
printColoringSolution(color);
return true;
}
// Main driver program
public static void main(String args[])
{
Backtracking backtrack 
= new Backtracking();
int graphMatrix[][] = {
{ 0, 1, 1, 1 },
{ 1, 0, 1, 0 },
{ 1, 1, 0, 1 },
{ 1, 0, 1, 0 },
};
int m = 3; // Number of colors
backtrack.graphColoring(graphMatrix, m);
}
}
