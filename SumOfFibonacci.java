import java.util.*;
class SumOfFibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=0;
        int sum=a+b;
        int n;
        System.out.print("Enter the range:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            sum+=c;
        }
        System.out.println("Sum of "+n+" Fibonacci series is "+sum);
    }
}