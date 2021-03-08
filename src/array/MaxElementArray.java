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
public class MaxElementArray {
    public static void main(String[] args) {
        
        int[] arr = new int[] {25,11,7,75,56};
        int max = arr[0];
        int min = arr[0];
        
        System.out.println("Maximum Number: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            
        }
        System.out.println("Max: "+max);
        
        
        System.out.println("Minimum number: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
           
        }
         System.out.println("Min: "+min);
        
    }
    
}
