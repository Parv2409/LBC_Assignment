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
public class String16{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        char x;
        int i,c =0;
        String arr[] = new String[5];
        System.out.println("Enter 5 Names: ");
        for(i =0; i<5 ;i++){
            arr[i] = ob.nextLine();
        }
        System.out.println("The Name That Begins With Vowel: ");
         for( i =0; i<5 ;i++){
           x = Character.toLowerCase(arr[i].charAt(0));
           if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
               System.out.println(arr[i]); 
           }
           
        }
         
    }
}