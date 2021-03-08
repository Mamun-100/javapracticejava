/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author User
 */
public class Ifelse {

    public static void main(String[] args) {
        String el[] = {"sama",
            "Mijan",
            "Mamun",
            "Soeb",
            "Shojib",
            "Saddam",
            "Asif"};

        for (String l : el) {
            System.out.println(l);
        }
        
        aa:
        for (int i = 1; i <= 5; i++) {
            bb:
            for (int j = 1; j <= 5; j++) {
                
                if (i==2&&j==4) {
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
        //
        for (int i = 1; i <=10; i++) {
            if (i==5) {
               
                continue;
            }
             System.out.println(i);
        }
        
        int s = 11;
        while (s<=20) {
            if (s<=15) {
                s++;
               continue;
            }
            System.out.println(s);
            s++;
        }

    }
}
