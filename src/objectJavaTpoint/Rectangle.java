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
public class Rectangle {
    int length;
    int width;
    
    void insert(int l, int w){
    length = l;
    width = w;
    }
    
    void calculated(){
        System.out.println(length * width);
    }
    
}
