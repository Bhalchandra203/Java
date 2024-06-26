/*
Write a java program using Multithreading to accept a String from a user and display 
each vowel from a String after every 3 seconds
 */
package com.mycompany.javaslip;


import java.util.Scanner;
import java.util.logging.*;

public class slip23_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any string:");
        String str = sc.nextLine();
        
        Thread t = new Thread(() -> {
            for(int i=0; i<str.length(); i++) {
                String str2 = str.toLowerCase();
                char ch = str2.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(slip23_1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("3 seconds are passed....");
                }
            }
        });
        
        t.start();
    }
}
