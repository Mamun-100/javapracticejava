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
public class StudentObjectMethod2 {
    public static void main(String[] args) {
        StudentObjectMethod som = new StudentObjectMethod();
        StudentObjectMethod som2 = new StudentObjectMethod();
        som.insertRecord(101, "Mamunur Rashid", "Cogent");
        som2.insertRecord(102, "Saddam", "US");
        som.displayInformation();
        som2.displayInformation();
    }
    
}
