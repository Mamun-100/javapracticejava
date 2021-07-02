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
public class Puppy {
    int puppyAge;

    public Puppy(String name){
        System.out.println("Name is"+ name);
    }
    
    

    public int getPuppyAge() {
        System.out.println("Puppy age is "+ puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }
    
    public static void main(String[] args) {
        
        Puppy pp =  new Puppy("Tommy");
        pp.setPuppyAge(10);
        pp.getPuppyAge();
        
        System.out.println("Tommy age is :"+ pp.puppyAge);
        
        
        
    }
    
}
