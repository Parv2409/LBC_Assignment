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
public class String4 {
    public static void main(String[] args){
        String s;
        int i,n;
        int v=0;
        char y;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter String: ");
        s=ob.nextLine();
        n=s.length();
        System.out.print("Number Of Vowels: "+s+": ");
        for(i=0;i<n;i++){
            y=s.charAt(i);
            if(y=='a'||y=='A'||y=='e'||y=='E'||y=='i'||y=='I'||y=='o'||y=='O'||y=='u'||y=='U'){
                v++;
            }
        }
        System.out.print(v);
    }
}