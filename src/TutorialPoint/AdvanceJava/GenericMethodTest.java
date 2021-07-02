/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TutorialPoint.AdvanceJava;

/**
 *
 * @author User
 */
public class GenericMethodTest {
    public  static <E> void printArray(E[] inputArray){
        for (E element: inputArray) {
            System.out.printf("%s",element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'A','P','P','L','E'};
        System.out.println("Array integerArray contains: ");
        printArray(intArray);
        
        System.out.println("\nDoubleArray contains: ");
        printArray(doubleArray);
        
        System.out.println("\nCharacter arrays: ");
        printArray(charArray);
    }
    
}
