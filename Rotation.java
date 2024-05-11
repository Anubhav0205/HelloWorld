import java.util.*;
class rotation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d,n,k=0;
        System.out.print("Emter the length of array:");
        n=sc.nextInt();
        int temp[] = new int[n];
        int arr[] = new int[n];
        System.out.print("Enter "+n+" elemnts in array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter number of elements to be rotated:");
        d=sc.nextInt();
        System.out.print("Array elements:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        System.out.println();
        System.out.print("Array elements after rotation:");
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
            System.out.print(arr[i]+" ");
        }
    }
}