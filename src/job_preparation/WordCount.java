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
public class WordCount {
    static int i, c = 0, res;
    static  int wordCounts(String s){
    char ch[] = new char[s.length()];
        for (int i = 0; i <s.length(); i++) {
            ch[i] = s.charAt(i);
           if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            c++;
                
            }
        return c;
    }
    
    public static void main(String[] args) {
        res = WordCount.wordCounts("I love you");
        System.out.println(res);
    }
}
