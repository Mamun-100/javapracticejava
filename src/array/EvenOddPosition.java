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
public class EvenOddPosition {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even Array Position: ");
        //even
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + ", ");
        }

        //odd
        System.out.println("\nOdd Array Position: ");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + ", ");
        }

    }

}
