/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TutorialPoint;

/**
 *
 * @author User
 */
public class RunEncap {
    public static void main(String[] args) {
        EncapTest et = new EncapTest();
        et.setIdNum(101);
        et.setName("Mamun");
        et.setAge(25);
        System.out.println("Id: "+et.getIdNum()+"\nName: "+et.getName()+"\nAge: "+et.getAge());
    }
}
