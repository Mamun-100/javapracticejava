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
public class DuplicateArrayElement {
    public static void main(String[] args) {

    int[] arr = new int[]{1,2,3,2,4,5,5,8,9,10,9};
        System.out.println("DuplicateElement: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.print(arr[j] +" ");
                }
            }
        }
        System.out.println("\nString Array: ");
        
        String[] arrString = new String[]{"salam","Mamun","saddam","Mijan"};
        for (int i = 0; i < arrString.length; i++) {
            System.out.print(arrString[i] +", ");
        }
    }
}
