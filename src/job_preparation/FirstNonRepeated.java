/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job_preparation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FirstNonRepeated {

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char c = firstNoRepeted(s);
        System.out.println("first non: " + c);
    }

    public static Character firstNoRepeted(String str) {
        HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = str.length();
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.containsKey(c)) {
                characterhashtable.put(c, characterhashtable.get(c) + 1);

            } else {
                characterhashtable.put(c, 1);
            }
        }
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
