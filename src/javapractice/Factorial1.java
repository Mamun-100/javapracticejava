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
public class Factorial1 {
    public static void main(String[] args) {
        int i;
        int fact = 1;
        int number = 4;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
            System.out.print(fact+", ");
        }
        System.out.println("Factorial of "+ number + " is " +fact);
    }
    
}
