/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class WhiteSpace {
    static void removeSpace(String s){
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch !=' ') {
                 System.out.print(ch);
            }
        }
       
    }
    public static void main(String[] args) {
        String s = " I love You ";
        removeSpace(s);
    }
    
}
