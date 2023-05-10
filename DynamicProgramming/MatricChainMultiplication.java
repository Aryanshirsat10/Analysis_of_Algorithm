package DynamicProgramming;

import java.util.*;
class MatrixChainMultiplication {
static int MatrixChainOrder(int p[], int i, int j)
{
if (i == j)
return 0;
int min = Integer.MAX_VALUE;
for (int k = i; k < j; k++) {
int count = MatrixChainOrder(p, i, k)
+ MatrixChainOrder(p, k + 1, j)
+ p[i - 1] * p[k] * p[j];
if (count < min)
min = count;
}
return min;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int arr[] = new int[N];
for(int i=0; i<N; i++){
arr[i]=sc.nextInt();
}
System.out.println(
"Minimum number of multiplications is "
+ MatrixChainOrder(arr, 1, N - 1));
sc.close();
 }
}
