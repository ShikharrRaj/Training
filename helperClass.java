import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class helperClass extends student {
   Scanner sc=new Scanner(System.in);
        HashMap<Integer, student> studentMap = new HashMap<Integer, student>();

        public void addstudent(){
            student std = new student();
            System.out.println("Enter Student Name:");
            std.name=sc.next();
            System.out.println("Enter Student Roll no:");
            std.rollno=sc.nextInt();
            System.out.println("Enter Student College Name:");
            std.college=sc.next();
            System.out.println("Enter Student Place Name:");
            std.place=sc.next();
            std.college=sc.next();
            System.out.println("Enter Student Branch Name:");
            std.branch=sc.next();
            studentMap.put(std.rollno, std);
            
        
        }

       public void searchStudent(){
            System.out.println("Enter Student Roll Number to Search:");
            int i=sc.nextInt(rollno);
            System.out.println(studentMap.get(i));
            for(java.util.Map.Entry<Integer, student> s: studentMap.entrySet()){            
            if(i==s.getKey())
            {
                System.out.println("Student found:");
                System.out.println("Student Name:" +s.getValue().name);
                System.out.println("Student Roll no:" +s.getValue().rollno);
                System.out.println("Student College:"+s.getValue().college);
                System.out.println("Student Place:" +s.getValue().place);
                
            }

            
        }
    }
                public void deleteStudent(){

                }
          
            
                public static void main(String args[]){
                student std =new student();
                System.out.println("Enter student name:");
                String s= std.sc.next();
                System.out.println("Enter student Roll No:");
                int r= std.sc.nextInt();
                System.out.println("Enter student college name:");
                String c= std.sc.next();
                while(true){
                System.out.println("Enter Case\n 1:Add Student\n 2:Search Student\n 3:Delete Student\n 4:exit");
                int choice =std.sc.nextInt();
                switch(choice)
                {
                    case 1: std.addstudent();
                    break;
    
                    case 2: std.searchStudent();
                    break;

                    case 3: std.deleteStudent();
    
    
                    case 4: System.exit(1);
                    break;
    
                }
            }
        }
}
        
    

        




    
    

