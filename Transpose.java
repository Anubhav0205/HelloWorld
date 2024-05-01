import java.util.*;
class Transpose{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the length of array:");
        n=sc.nextInt();
        int arr[][] = new int[n][n];
        int new_arr[][] = new int[n][n];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Array elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                new_arr[i][j]=arr[j][i];
                System.out.print(new_arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}