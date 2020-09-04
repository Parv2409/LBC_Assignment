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
public class String15 {
    public static void main(String[] args){
        String str;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter String With Spaces: ");
        str= ob.nextLine();
        System.out.println("Inputted String Without Spaces: "+str.trim());
    }
}