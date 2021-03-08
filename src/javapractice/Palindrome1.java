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
public class Palindrome1 {
    public static void main(String[] args) {
        int r;
        int sum = 0;
        int temp;
        
        int n = 125;
        temp = n;
        
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n/10;
        }
        if (temp == sum) {
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }
        
    }
    
}
