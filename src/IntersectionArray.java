/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class IntersectionArray {

    static int c = 0;

    public static void main(String[] args) {
        int[] arr1 = {0, 2, 4, 5, 6, 9, 41};
        int[] arr2 = {1, 4, 6, 2, 9, 10};
        intersection(arr1, arr2);
    }

    static void intersection(int[] arr1, int[] arr2) {
//        int[] z = new int[arr1.length + arr2.length];
        int[] z = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    z[c] = arr1[i];
                    c++;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(z[i] + ", ");
        }
    }

}
