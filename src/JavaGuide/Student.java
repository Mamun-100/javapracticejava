/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGuide;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Student {
    
    int rollNo;
    String name;
    String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    
    @Override
    public boolean equals(Object obj){
    
        Student st = (Student) obj;
        return  this.rollNo == st.rollNo && this.name.equals(st.name)
                && this.address.equals(st.address);
    }

}
