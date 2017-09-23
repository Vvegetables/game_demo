package sets;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person>{
	 @Override
     public int compare(Person o1, Person o2) {
           int margin = o1.getAge() - o2.getAge();
           return margin == 0 ? o1 .compareTo(o2 ) : margin ;
     }
}