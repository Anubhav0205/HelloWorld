import java.util.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str,rev_str="";
        int len;
        char ch;
        System.out.print("Enter a string to be reversed:");
        str=sc.nextLine();
        len=str.length();
        for(int i=len-1;i>=0;i--){
            ch=str.charAt(i);
            rev_str+=ch;
        }
        System.out.print("Reversed string:"+rev_str);
    }
}