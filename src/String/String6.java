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
public class String6 {
    public static void main(String[] args) {
        String s1,s2;
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter Sting 1: ");
        s1=ob.nextLine();
        System.out.print("Enter Sting 2: ");
        s2=ob.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("These Strings Are Equal");
        }
        else{
            int c=s1.compareToIgnoreCase(s2);
            System.out.println("Difference In ASCII Values: "+c);
        }
    }
    
}
