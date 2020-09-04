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
public class String2 {
    public static void main(String[] args){
        String s;
        int i,n;
        char y;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter Name: ");
        s=ob.nextLine();
        s=" "+s;
        n=s.length();
        System.out.print("Output: "+s+": ");
        for(i=0;i<n;i++){
            y=s.charAt(i);
            if(y==' '){
                System.out.print(s.charAt(i+1)+".");
            }
        }
    }
}
        

