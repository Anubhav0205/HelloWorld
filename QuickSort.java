import java.util.*;
class QuickSort{
    public static void quickSort(int arr[], int low, int high){
        int pi = 0;
        if(low < high){
            pi=partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Array elements:");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        quickSort(arr, 0, n-1);
        System.out.println();
        System.out.print("Array after sorting:");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}