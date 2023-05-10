//MinMax iterative

import java.util.*;
public class Minmax {
    static int[] sort(int arr[], int n)
    {
    int i, key, j;
    for(i=1; i<n; i++)
    {
    key=arr[i];
    j=i-1;
    while (j >= 0 && arr[j] > key)
    {
    arr[j + 1] = arr[j];
    j = j - 1;
    }
    arr[j + 1] = key;
    }
    for (int k = 0; k < n; k++) {
    System.out.print(arr[k] + " ");
    }
    System.out.println("\n");
    return arr;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int arr[];
    arr=new int[N];
    for(int i=0; i<N; i++)
    {
    double x =Math.random()*300;
    int num=(int)x;
    arr[i]=num;
    }
    int array[]=sort(arr,N);
    System.out.println("Min element is: "+array[0]+"\n");
    System.out.println("Max elemet is: "+array[N-1]);
    sc.close();
    }
    }

// Minmax recursive
// import java.util.*;
// import java.time.*;
// public class MinMaxRecursive {
//     public static int findMinRec(int arr[], int n)
// {
// if(n == 1)
// return arr[0];
// return Math.min(arr[n-1], findMinRec(arr, n-1));
// }
// public static int findMaxRec(int arr[], int n)
// {
// if(n == 1)
// return arr[0];
// return Math.max(arr[n-1], findMaxRec(arr, n-1));
// }
// public static void main(String[] args)
// {
// Scanner sc=new Scanner(System.in);
// int N=sc.nextInt();
// int arr[];
// arr=new int[N];
// for(int i=0; i<N; i++)
// {
// double x =Math.random()*300;
// int num=(int)x;
// arr[i]=num;
// }
// for (int k = 0; k < N; k++) {
// System.out.print(arr[k] + " ");
// }
// System.out.println("\n");
// long start = System.nanoTime();
// int min=findMinRec(arr, N);
// int max=findMaxRec(arr, N);
// System.out.println("The min is: "+min+" and the max is: "+max);
// long end = System.nanoTime();
// long execution = end - start;
// System.out.println("Execution time: " + execution + " nanoseconds");
// }
// }