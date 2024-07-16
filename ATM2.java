// This is an ATM simulation project given by OCTANET (summer internship).
// TASK-1 
/*Description: this is an simulation of real life ATM system it can perform tasks such as
fetching current account balance, depositing amount and withdrawl of money from account 
this is just a prototype not a real ATM , hence it's not 100% exact.*/

import java.util.Scanner;

public class ATM2{

    // initializing static variables.
    static int password;
    static float account=0;
    static float amount;
    static int choice;
    static int count=4;

    // Main menu of all tasks to be performed.
    static void menu(){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("1.Check Current A/C Balance.");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice:");
        choice=sc.nextInt();
        
    }

    // function for checking current balance.
    static void balance(){
        System.out.print("Current balance: ");
        System.out.println(account);
        menu();
    }

    // function for withdrawing certain amount.
    static void withdraw(float amount){
        if(account<amount){
            System.out.println("Insufficient Balance to withdraw.");
        }
        else{
        account=account-amount;
        System.out.println("Withdrawl Completed.");
        }
        menu();
    }

    // function for depositing the money to bank.
    static void deposit(float amount){
        account=account+amount;
        System.out.println("Successfully Deposited.");
        menu();
    }

    // function to choose specific option from the menu driven.
    static void option(){

        Scanner sc=new Scanner(System.in);
        menu();

        while(choice<4){

        if(choice==1) balance();

        if(choice==2){
            System.out.print("Enter the amount: ");
            amount=sc.nextFloat();
            withdraw(amount);
        }

        if(choice==3){
            System.out.print("Enter the amount: ");
            amount=sc.nextFloat();
            deposit(amount);
        }

        if(choice==4){
            System.out.println("Thank You");
            System.out.println("EXIT");
            System.out.println("**************************************************************");
        }
        }
    }

    //This is the main function.
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("----------------------WELCOM TO ATM SIMULATION---------------------");

        // it is considered that you already have a bank account and password (i.e 8517)

        // this loop will iterate 3 times if password is invalid.
        while(count!=0){
            System.out.print("Enter Password: ");
            password=sc.nextInt();
            if(password==8517){
                option();
                break;
            }
            else{
                count--;
                System.out.println("*******INVALID PLEASE TRY AGAIN*******");
            }

        }
        if(count==0){
            System.out.println("Too many invalid attempts.");
        }
        else{
            System.out.println("Thank you.");
        }
        
    }

}