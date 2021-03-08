/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author User
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array: ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +", ");
        }
        System.out.println();
        System.out.println("ReverseArray: ");
        
        for (int i = arr.length - 1; i>= 0; i--) {
            System.out.print(arr[i] +", ");
        }
    } 
}
