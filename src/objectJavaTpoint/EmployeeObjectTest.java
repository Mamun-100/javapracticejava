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
public class EmployeeObjectTest {
    public static void main(String[] args) {
        
    
    EmployeeObject eo1 = new EmployeeObject();
    EmployeeObject eo2 = new EmployeeObject();
    EmployeeObject eo3 = new EmployeeObject();
    
    eo1.inset(101, "Mamun", 4500);
    eo2.inset(102, "saddam", 6500);
    eo3.inset(103, "malek", 4550);
    eo1.display();
    eo2.display();
    eo3.display();
        }
    
}
