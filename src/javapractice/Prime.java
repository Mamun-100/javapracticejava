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
public class Prime {
    public static void main(String[] args) {
       int i;
       int m = 0;
       int flag = 0;
       int n = 20;
       m = n/2;
       
//        if (n == 0|| n==1) {
//            System.out.println(n +" is not prime");
//        }else{
        for ( i = 2; i<= m; i++) {
            if(n%i == 0){
                System.out.println(n +" is not prime");
                flag = 1;
               break;
            }
        }
        if (flag == 0) {
            System.out.println(n +" is prime");
            }
     }

}
