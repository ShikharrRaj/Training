package JavaProject;

import java.util.Scanner;

public class Account extends Bank implements AccountInterface {
    long account_no=0;
    float account_balance=0;
    String account_type="";

    @Override
    public Account addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account no");
        this.account_no=sc.nextLong();
        System.out.println("Enter Account balance");
        this.account_balance=sc.nextFloat();
        System.out.println("Enter Account type");
        this.account_type=sc.next();
        return this;


        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void searchAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editAccount() {
        // TODO Auto-generated method stub
        
    }
    
}
