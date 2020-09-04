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
public class String13{
    public static void main(String[] args){
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter String 1: ");
       int r;
       String s,s1;
       s = ob.nextLine();
       System.out.println("Enter String 2: ");
       s1 = ob.nextLine();
       r = s.compareToIgnoreCase(s1);
       if(r == 0)
       {
           System.out.println("Same string");
       }
       else if(r>0)
       {
           System.out.println(s  + " Comes Later");  
       }
       else
       {
           System.out.println(s1 + " Comes Later");
       }
        
    }
}