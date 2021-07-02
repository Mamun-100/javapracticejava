/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestLoanClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of Year: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan ammount");
        double loanAmont = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmont);

        System.out.printf("Get LoanDate: %s\n"
                + "monthly payment: %.2f\nTotal payment: %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());

    }

}
