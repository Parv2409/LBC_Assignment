/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author hp
 */
import java.util.*;
public class String11{
    public static void main(String[] args)
    {
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter String: ");
      String s,s1,s2,s3 = "";
      int i;
      char x;
      s = ob.nextLine();
      s = s.toLowerCase();
      for(i =0;i<s.length();i++)
      {
        x = s.charAt(i);
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
        {
            break;
        }
      }
      s1 = s.substring(0, i);
      s2 = s.substring(i);
      s3 = s2 + s1 + "ay";
      System.out.println("Piglatin form: " + s3);
    }
    
}