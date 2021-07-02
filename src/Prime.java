
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        
        int ab = input.nextInt();
        boolean isPrime = true;
        
        for (int i = 2; i < ab; i++) {
            if (ab % i == 0) {
                isPrime= false;
                break;
            }
        }
        if ( isPrime == true) {
            System.out.println(" This is Prime number");
        }else{
            System.out.println("Is Not prime Number");
        }
        
    }
    
}
