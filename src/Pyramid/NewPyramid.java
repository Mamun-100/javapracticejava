/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramid;

/**
 *
 * @author User
 */
public class NewPyramid {
    public static void main(String[] args) {
        int rows = 10;

    for(int i = rows; i >= 1; --i) {
      for(int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      for(int j=i; j <= 2 * i - 1; ++j) {
        System.out.print("* ");
      }

      for(int j = 0; j < i - 1; ++j) {
        System.out.print("* ");
      }

      System.out.println();
    }
    }
}
