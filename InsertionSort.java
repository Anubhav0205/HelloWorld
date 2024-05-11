import java.util.*;
class selectionSort{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of array:");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Array elements:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            int key=arr[i];
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        System.out.println();
        System.out.print("Array elements after sorting in ascending order:");
        for(int i=0;i<n;++i)
            System.out.print(arr[i]+" ");
    }
}