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
public class Armstrong {
    public static void main(String[] args) {
        int c = 0;
        int a;
        int temp;
        
        int n = 370;
        temp = n;
        while (n>0) {
            a = n % 10;
            n = n / 10;
            c = c +(a * a * a); 
        }
        if (temp == c) {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    
}
