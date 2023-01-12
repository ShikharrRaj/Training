package JavaProject;

import java.util.Scanner;

public class Atm implements AtmInterface{

    public Customer Customer;
    private float amount;
   


    @Override
    public Customer deposit(Customer customer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your deposit amount");
        float amount = sc.nextFloat();
        customer.account.account_balance = customer.account.account_balance + amount;
        System.out.println(customer.account.account_balance);
        Transaction transaction= new Transaction();
        transaction.addTransaction("deposit", amount, customer.account.account_balance);
        customer.account.transaction.add(transaction);
        return customer;
        // TODO Auto-generated method stub
        
    }

    @Override
    public Customer withdraw(Customer customer) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter card No");
        long cardNo=sc.nextLong();
        System.out.println("enter your pin");
        long pin=sc.nextLong();
        if(cardNo==customer.cardNo&& pin==customer.password){
            System.out.println("enter withdraw amount");
            float amount=sc.nextFloat();
            if(amount<customer.account.account_balance && customer.account.account_balance-amount>10000){
                System.out.println("collect your amount");
                customer.account.account_balance=customer.account.account_balance-amount;
                System.out.println("current balance:"+customer.account.account_balance);
                Transaction transaction= new Transaction();
                transaction.addTransaction("withdraw", amount, customer.account.account_balance);
                customer.account.transaction.add(transaction);
                return Customer;
            }else{
                System.out.println("don't have enough balance");
            }
        }else{
            System.out.println("wrong credential");
        }
        return Customer;
       
        // TODO Auto-generated method stub
        
    }

    @Override
    public Customer checkBalance(Customer customer) {
        System.out.println("Your account balance" +customer.account.account_balance);
        Transaction transaction= new Transaction();
        transaction.addTransaction("checkbalance", amount, customer.account.account_balance);
        customer.account.transaction.add(transaction);
        return Customer;
        // TODO Auto-generated method stub
        
    }

    public void Transaction(JavaProject.Customer customer2) {
    }

    

    
}
