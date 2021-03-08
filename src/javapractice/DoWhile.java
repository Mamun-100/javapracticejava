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
public class DoWhile {
    public static void main(String[] args) {
        int a = 1;
        while (a<10) {
            System.out.println("While Loop: "+ ++a);
            a++;
        }
//        while (true) {
//            System.out.println("infinit loop");
//        }
       int d = 0;
        do {
            System.out.println("Do_While Loop: "+d);
            d++;
        } while (d<=10);
        
//        do {
//            System.out.println("Do while Infinite Loop");
//        } while (true);
        
    }
}
