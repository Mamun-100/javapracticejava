/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 *
 * @author User
 */
public class RandomMaxMin {

    public static void main(String[] args) {
        int min = 200;
        int max = 400;
        System.out.println("Random value: " + min + " to " + max + " : ");
        double a = Math.random() * (max - min + 1) + min;
        System.out.println(a);
        System.out.println("Random value of type int between" + min + " to " + max + " : ");
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(b);
    }

}
