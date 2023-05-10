import java.util.*;

class Insertionsort {
 public static int count=0;
 void insertionsort(int arr[],int max){
    int temp,j;
    for(int i=1;i<max;i++){
    temp = arr[i];
    j=i-1;
    while(j>=0 && arr[j]>temp){
    arr[j+1]=arr[j];
    j=j-1;
    count++;
    }
    arr[j+1] = temp;
    }
    System.out.println("\nCount:"+count);
    }
   }
   class InsertionSort{
    public static void main(String[] args) {
    Insertionsort in = new Insertionsort();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    System.out.println("Enter the max number of the range:");
    int max = sc.nextInt();
    int arr[] = new int[n];
    Random random =new Random();
    for(int i=0;i<n;i++){ 
    arr[i]=random.nextInt(max);
    System.out.print(arr[i]+"\t");
    }
    in.insertionsort(arr,n);
    System.out.println("\nThe sorted array is:");
    for(int i=0;i<n;i++){
    System.out.print(arr[i]+"\t");
    }
    sc.close();
    }

   }
   
