import java.util.*;
class Pascals_Triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the range:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            int c=1;
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }
            System.out.println();
        }
    }
}