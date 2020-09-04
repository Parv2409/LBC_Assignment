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
public class String8 {
    public static void main(String[] args) {
        String s;
        int i,n;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter String: ");
        s=ob.nextLine();
        n=s.length();
        System.out.print("New String After Changing Case: ");
        for (i = 0; i < n; i++) {
            int x=s.charAt(i);
            if(x>64&&x<91){
                x=x+32;
                System.out.print((char)x);
            }
            else if(x>96&&x<123){
                x=x-32;
                System.out.print((char)x);
            }
        if(x==32)
            System.out.print(" ");
        }
    }
    
}