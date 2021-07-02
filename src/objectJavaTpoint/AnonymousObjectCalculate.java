/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectJavaTpoint;

/**
 *
 * @author User
 */
public class AnonymousObjectCalculate {
   void fact(int n){
   int fact = 1;
       for (int i = 1; i <=n; i++) {
           fact = fact * i;
       }
       System.out.println(fact);
   }
    public static void main(String[] args) {
        new AnonymousObjectCalculate().fact(5);
    }
}
