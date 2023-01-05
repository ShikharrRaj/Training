


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
public class studentMain extends Branch{
    private static final String StudentId = null;
    String studentName;
    String studentPlace;
    int studentId;
    public Student(String collegeName, int collegeId, String collegeAd, String branchName, int branchId,
            int branchStaffNo, String studentName, String studentPlace, int studentId) {
        super(collegeName, collegeId, collegeAd, branchName, branchId, branchStaffNo);
        this.studentName = studentName;
        this.studentPlace = studentPlace;
        this.studentId = studentId;
    }
    
    void Display()
    {
        System.out.println("Student Detail");
        System.out.println("Student Name : "+studentName);
        System.out.println("Student Id : "+StudentId);
        System.out.println("Student College name : "+CollegeName);
        System.out.println("College adress : "+ CollegeAd);
        System.out.println("Branch   :  "+ BranchName);
    }
    public static void main(String args[]){
        
    }





}



