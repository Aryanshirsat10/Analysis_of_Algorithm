import java.util.*;
class QuickSort2{
public int sumcount=0;
void Quicksort(int a[],int p,int q){
if(p<q){
int j= partition(a,p,q);
Quicksort(a,p,j-1);
Quicksort(a,j+1,q);

}
}
int partition(int a[], int m,int p){
int count=0;
int v = a[p];
int i=(m-1);
for(int j=m;j<=p-1;j++){
if(a[j]<v){
i++;
count++;
int t=a[i];
a[i]=a[j];
a[j]=t;
sumcount=sumcount+count;
}
}
int t=a[i+1];
a[i+1]=a[p];
a[p]=t;
System.out.println("After swaping pivot the array is ");
for(int k=0;k<a.length;k++){
System.out.print(a[k]+" ");
}
System.out.println();
return (i+1);
}
void printArray(int[] arr)
{
System.out.println("The sorted array is ");
for (int i = 0; i < arr.length; i++)
System.out.print(arr[i] + " ");
System.out.println();
}
}
public class Quicksort {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
QuickSort2 quick = new QuickSort2();
System.out.println("Enter the size of the array:");
int n= sc.nextInt();
System.out.println("Enter the range of the random number generator:");
int max=sc.nextInt();
int []a=new int[n];
Random random = new Random();
for(int i=0;i<a.length;i++){
a[i]=random.nextInt(max);
}
System.out.println("The unsorted array is:");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println();
quick.Quicksort(a,0,n-1);
quick.printArray(a);
int Count=quick.sumcount;
System.out.println("Count: " + Count);
sc.close();
}
}

