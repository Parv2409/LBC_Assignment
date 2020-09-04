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
public class String10 {
    public static void main(String[] args) {
        String F_name,L_name,Result;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter First Name: ");
        F_name=ob.nextLine();
        System.out.println("Enter Last Name: ");
        L_name=ob.nextLine();
        Result= F_name.charAt(F_name.length()-1)+" "+L_name;
        System.out.println(Result);
    }
}