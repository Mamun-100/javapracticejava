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
public class CheckPrime {
    
    static void checkNumber(int n){
     int i;
     int m = 0;
     int flag = 0;
     m = n/2;
     
        if (n == 0 || n == 1) {
            System.out.println(n +" is not prime number");
        }else{
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n +" is not Prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n +" is prime Number");
            }
        }
    }
    public static void main(String[] args) {
        checkNumber(20);
        checkNumber(17);
        checkNumber(27);
        checkNumber(30);
    }
    
}
