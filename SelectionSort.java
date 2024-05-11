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
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_idx]>arr[j])
                    min_idx=j;
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        System.out.print("Array elements after sorting in ascending order:");
        for(int i=0;i<n;++i)
            System.out.print(arr[i]+" ");
    }
}