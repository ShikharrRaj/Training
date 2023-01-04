package java;

import java.util.Scanner;

public class Userinfo {
    public String name;
    private int userid;
    public String companyname;
    public String place;
    protected int age;
    private String position;



    public void createuser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter details");
        System.out.println("Name");
        name = scan.next();
        System.out.println("userid");
        userid= scan.nextInt();
        System.out.println("companyname");
        companyname=scan.next();
        System.out.println("age");
        age=scan.nextInt();
        System.out.println("position");
        position=scan.next();
        System.out.println("place");
        place=scan.next();

    }
    void displayUserinfo(){
        System.out.println("Name:" +name);
        System.out.println("userid" +userid);
        System.out.println("companyname:" +companyname);
        System.out.println("place" +place);
        System.out.println("age" +age);
        System.out.println("position:" +position);
    }
    public static void main(String[] args) {
        Userinfo obj1 = new Userinfo();
        obj1.createuser();
        obj1.displayUserinfo();

    }
}