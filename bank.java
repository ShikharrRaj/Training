
import java.util.Scanner;
public class bank {
    public String bankname="Axis";
    public int bankid=1212;
    public long bankphno=887451256;
    private int banktotalfund=1000000;
    private float bankInt=5f;
    Scanner sc=new Scanner(System.in);

    public bank(String bannkname, int bankid, long bankphno, int banktotalfund, float bankInt) {
        this.bankname = bankname;
        this.bankid = bankid;
        this.bankphno = bankphno;
        this.banktotalfund = banktotalfund;
        this.bankInt = bankInt;
    }

    public void checkLoan(int loanAmount, float branchIntr){
        if(loanAmount < banktotalfund){
            System.out.println("loan approved");
            totalIntr(branchIntr);
        }else{
            System.out.println("loan disapproved");
        }
    }

    void totalIntr(float branchIntr){
        System.err.println("Your total intr will be:" +(branchIntr + this.bankInt));

    }


    
}
