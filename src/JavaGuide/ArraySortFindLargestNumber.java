/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGuide;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class ArraySortFindLargestNumber {

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 25, 15, 90};

        int max = usingSort(arr);
        System.out.println(max);

    }

    private static int usingSort(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length - 1];

    }

}
