import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        long fact=1;
        System.out.print("Enter a number:");
        num=sc.nextInt();
        for(int i=num;i>0;i--)
            fact=fact*i;
            System.out.println("Factorial of "+num+" is "+fact);
    }
}