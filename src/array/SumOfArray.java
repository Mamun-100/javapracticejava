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
public class SumOfArray {
    public static void main(String[] args) {
        
   int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
   
   int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Array of Sum: "+sum);
    }
}
