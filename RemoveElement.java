 import java.util.*;
class removeElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,ele;
        System.out.println("Enter the length of array:");
        n=sc.nextInt();
        int temp[] = new int[n];
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Array elements:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.print("Enter element to be removed:");
        ele=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]!=ele)
                temp[i]=arr[i];
        }
        System.out.print("Array after deleting the element:");
        for(int i=0;i<n-1;i++){
            arr[i]=temp[i];
            System.out.print(arr[i]+" ");
        }
    }
}