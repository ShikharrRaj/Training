import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class ListListDemo {
    ListListDemo lisstlistDemo() {
        return new ListListDemo();
    }
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        
        list.push(2);
        list.push(20);
        list.push(24);
        list.push(21);
        list.pop();

          Iterator it = list.iterator();
          while (it.hasNext()) {
              System.out.println(it.next());
          }

        
    } 
}
