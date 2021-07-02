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
public class StudentObjectMethod {
    int roll;
    String name;
    String tsp;
    
    void insertRecord(int r, String n, String t){
    roll= r;
    name = n;
    tsp = t;
    }
    void displayInformation(){
        System.out.println("ID: "+roll+"\nName: "+name+"\nTSP: "+tsp);
    }
    
}
