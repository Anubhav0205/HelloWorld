import java.util.*;
class Swap_Two{
    public static void main(String args[]){
        int a,b,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for swapping:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Numbers before swapping: a = "+a+" b = "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("Numbers after swapping: a = "+a+" b = "+b);
    }
}