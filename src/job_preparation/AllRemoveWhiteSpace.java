/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job_preparation;

/**
 *
 * @author User
 */
public class AllRemoveWhiteSpace {
    public static void main(String[] args) {
      String str = new String("I love country");
        System.out.println(str.replaceAll(" ", ""));
    }
    
}
