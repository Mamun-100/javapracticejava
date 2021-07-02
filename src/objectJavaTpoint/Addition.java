/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectJavaTpoint;

/**
 *
 * @author User
 */
public class Addition {

    public static void main(String[] args) {
        int a = 19;
        int b = 5;
        int s = add(a, b);
        
    }

    public static int add(int a, int b) {

        int s = a - b;
        System.out.println("Sum: " + s);
        return s;

    }

}
