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
public class CreateObject implements Cloneable {

    void show() {
        System.out.println("Md.Mamunur Rashid");
    }

    void ok() {
        System.out.println("Ok");
    }

    void salam() {
        System.out.println("Assalamu alaikum");
    }

//    protected Object clone() throws CloneNotSupportedException{
//    
//    return super.clone();
//    }
    String str = "New Object Created";

    void tryMethod() {
        System.out.println("this is tryMethod Object creation");
    }

    public static void main(String[] args) {
        CreateObject obj = new CreateObject();
        obj.show();
        obj.ok();
        obj.salam();

        try {
            CreateObject obj2 = new CreateObject();
            System.out.println(obj2.str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //tryMethod object
        try {
            Class cls = Class.forName("CreateObject");
            CreateObject objtry = (CreateObject) cls.newInstance();
            objtry.tryMethod();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (InstantiationException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
