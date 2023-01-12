import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
public class student {
    String name;
    int rollno;
    String college;
    String place;
    String branch;
    int sem;
    public student(String name, int rollno, String college, String place, String branch, int sem) {
        this.name = name;
        this.rollno = rollno;
        this.college = college;
        this.place = place;
        this.branch = branch;
        this.sem = sem;
    }

    Scanner sc=new Scanner(System.in);
    public void display(){
        System.out.println("Enter Student Name:" +this.name);
        System.out.println("Enter Student Roll no:" +this.rollno);
        System.out.println("Enter Student College Name:" +this.college);
        System.out.println("Enter Student Place Name:" +this.place);
        System.out.println("Enter Student Branch Name:" +this.branch);
        System.out.println("Enter Student Sem:" +this.sem);
    }
    public void addstudent() {
    }
    public void searchStudent() {
    }

    public void deleteStudent(){
        
    }

}