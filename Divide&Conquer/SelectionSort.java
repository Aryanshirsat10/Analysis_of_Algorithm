import java.util.*;
class Selectionsort {
 public static int count=0;
 void selectionsort(int arr[],int max){
 for(int i=0;i<max-1;i++){
 int index=i;
 for(int j=i;j<max;j++){
 if(arr[j]<arr[index]) index=j;
 count++;
 }
 int temp=arr[index];
 arr[index]=arr[i];
 arr[i] = temp;
 }
 System.out.println("\nCount:"+count);
 }
}
class Main{
 public static void main(String[] args) {
 Selectionsort in = new Selectionsort();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the size of the array");
 int n = sc.nextInt();
 System.out.println("Enter the max number of the range:");
 int max = sc.nextInt();
 int arr[] = new int[n];
 Random random =new Random();
 for(int i=0;i<n;i++){
 arr[i]=random.nextInt(max);
 System.out.print(arr[i]+"\t");
 }
 in.selectionsort(arr,n);
 System.out.println("\nThe sorted array is:");
 for(int i=0;i<n;i++){
 System.out.print(arr[i]+"\t");
 sc.close();
 }
 }
}