import java.util.*;
class SimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p,r,t;
        int si=0;
        System.out.print("Enter the principal rate and time:");
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple Interest = "+si);
    }
}