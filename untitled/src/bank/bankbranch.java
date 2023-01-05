
package  bank;

import java.util.Scanner;

public class bankbranch extends bankMain{
    String branchname;
    int branchid;
    long branchphno;
    private int branchtotalfund;
    private float branchIntr;


    public bankbranch(String bankname, int banktotalfund, float bankInt, long bankphno, float bankInt2,
                      String branchname, int branchid, long branchphno, int branchtotalfund, float branchIntr) {
        super(bankname,2,bankphno,banktotalfund, bankInt2);
        super.bankname = bankname;

        super.bankid = bankid;
        super.bankphno= bankphno;
        this.branchname = branchname;
        this.branchid = branchid;
        this.branchphno = branchphno;
        this.branchtotalfund = branchtotalfund;
        this.branchIntr = branchIntr;
    }


    public static void main(String args[]){
        bankbranch Axis= new bankbranch("axis", 2323, 032626221, 10000000, 5f, "mumbai", 5555, 85262326, 10000, 4f);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the loan amount");
        int loan=sc.nextInt();
        Axis.checkLoan(loan, Axis.branchIntr);

    }



}