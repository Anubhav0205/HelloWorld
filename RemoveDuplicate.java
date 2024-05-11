import java.util.*;
class removeDuplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,j=0;
        System.out.print("Enter the length of the array:");
        n=sc.nextInt();
        int temp[] = new int[n];
        int arr[] = new int[n];
        System.out.print("Enter "+n+" elements in array:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Array elements:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1])
                temp[j++]=arr[i];
        }
        temp[j++]=arr[n-1];
        System.out.println();
        System.out.print("Array after removing duplicate elements:");
        for(int i=0;i<j;i++){
            arr[i]=temp[i];
            System.out.print(arr[i]+" ");
        }
    }   
}