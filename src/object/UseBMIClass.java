/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author User
 */
public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmil = new BMI("mamun", 25, 140, 65);
        System.out.println("Name: "+bmil.getName() +"\nAge: "+bmil.getStatus()+"\n"+ bmil.getBMI() + " " + bmil.getStatus());
        
        BMI bmil2 = new BMI("Khalek",20,120, 60);
        System.out.println("Name: "+bmil2.getName()+  "\n " +bmil2.getBMI()+ " "+ bmil2.getStatus());
        
    }
    
}
