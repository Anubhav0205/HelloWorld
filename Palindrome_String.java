import java.util.*;
class Palindrome_String{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str,rev_str="";
        System.out.print("Enter a string:");
        str=sc.nextLine();
        int len=str.length();
        for(int i=len-1;i>=0;i--)
            rev_str +=str.charAt(i);
        if(str.equals(rev_str))
            System.out.println(str+" is a Palindrome string");
        else
            System.out.print(str+" is not a Palindrome string");
    }
}