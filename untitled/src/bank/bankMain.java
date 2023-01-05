

package bank;
public class bankMain {
    String bankname;
    int bankid;
    long bankphno;
    private int banktotalfund;
    private float bankInt;

    public bankMain(String bannkname, int bankid, long bankphno, int banktotalfund, float bankInt) {
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
        }
    }

    void totalIntr(float branchIntr){
        System.err.println("Your total intr will be:" +(branchIntr + this.bankInt));

    }



}
