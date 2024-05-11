import java.util.*;
class linearSearch{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n,ele;
        System.out.println("Enter the length of array:");
        n=sc.nextInt();
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
        for(int i=0;i<n;i++){
            if(ele==arr[i]){
                System.out.print("Element found at index "+(i+1));
                break;
            }
            else{
                System.out.print("Element not found!");
                break;
            }
        }
    }
}