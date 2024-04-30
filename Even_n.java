import java.util.*;
class Even_n{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        n=sc.nextInt();
        System.out.println("All even numbers till "+n+":");
        for(int i=0;i<n;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}