

public class branch extends collegeMain {
    String branchName;
    int branchId;
    int branchTotalStaff;
    public branch(String collegeName, int collegeId, String collegePlace, String branchName, int branchId,
            int branchTotalStaff) {
        super(collegeName, collegeId, collegePlace);
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchTotalStaff = branchTotalStaff;
    }

    
}
