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
public class String17 {
    public static void main(String[] args) {
        String s;
        char x;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter String: ");
        s=ob.nextLine();
        
        for(int i=0;i<s.length();i++){
            x=s.charAt(i);
            if(i%2==0){
                System.out.print(Character.toLowerCase(x));
            }
            else{
                System.out.print(Character.toUpperCase(x));
            }
        }
    }
}
