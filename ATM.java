import java.util.Scanner;

public class ATM{

    static int password;
    static float account=0;
    static float amount;
    static int choice;
    static int count=4;

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

    static void balance(){
        System.out.print("Current balance: ");
        System.out.println(account);
        menu();
    }

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

    static void deposit(float amount){
        account=account+amount;
        System.out.println("Successfully Deposited.");
        menu();
    }

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