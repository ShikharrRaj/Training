package JavaProject;

import java.util.Scanner;

public class MainFile {
    Bank BankObj=new Bank();
    public static void main(String args[]){
        MainFile mainFile=new MainFile();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Add Customer\n 2. Deposit\n 3. Check Balance\n 4. Withdraw\n 5. Transaction History\n 6. Exit");
            int choice=sc.nextInt();
            long account_no;
            switch(choice){
                case 1: 
                    Customer customer=new Customer();
                    customer.addCustomer();
                    mainFile.BankObj.map.put(customer.account.account_no, customer);
                    break;
                case 2:
                    System.out.println("Enter account no");
                    long accountNo = sc.nextLong();
                    if (mainFile.BankObj.map.containsKey(accountNo)) {
                        Atm atmobj = new Atm();
                        mainFile.BankObj.map.put(accountNo, atmobj.deposit(mainFile.BankObj.map.get(accountNo)));

                    }else{
                        System.out.println("Account No not valid");
                    }
                    break;
                case 3:
                    System.out.println("enter account no");
                    long accountNo1= sc.nextLong();
                    if (mainFile.BankObj.map.containsKey(accountNo1)) {
                        Atm atmobj = new Atm();
                        mainFile.BankObj.map.replace(accountNo1,
                        atmobj.checkBalance(mainFile.BankObj.map.get(accountNo1)));

                    }
                    break;
                case 4:
                System.out.println("enter account no");
                 account_no= sc.nextLong();
                if (mainFile.BankObj.map.containsKey(account_no)) {
                    Atm atmobj = new Atm();
                    mainFile.BankObj.map.replace(account_no,
                    atmobj.withdraw(mainFile.BankObj.map.get(account_no)));

                }
                break;
                case 5:
                System.out.println("enter account no");
                account_no = sc.nextLong();
                if (mainFile.BankObj.map.containsKey(account_no)) {
                    mainFile.BankObj.map.get(account_no).account.Transaction();
                    

                }
                case 6: System.exit(1);
                default:
                System.out.println("wrong choice");

            }
        }
        
    }
}
