import java.util.*;
class DectoBin{
    static void Conversion(int num){
        System.out.print(num+" in Binary = ");
        int binNum[]=new int[1000];
        int i=0;
        while(num>0){
            binNum[i]=num%2;
            num=num/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
            System.out.print(binNum[j]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        Conversion(n);
    }
}