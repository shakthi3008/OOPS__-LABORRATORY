import java.util.Scanner;
public class ATMSimulator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int balance = 10000;
int pin = 1234;
int enteredPin;
System.out.print("Enter PIN: ");
enteredPin = sc.nextInt();
if (enteredPin == pin) {
int choice;
do {
System.out.println("\n--- ATM MENU ---");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:
System.out.println("Balance: Rs." + balance);
break;
case 2:
System.out.print("Enter deposit amount: ");
int deposit = sc.nextInt();
balance += deposit;
System.out.println("Amount Deposited Successfully.");
break;
case 3:
System.out.print("Enter withdrawal amount: ");
int withdraw = sc.nextInt();
if (withdraw <= balance) {
balance -= withdraw;
System.out.println("Please collect your cash.");
} else {
System.out.println("Insufficient Balance.");
}
break;
case 4:
System.out.println("Thank You!");
break;
default:
System.out.println("Invalid Choice.");
}
} while (choice != 4);
} else {
System.out.println("Incorrect PIN.");
}
sc.close();
}
}
EXPERIMENT 12 - ATM SIMULATOR
OUTPUT
Enter PIN: 1234
--- ATM MENU ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 1
Balance: Rs.10000
--- ATM MENU ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 2
Enter deposit amount: 5000
Amount Deposited Successfully.
--- ATM MENU ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 3
Enter withdrawal amount: 2000
Please collect your cash.
--- ATM MENU ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 4
Thank You!