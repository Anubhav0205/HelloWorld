import java.util.*;
class bubbleSort{
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
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Array after sorting elements in ascending order:");
        for(int i=0;i<n;++i)
        System.out.print(arr[i]+" ");
    }
}