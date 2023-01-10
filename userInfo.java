import java.util.Scanner;
public class userInfo extends bankBranch  {
    String name;
    int loanAmount;
    int count=0;
    userInfo arrayuserInfo[];
    Scanner sc=new Scanner(System.in);
    private int banktotalfund;

    public userInfo(String bannkname, int bankid, long bankphno, int banktotalfund, float bankInt, String branchname,
            int branchid, long branchphno, int branchtotalfund, float branchIntr, String name, int loanAmount) {
        super(bannkname, bankid, bankphno, banktotalfund, bankInt, branchname, branchid, branchphno, branchtotalfund,
                branchIntr);
                this.name=name;
                this.loanAmount=loanAmount;
        //TODO Auto-generated constructor stub
    }


    void storeUserData(){
        if(count<arrayuserInfo.length){
        userInfo U=new userInfo(bankname, bankid, bankphno, banktotalfund, bankid, branchname, branchid, branchphno, banktotalfund, branchIntr, bankname, loanAmount);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name:");
        U.name=sc.next();
        System.out.println("Enter user loan Amount:");
        U.loanAmount=sc.nextInt();

        arrayuserInfo[count]=U;
        count++;
        }else{
            System.out.println("Array size full");
        }



    }


    void displayUserDetails(){
        for(userInfo U: arrayuserInfo){
            if(U!=null){

        System.out.println("Enter User name:" +U.name);
        System.out.println("Enter loan amount:" +U.loanAmount);

        }
    }


    }

    public static void main(String args[]){
        
        userInfo U=new userInfo("axis", 1212, 887451256, 1000000, 5f, "kharghar", 12, 99658321, 100000, 4f, "", 0);
        System.out.println("Enter number of user:");
        int n=U.sc.nextInt();
        U.arrayuserInfo=new userInfo[n];
        

        bankBranch Axis= new bankBranch("axis", 1212, 887451256, 1000000, 5f, "kharghar", 12, 99658321, 100000, 4f);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of user:");
        String name=sc.next();
        System.out.println("enter the loan amount");
        int loan=sc.nextInt();
        Axis.checkLoan(loan, Axis.branchIntr);
        U.arrayuserInfo=new userInfo[n];
        U.storeUserData();
        U.displayUserDetails();
        

        while(true){
            System.out.println("Enter Case\n 1:addUser\n 2:Display approved user loan\n 3:exit");
            int choice =U.sc.nextInt();
            switch(choice)
            {
                case 1: U.storeUserData();
                break;

                case 2: U.displayUserDetails();
                break;


                case 3: System.exit(1);
                break;

            }
        }


    }


}
