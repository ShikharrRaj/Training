import java.util.Scanner;

public class Task2 {
    public String name,company;
    private int UserID;
    private String Position;
    protected  int age;
    public String place;

    public Task2(String name, String company, int userID, String position, int age, String place) {
        this.name = name;
        this.company = company;
        UserID = userID;
        Position = position;
        this.age = age;
        this.place=place;
    }



    void Display()
    {
        System.out.println("Employee Detail");
        System.out.println("Name: " +name);
        System.out.println("company name : " + company);
        System.out.println("User Id : "+UserID);
        System.out.println("Position :"+Position);
        System.out.println("Age : " +age);
        System.out.println("place:"+place);


    }



    public static void main (String[]args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter Companyname");
        String company = sc.next();
        System.out.println("Enter UserID");
        int UserID = sc.nextInt();
        System.out.println("Enter Position");
        String Position=sc.next();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter place");
        String place= sc.next();

        Task2 User= new Task2( name, company, UserID, Position,  age, place);
        User.Display();

    }
}