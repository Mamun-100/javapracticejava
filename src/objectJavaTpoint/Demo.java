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
public class Demo {

    int id;
    String name;

    Demo(int i, String n) {
        id = i;
        name = n;

    }
    Demo(){}
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Demo d = new Demo(101,"mamun");
        Demo d1 = new Demo();
        d1.id = d.id;
        d1.name = d.name;
        d1.display();
        d.display();
    }
}
