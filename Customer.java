package JavaProject;

import java.util.Scanner;

public class Customer extends Bank implements CustomerInterface{
    public Account account;
    String name="";
    int id=0;
    String email="";
    int password=0;
    long cardNo=0;
    long phno=0;
    String address="";

    @Override
    public void addCustomer() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter CustomerID");
        this.id=sc.nextInt();
        System.out.println("Enter Name of Customer");
        this.name=sc.next();
        System.out.println("Enter Customer email");
        this.email=sc.next();
        System.out.println("Enter Customer Password");
        this.password=sc.nextInt();
        System.out.println("Enter Customer CardNo");
        this.cardNo=sc.nextLong();
        System.out.println("Enter Customer phno");
        this.phno=sc.nextLong();
        System.out.println("Enter Customer Address");
        this.address=sc.next();
        this.account=new Account().addAccount();

        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editCustomer() {
        // TODO Auto-generated method stub
        
    }
    
}
