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
public class String9 {
    public static void main(String[] args) {
        String s,s1 = "";
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter String: ");
        s=ob.nextLine();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            s1=x+s1;
        }
        if(s.equalsIgnoreCase(s1)){
            System.out.println("Palindrome String");
        }
    }
}