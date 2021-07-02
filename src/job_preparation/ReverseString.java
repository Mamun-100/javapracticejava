/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job_preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ReverseString {

    public static void main(String[] args) {
       String input = "";
        System.out.println("Enter String: ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] t1 = input.toCharArray();
            for (int i = t1.length-1; i>=0; i--) {
                System.out.print(t1[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        
       //step two way
        String input1 = "mamun";
        StringBuilder sb = new StringBuilder();
        sb.append(input1);
        sb = sb.reverse();
        for (int i = 0; i <sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }

    }

}
