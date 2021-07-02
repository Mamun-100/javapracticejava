/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UniqueChar {
//    public static void main(String[] args) {
//        
//    
//    boolean result = false;
//    String input = "I love country";
//        System.out.println(" "+uniqueMethod(input));
//    
//    }
//
//    public  static boolean uniqueMethod(String input) {
//        boolean result = false;
//        for (char ch:input.toCharArray()) {
//            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
//                result = true;
//            }else{
//            result = false;
//            break;
//            }
//        }
//        return result;
//    }
//    
    
    public static void main (String args[])
    {
//        boolean result=false;
        String inputstring="abcd";
        System.out.println("answer: "+ method4(inputstring));
    }
   
    public static boolean method4(String input)
    {
        boolean result=false;
        for (char ch: input.toCharArray())
        {
            if(input.indexOf(ch)== input.lastIndexOf(ch))
            result= true;
            else
            {
                result=false;
                break;
            }
        }
        return result;
    }
}
