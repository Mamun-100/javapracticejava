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
public class Account {
    
    int account_no;
    String name;
    float amount;
    String branch;
    
    void createCustomer(int acc_no, String nam, float amt, String brn){
        account_no = acc_no;
        name = nam;
        amount = amt;
        branch = brn;
        
    }
    
    void deposite(float amt){
    amount = amount + amt;
        System.out.println("Deposite: "+amt);
    }
    
    void withdraw(float amt){
        if (amount < amt) {
            System.out.println("Insuffient Balance.");
        }else{
            amount = amount -amt;
            System.out.println("Withdraw: "+amt);
        }
    }
    
    void checkInformation(){
        System.out.println("Amount: "+amount);
    }
    
    void displayInformation(){
        System.out.println("Account_no: "+account_no +"\nName: "+name+"\nAmount: "+amount+"\nBranch: "+branch);
    }
}
