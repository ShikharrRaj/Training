
import java.util.ArrayList;
import java.util.Iterator;


class Day_11{
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList <Integer>();
        array.add(2);
        array.add(5);
        array.add(6);
        //System.out.println( array.get(0));
        //array[0] = 4;
        array.set(0, 4);
        //System.out.println(array.get(0));

        // for (Integer a : array) {
        //     System.out.println(a);
            
        // }

        Iterator it = array.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
        System.out.println(array.size());
        //[1,2,3,4]

        array.remove(0);

        System.out.println( array.isEmpty());

        array.clear();
        System.out.println(array.get(0));


    }
}