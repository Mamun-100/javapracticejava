/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class WordCount {


    public static void main(String[] args) {
        String res = "I love Bangla desh";
        int stringcount = 1;
        for (int i = 0; i <res.length(); i++) {
            if (res.charAt(i) == ' ') {
                stringcount++;
            }
            
        }
        System.out.println(" TotalCount: "+stringcount);

    }

}
