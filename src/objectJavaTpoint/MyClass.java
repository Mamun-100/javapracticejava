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
public class MyClass {

    int id;
    String name;
    int age;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyClass(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
    
    public static void main(String[] args) {
        MyClass mc = new MyClass(101,"Mamun",25);
        MyClass mc1 = new MyClass(102,"salam");
        mc.display();
        mc1.display();
        
    }
}
