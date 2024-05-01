import java.util.*;
class Add_Two{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of two numbers = "+sum);
    }
}