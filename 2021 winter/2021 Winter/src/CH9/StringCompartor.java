import java.util.Comparator;

public class StringCompartor<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        
        String s1 = ((String) (o1)).toUpperCase();
        String s2 = ((String) (o2)).toUpperCase();

        return s1.compareTo(s2);
    }
    
}
