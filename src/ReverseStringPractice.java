/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ReverseStringPractice {
    public static void main(String[] args) {
        
        String s = "Mamun";
        char[] cs = s.toCharArray();
        for (int i = cs.length-1; i >=0; i--) {
            System.out.print(cs[i]);
        }
    }
    
}
