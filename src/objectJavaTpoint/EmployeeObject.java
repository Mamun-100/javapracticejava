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
public class EmployeeObject {
    int id;
    String name;
    float salary;
    
    void inset(int i, String n, float s){
    id =i;
    name = n;
    salary = s;
    }
    void display(){
        System.out.println("ID: "+id+ "\nName: "+name+"\nSalary: "+salary);
       }
}
