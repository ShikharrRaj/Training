import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class demo {
    String name;
    int age;
  
    
  
    public demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void name(){
       
        System.out.println("Enter Name:");
        System.out.println("Enter age:");
        
    }

    void display(){
        
        System.out.println("Enter Name:" +name);
        System.out.println("Enter age:" +age);
    }



    public static void main(String args[]){
        System.out.println("details are:");
        
        demo d1= new demo("shikhar", 21);
        demo d2=new demo("saket", 22);
        demo d3=new demo("vishal", 21);
        demo d4=new demo("varun", 21);
        demo d5=new demo("sid", 20);
        ArrayList< demo> arr=new ArrayList<demo>();
        arr.add(d1);
        arr.add(d2);
        arr.add(d3);
        arr.add(d4);
        
        System.out.println(arr.get(1));

        arr.set(0, d5);

        //for(Integer a: arr)
       // {
            //System.out.println(a);
       // }

        Iterator it= arr.iterator();
        while(it.hasNext()){
            demo obj1=(demo) it.next();
            obj1.display();
        }
        System.out.println(arr.size());

       // arr.remove(0);

        System.out.println( arr.isEmpty());

        //arr.clear();

       System.out.println(arr.get(2));
        

    }

}
