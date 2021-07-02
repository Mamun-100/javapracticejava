
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ReverseString {
    public static void main(String[] args) {
//        String name = "madam";
//       int lowvalue = 0;
//       int highvalue = name.length()-1;
//       boolean isPalindrom = true;
//        while (lowvalue<highvalue) {
//            if (name.charAt(lowvalue) != name.charAt(highvalue)) {
//                isPalindrom = false;
//                break;
//            }
//            lowvalue++;
//            highvalue--;
//        }
//        if (isPalindrom ) {
//            System.out.println("This is Palindrom Number");
//        }else{
//            System.out.println("This is not Palindrom Number");
//        }
        String input="";
        System.out.println("Enter the input string");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
            System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
