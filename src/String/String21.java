
package String;

import java.util.Scanner;

public class String21 
{   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch;
    String st = "";
    System.out.println("Enter The String: ");
    String str = sc.next();
    int l = str.length();
    for(int i = l-1;i>=0;i--)
    {
        ch = str.charAt(i);
        st = st + ch;
    }
    if(st.equalsIgnoreCase(str))
    {
        System.out.println("Palidrone String");
    }
    else
    {
        System.out.println("Not an Palidrone String");
    }
}
}
