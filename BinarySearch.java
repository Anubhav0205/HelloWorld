import java.util.*;
class binarySearch{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n,start,end,mid,ele;
        System.out.println("Enter the length of array:");
        n=sc.nextInt();
        start=0;
        end=n-1;
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Array elements:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.print("Enter element to be searched:");
        ele=sc.nextInt();
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==ele){
                System.out.print("Element found at index "+(mid+1));
                break;
            }
            else if(arr[mid]>ele)
                end=mid--;
            else if(arr[mid]<ele)
                start=mid++;
            else{
                System.err.print("Element not found!");
                break;
            }
        }
    }
}