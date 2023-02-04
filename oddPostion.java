import java.util.Scanner;

/*
Problem Statement:
Write a Java program to print the characters at the odd position of a given string
Input:
Hey there!
Output:
e hr!
Explanation:
All the characters (including whitespace) at the odd position of the string Hey there! are printed.
*/
public class oddPostion
{
    public static void main(String []args)
    {
        String strr="";
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        for (int i = 0; i <str.length() ; i++)
        {
            if(i%2==1)
            {
                char ch=str.charAt(i);
                strr=strr+ch;
            }
        }
        System.out.println(strr);
    }
}
