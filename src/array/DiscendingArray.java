/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author J2EE
 */
public class DiscendingArray {
    public static void main(String[] args) {
        
        int[] arr = new int[]{5,2,8,7,1};
        int temp = 0;
        
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        
        //sor Array descending
        for (int i = 0; i < arr.length; i++) {
            for (int j = i  + 1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        
        System.out.println("Array number Discending: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    
}
