package java.Ineritance;

public class Employee extends Company {
    String empName;
    String empId;
    String empPosition;
    float empSal;
    public Employee(String companyId, String companyName, String companyPlace, int CompanyStartYear, String empName,
            String empId, String empPosition, float empSal) {
        super(companyId, companyName, companyPlace, CompanyStartYear);
        this.empName = empName;
        this.empId = empId;
        this.empPosition = empPosition;
        this.empSal = empSal;
        this.companyName=companyName;
        this.companyId=companyId;
        this.companyPlace=companyPlace;
        this.CompanyStartYear=CompanyStartYear;
    }
    
    }
    public void showEmployeeDetails() {
        System.out.println(this.empName);
        System.out.println(this.empId);
        System.out.println(this.empPosition);
        System.out.println(this.empSal);
        Employee obj1=new Employee(companyId, companyName, companyPlace, CompanyStartYear, empName, empId, empPosition, empSal)
    }
    public static void main(String args[]) {
        Employee obj1 = new Employee(null, null, null, 0, null, null, null, 0)
        
    }

}
