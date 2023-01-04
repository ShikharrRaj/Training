package java;

public class ConstructorDemo {
    String userName;
    String userPlace;
    int userAge;

    public ConstructorDemo(){
        System.out.println("Constructor is called");
    }

    public static void name(String args[]) {
        ConstructorDemo obj=new ConstructorDemo();

        System.out.println(obj.userName);
        
    }
}
