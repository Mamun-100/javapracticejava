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
public class AccountTest {

    public static void main(String[] args) {
      Account a = new Account();
      a.createCustomer(101, "sadia", 4000, "Dhaka");
      a.displayInformation();
      a.deposite(5000);
      a.checkInformation();
      a.withdraw(8000);
      a.displayInformation();

    }

}
