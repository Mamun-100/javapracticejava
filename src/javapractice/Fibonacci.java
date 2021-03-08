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
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;
        int count = 10;
        
        System.out.println(n1 +" "+ n2);
     
        for (i= 1; i< count; ++i) {
            n3 = n1 + n2;
            System.out.println("Fibonacci:  "+n3);
            n1 = n2;
            n2 = n3;
        }
        
        //sconner using
        
        int counts,num1 = 0, num2 = 1;
        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        counts = input.nextInt();
        input.close();
        System.out.println("Count Number: "+counts);
        
        int j = 1;
        while (j<= counts) {
            System.out.print(num1 +" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            j++;
        }
        
    }
    
}
