

package bank;
public class bankMain {
    String bannkname;
    int bankid;
    long bankphno;
    private int banktotalfund;
    private float bankInt;

    public bankMain(String bankname, int banktotalfund, float bankInt, long banktotalfound, float bankInt) {
        this.banktotalfund = banktotalfund;
        this.bankInt = bankInt;
    }

    public void checkLoan(int loanAmount){
        if(loanAmount < banktotalfund){
            System.out.println("loan approved");
            totalIntr(branchIntr);
        }
    }

    void totalIntr(float branchIntr){
        System.err.println("Your total intr will be:" +(branchIntr + this.bankInt));

    }



    }
