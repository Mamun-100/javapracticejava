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
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("Friday");
            default:
                System.out.println("Invalid Numver");
        }
        
        
        char choise;
        Scanner inputs = new Scanner(System.in);
        System.out.println("a, b,c,d: Entered:: ");
        choise = inputs.next().charAt(0);
        switch (choise) {
            case 'A':
            case 'a':
                System.out.println("Apple");
                break;
                
            case 'B':
            case 'b':
                System.out.println("Ball");
                break;
                
            case 'C':
            case 'c':
                System.out.println("Cate");
                break;
                
            case 'D':
            case 'd':
                System.out.println("Dog");
                break;
                
            default:
                System.out.println("Invalid Charecter: ");
                
        }
    }
}
