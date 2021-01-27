import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main9 {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("Peach");
        list.add("melon");
        list.add("Potato");
        list.add("banana");

        System.out.println(list);

        // Collections.sort(list, new Comparator<String>(){
         
        //     @Override
        //   public int compare(String o1, String o2) {
        //       String s1 = o1.toUpperCase();
        //       String s2 = o2.toUpperCase();

        //       return s1.compareTo(s2);
        //   } 
        // } );

        Collections.sort(list,
         (o1, o2) -> {
              String s1 = o1.toUpperCase();
              String s2 = o2.toUpperCase();

              return s1.compareTo(s2);
          } 
         );

        System.out.println(list);
    }
}
