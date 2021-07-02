/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGuide;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class DuplicateFromArray {
    public static void main(String[] args) {
        final Integer[] array = {100,20,30,40,70,90,70,20,40};
        Arrays.sort(array);
        removeDuplicateArray(array);
        
    }

    private static void removeDuplicateArray(Integer[] array) {

        final Set<Integer> set = new HashSet<Integer>();
        final Integer[] in = new Integer[array.length];
        
        int j = 0;
        for(final Integer element : array){
            if (set.add(element)) {
                in[j++] = element;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(in[i] +", ");
        }
    }
    
}
