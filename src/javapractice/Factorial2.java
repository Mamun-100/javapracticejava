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
public class Factorial2 {
    static int factorialMethod(int n){
        if (n == 0) {
            return 1;
        }else{
       return (n * factorialMethod(n-1));
        }
    }
    public static void main(String[] args) {
        int i;
        int fact = 1;
        int number = 5;
        fact = factorialMethod(number);
        System.out.println("Factorial of "+number+" is "+ fact);
    }
    
}
