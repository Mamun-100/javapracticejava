/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job_preparation;

import java.util.HashSet;

/**
 *
 * @author User
 */
public class UniqueChar {
    public static void main(String[] args) {
        boolean result = false;
        String inputstring = "abcda";
        System.out.println(inputstring);
        HashSet<Character> uniquecharset = new HashSet();
        for (int i = 0; i < inputstring.length(); i++) {
            result = uniquecharset.add(inputstring.charAt(i));
            if (result == false) {
                break;
            }
            System.out.println(result);
        }
    }
}
