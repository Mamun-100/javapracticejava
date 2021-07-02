/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Amstrong {

    public static void main(String[] args) {
        int num = 371; 
        int number;
        int temp;
        int total = 0;

        number = num;
        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }
        if( total == num){
            System.out.println(num+" Armstrong Number");
        }else{
            System.out.println(num +" Not Armstrong");
        }
    }
}
