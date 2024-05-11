import java.util.*;
class sumOfElements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the length of array:");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Array elements:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.println();
        System.out.print("Sum of array elements = "+sum);
    }
}