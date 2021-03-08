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
public class CopyArray {
    public static void main(String[] args) {
        
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int arr2[] = new int[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Orifial array");
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] +" ");
        }
        System.out.println();
        System.out.println("New Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    
}
