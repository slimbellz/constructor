import java.util.Scanner;

public class AccountTest1
{
	public static void main(String[] args)
	{
	Account1 account1 = new Account1("Jane Green", 50.00);
	Account1 account2 = new Account1("John Blue", -7.53);

	System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
	System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

	Scanner input = new Scanner(System.in);

	System.out.print("Enter deposit amount for accout1: ");
	double depositAmount = input.nextDouble();
	System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
	account1.deposit(depositAmount);

	System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
	System.out.printf("%s balance: $ %n%n", account2.getName(), account2.getBalance()); 

	System.out.print("Enter deposit amount for accout2: ");
	depositAmount = input.nextDouble();
	System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
	account2.deposit(depositAmount);

	System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
	System.out.printf("%s balance: $ %.2f%n%n", account2.getName(), account2.getBalance()); 
	}
}