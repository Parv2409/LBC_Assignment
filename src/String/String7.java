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
public class String7 {
    public static void main(String[] args){
        String s;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter Day Name: ");
        s=ob.nextLine();
        if("Monday".equals(s)||"monday".equals(s)){
            System.out.println(s+"--1");
        }
        else if("Tuesday".equals(s)||"tuesday".equals(s)){
            System.out.println(s+"--2");
        }
        else if("Wednesday".equals(s)||"wednesday".equals(s)){
            System.out.println(s+"--3");
        }
        else if("Thursday".equals(s)||"thursday".equals(s)){
            System.out.println(s+"--4");
        }
        else if("Friday".equals(s)||"friday".equals(s)){
            System.out.println(s+"--5");
        }
        else if("Saturday".equals(s)||"saturday".equals(s)){
            System.out.println(s+"--6");
        }
        else if("Sunday".equals(s)||"sunday".equals(s)){
            System.out.println(s+"--7");
        }
    }
}