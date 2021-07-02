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
public class CheckTwoArrayAreEqual {

    public static void main(String[] args) {
//        int[] arr1 = new int[]{1, 2, 3, 4};
//        int[] arr2 = new int[]{1, 2, 3, 4};
//        int[] arr3 = new int[]{1, 2, 4, 3};
//        boolean intCheck1 = Arrays.equals(arr1, arr2);
//        boolean intCheck2 = Arrays.equals(arr1, arr3);
//        System.out.println("FirstCheck: " + intCheck1);
//        System.out.println("SecondCheck: " + intCheck2);

        Student[] arr1 = {new Student(101, "Mamun", "Dhaka"),
            new Student(102, "salam", "Poltan"),
            new Student(103, "saddam", "Manda")};

        Student[] arr2 = {new Student(101, "Mamun", "Dhaka"),
            new Student(102, "salam", "Poltan"),
            new Student(103, "saddam", "Manda")};

        Student[] arr3 = {new Student(301, "ali", "khilgaon"),
            new Student(302, "ripon", "rampura"),
            new Student(303, "josim", "demra")};
        
        System.out.println("Array1 into equals Array2: "+Arrays.equals(arr1, arr2));
        System.out.println("Array1 into equals Array3: "+Arrays.equals(arr1, arr3));
    }

}
