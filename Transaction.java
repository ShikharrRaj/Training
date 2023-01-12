package JavaProject;

import java.util.Date;

public class Transaction implements TransactionInterface {
    int transactionid;
    Date transactionDate;
    String transactionType;
    float transactionAmount;
    float currentBalance;

    @Override
    public void addTransaction(String transactionType, float transactionAmount, float currentBalance) {
        this.transactionDate= new Date();
        this.transactionType=transactionType;
        this.transactionAmount=transactionAmount;
        this.currentBalance=currentBalance;
        // TODO Auto-generated method stub
        
    }

   
        
    
    
}
