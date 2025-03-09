/*
 * Program To Utilize Encasulation by Hiding the bank balance details
 * Author: Thuku Josphat Wamwago
 * Reg No: CT101/G/19448/23
 * Date: 9/3/2025
 * Version: 1
 */
import java.util.Scanner;

class Account{
    private  double balance = 600;
    public double deposit;
    public double withdrawal;

    Account(){
        System.out.println("Your Balance Is: " + balance);
    }

    void Display(){
        System.out.println("Your Balance is: "+ balance);
    }
    void withdrawals(double withdrawal){
        if (withdrawal > balance){
            System.out.println("You Cannot Withdraw More Funds Than Your Balance:( ");
            System.exit(1);
        }
        else{
            balance = balance - withdrawal;
            System.out.println("After Withdrawal, Balance = " + balance);
        }
    }
    void deposit(double deposit){
        System.out.println("Deposit Successful: )");
        System.out.println("Balance Is: " + (balance + deposit));
    }
}
public class BankAccount {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Choose The Desired Operation");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");

        int choice = scanner.nextInt();

        if(choice ==1){
            account.Display();
        }
        else if(choice ==2){
            System.out.print("Enter The Amount: ");
            double with = scanner.nextDouble();

            account.withdrawals(with);
        }
        else if(choice ==3){
            System.out.print("Enter The Amount To Deposit: ");
            double depo = scanner.nextDouble();
            account.deposit(depo);
        }
    }
}
/*
The program utilizes encapsulation by bundling data (variables) and methods (functions) 
that operate on that data into a single unit, often a class, and restricts direct access to some of the object's components(The balance variable),
 protecting data integrity and promoting controlled access
 */
