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
public class TestStudentObject {
    public static void main(String[] args) {
        //Creating objects
        StudentObject so = new StudentObject();
        StudentObject so2 = new StudentObject();
        
        //Initializing object
        so.id=101;
        so.name = "Md.Mamunur Rashid";
        so.contact = 1961280207;
        so.address = "Khilgaon, Dhaka";
       
        so2.id = 102;
        so2.name = "Saddam";
        so2.contact = 1245789;
        so2.address = "Cumilla";
        
        System.out.println("ID: "+so.id+"\nName: "+so.name+"\nContact: "+so.contact+"\nAddress: "+so.address);
        System.out.println();
        System.out.println("ID: "+so2.id+"\nName: "+so2.name+"\nContact: "+so2.contact+"\nAddress: "+so2.address);
        
    }
    
}
