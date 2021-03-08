/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author User
 */
public class ObjectComparison {

    public static void main(String[] args) {
        Double d = new Double(123.45555);
        long l = new Long(9887544);
        
        System.out.println("Object are not equal: "+d.equals(l));
        System.out.println("Object are equal: "+ d.equals(123.45555));
        
        
        EmployeeComparisom emp1 = new EmployeeComparisom(101, "Mamun", "123456789");
        EmployeeComparisom emp2 = new EmployeeComparisom(102, "saddam", "124578120");
        
        int a = emp1.hashCode();
        int b = emp2.hashCode();
        System.out.println(a);
        System.out.println(b);
        System.out.println(emp1.equals(emp2));
        
    }

}
