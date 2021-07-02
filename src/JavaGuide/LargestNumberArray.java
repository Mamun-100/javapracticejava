/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGuide;

/**
 *
 * @author User
 */
public class LargestNumberArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,10,80,50};
        findMaximum(arr);
    }

    private static int findMaximum(int[] arr) {

        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }
    
}
