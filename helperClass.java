import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class helperClass  {
   Scanner sc=new Scanner(System.in);
        HashMap<Integer, student> studentMap = new HashMap<Integer, student>();
        private Object map;
        

        public void addstudent(){
            System.out.println("Enter Student Name:");
            String name=sc.next();
            System.out.println("Enter Student Roll no:");
            int rollno=sc.nextInt();
            System.out.println("Enter Student College Name:");
            String college=sc.next();
            System.out.println("Enter Student Place Name:");
            String place=sc.next();
            System.out.println("Enter Student Branch Name:");
            String branch=sc.next();
            System.out.println("Enter Student Sem:");
            int sem=sc.nextInt();
            while(((HashMap<Integer, student>) this.map).containsKey(rollno)){
                System.out.println("Roll no is not unique");
                System.out.println("Enter new roll no");
                rollno=sc.nextInt();
            }
            student std = new student(name, rollno, college, place, branch, sem);
            studentMap.put(std.rollno, std);

            
        
        }

       public void searchStudent(){
            System.out.println("Enter Student Roll Number to Search:");
            int rollno=sc.nextInt();
            if(((HashMap<Integer, student>) this.map).containsKey(rollno)){
                ((HashMap<Integer, student>) this.map).get(rollno).display();
            }else{
                System.out.println("roll no is not present");
            }
           
    }
                public void deleteStudent(){
                    System.out.println("Enter student roll no to delete");
                    int rollno=sc.nextInt();
                    student std= ((HashMap<Integer, student>) this.map).remove(rollno);
                    if(std!=null){
                        System.out.println("delete student details");
                        std.display();
                    }else{
                        System.out.println("roll no not found in list");
                    }
                }

                void updatestudent(){
                    System.out.println("enter student roll no to update");
                    int rollno=sc.nextInt();
                    if(((HashMap<Integer, student>) this.map).containsKey(rollno)){
                        student std=((HashMap<Integer, student>) this.map).get(rollno);
                        ((HashMap<Integer, student>) this.map).replace(rollno,std);
                    }else{
                        System.out.println("roll no not found");
                    }

                }
          
            
                public static void main(String args[]){
                    helperClass std = new helperClass();
                System.out.println("Enter student name:");
                String s= std.sc.next();
                System.out.println("Enter student Roll No:");
                int r= std.sc.nextInt();
                System.out.println("Enter student college name:");
                String c= std.sc.next();
                System.out.println("Enter student place name:");
                String p= std.sc.next();
                
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
        
    

        




    
    

