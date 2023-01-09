
import java.util.Scanner;

public class Student{
    String name;
    int age;
    String place;
    String college;
    static int count =0;

    Student arrayStudent[];
    Scanner sc=new Scanner(System.in);


    public void addStudent(){
        if(count<arrayStudent.length){
        Student s=new Student();
        System.out.println("Enter student name:");
        s.name=sc.next();
        System.out.println("Enter student age:");
        s.age=sc.nextInt();
        System.out.println("Enter student place:");
        s.place=sc.next();
        System.out.println("Enter student college:");
        s.college=sc.next();

        arrayStudent[count]=s;
        count++;
        }else{
            System.out.println("Array size full");
        }
    
    }
    void displayStudent(){
        for(Student s: arrayStudent){
            if(s!=null){
        System.out.println("Enter student name:" + s.name);
        System.out.println("Enter student age:"+ s.age);
        System.out.println("Enter student place:" + s.place);
        System.out.println("Enter student college:" + s.college);
        }
    }
    }

    public static void main(String args[]){
        Student s = new Student();
        System.out.println("Enter number of students:");
        int n = s.sc.nextInt();
        s.arrayStudent=new Student[n];
        while(true){
            System.out.println("Enter Case\n 1:addStudent\n 2:Display\n 3:exit");
            int choice =s.sc.nextInt();
            switch(choice)
            {
                case 1: s.addStudent();
                break;

                case 2: s.displayStudent();
                break;

                case 3: System.exit(1);
                break;

            }
        }


    }




}
