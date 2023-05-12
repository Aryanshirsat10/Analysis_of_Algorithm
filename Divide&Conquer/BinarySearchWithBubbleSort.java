import java.util.Scanner;


public class BinarySearchWithBubbleSort {

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(int arr[], int start, int end, int key) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key)
                return 1;
            if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return 0;
    }

    // for recursive 
    static int binarySearchrecursive(int arr[],int start ,int end , int key){
        int mid;
        if(start>end){
            return 0;
        }
        mid=(start+end)/2;
        if(key==arr[mid]){
            return mid;
        }
        if(key<arr[mid]){
            binarySearchrecursive(arr, mid-1, start, key);
        }
        else{
            binarySearchrecursive(arr, mid+1, end, key);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, key);
        int result1 = binarySearchrecursive(arr, 0, n-1, key);
        if (result == 1)
            System.out.println("Element found!");
        else
            System.out.println("Element not found!");
        
        if (result1 == 1)
            System.out.println("Element found!");
        else
            System.out.println("Element not found!");
        sc.close();
    }
}

