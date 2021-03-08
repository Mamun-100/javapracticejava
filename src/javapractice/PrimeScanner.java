/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrimeScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int second = scan.nextInt();
        
        System.out.println("List of Number: "+first+ " and "+ second);
        for (int i = first; i <= second; i++) {
            if (isPrime(i)) {
                System.out.println(i);
               
            }
            
        }
        
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
