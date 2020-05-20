package Homework.HW5DeclaringAndCallingMethods.HW5_1;

public class BankAccount {
     int id;
     String name;
     double balance;

     double popolnenieScheta(double summaPopolnenija) {
         balance+=summaPopolnenija;
         return balance;
     }

     double snyatieSoScheta(double summaSnyatija){
         balance-=summaSnyatija;
         return balance;
     }

     public static void main(String[] args) {

         BankAccount MyAccount = new BankAccount();
         BankAccount YourAccount = new BankAccount();
         BankAccount HisAccount = new BankAccount();

         MyAccount.id=1;
         MyAccount.name="Serj";
         MyAccount.balance=12.35;

         YourAccount.id=12;
         YourAccount.name="Mark";
         YourAccount.balance=142.35;

         HisAccount.id=15;
         HisAccount.name="Jon";
         HisAccount.balance=122.35;

         System.out.println(MyAccount.balance);
         //System.out.println(HisAccount.name);
         System.out.println(MyAccount.popolnenieScheta(234));
         System.out.println(MyAccount.snyatieSoScheta(65.3));



    }
}
