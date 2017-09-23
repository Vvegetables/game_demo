package sets;

import java.util.Comparator;

public class ComparatorByLength implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
          int result = s1.length() - s2.length();
          return result == 0 ? s1 .compareTo(s2 ) : result ;
    }
}