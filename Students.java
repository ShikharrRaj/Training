
import java.util.Scanner;
class College{
    
   public String CollegeName;
   private int CollegeId;
   public String CollegeAd;
   public College(String collegeName, int collegeId, String collegeAd) {
    CollegeName = collegeName;
    CollegeId = collegeId;
    CollegeAd = collegeAd;
 } 
  void Display()
  {
    System.out.println("College Detail");
    System.out.println("College Name : "+CollegeName);
    System.out.println("College Id : " +CollegeId);
    System.out.println("College Adress : "+CollegeAd);
  }
}

class Branch extends College{
   
    public String BranchName;
    private int BranchId;
    private int BranchStaffNo;

    public Branch(String collegeName, int collegeId, String collegeAd, String branchName, int branchId , int branchStaffNo) {
        super(collegeName, collegeId, collegeAd);
        BranchName = branchName;
        BranchId = branchId;
        BranchStaffNo = branchStaffNo;
    }

    public Branch(String collegeName, int collegeId, String collegeAd, String branchName) {
        super(collegeName, collegeId, collegeAd);
        BranchName = branchName;
    }

    void Display()
    {
        System.out.println("Branch Detail");
        System.out.println("Branch name : "+BranchName);
        System.out.println("Branch Id  : "+BranchId);
        System.out.println("Branch Staff Number : "+BranchStaffNo);
        System.out.println("CollegeName : "+ CollegeName);
        System.out.println("College Adress : "+CollegeAd);
    }
   
  
}
public class Students extends Branch{
    String StudentName;
    int StudentId;
    Long PhoneNo;

 
 



    public Students(String collegeName, int collegeId, String collegeAd, String branchName, String studentName, int studentId, Long phoneNo) {
        super(collegeName, collegeId, collegeAd, branchName);
        StudentName = studentName;
        StudentId = studentId;
        PhoneNo = phoneNo;
    }

    void Display()
    {
        System.out.println("Student Detail");
        System.out.println("Student Name : "+StudentName);
        System.out.println("Student Id : "+StudentId);
        System.out.println("Student Phone number : " +PhoneNo);
        System.out.println("Student College name : "+CollegeName);
        System.out.println("College adress : "+ CollegeAd);
        System.out.println("Branch   :  "+ BranchName);
    }



    public static void main(String[]args)
    {  
         Students S1= new Students("vesit" , 10, "kharghar", "extc","Shikhar", 10,9432256058l);
         Branch B1= new Branch("vesit", 10, "kharghar", "extc", 11, 20);
         College C1 = new College("vesit",10 , "kharghar");
         boolean b=true;
         while(b)
         {   
            Scanner sc= new Scanner(System.in);
            int choice ;
            System.out.println("Enter Your Choice to see detail");
            System.out.println("...................................");
            System.out.println("1.To see Student Detail");
            System.out.println("2. To see Branch Detail");
            System.out.println("3. To  College Details ");
            System.out.println("4.To Exit ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : S1.Display();
                break;
                case 2 :  B1.Display();
                break;
                case 3 :  C1.Display();
                break;
                case 4 :  b=false;
                break;
                default : System.out.println("SORRY!!  Invalid Input ");
            
            }
         }

    }

}