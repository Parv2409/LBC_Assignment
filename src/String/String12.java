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
public class String12 {
    public static void main(String[] args){
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter Name: ");
        String s;
        s = ob.nextLine();
        s = s.toLowerCase();
        if(s.startsWith("mr ")){
            System.out.println("Male");
        }
        else if(s.startsWith("miss  ")){
            System.out.println("Female");
        }
        else if(s.startsWith("mrs")){
            System.out.println("Married Female");
        }
        else if(s.endsWith(" kumari")){
            System.out.println("Female");
        }
        else{
            System.out.println("Cannot determine");
        }
    }
}