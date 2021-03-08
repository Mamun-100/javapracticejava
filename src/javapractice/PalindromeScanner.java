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
public class PalindromeScanner {

    public static void main(String[] args) {
        String original;
        String reverse = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String or Number: ");
        original = input.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);

        }
        if (original.equals(reverse)) {
                System.out.println("Enter string/number is palindrom");

            } else {
                System.out.println("Entered String?number isn't a palindrome");
            }
    }
}


