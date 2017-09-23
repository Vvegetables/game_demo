package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {

	public static void main(String[] args) {
		/*
	     * LinkedHashSet可以保持元素存取顺序
	     */
	    Set<String> set1 = new HashSet<String>();
	    Set<String> set2 = new LinkedHashSet<String>();
	    init(set1 );
	    init(set2 );
	 
	    System.out.println( "HashSet:");
	    for (Iterator<String> it = set1.iterator(); it.hasNext();) {
	      System.out.println( it.next());
	    }
	    System.out.println( "LinkedHashSet:");
	    for (Iterator<String> it = set2.iterator(); it.hasNext();) {
	      System.out.println( it.next());
	    }
	  }
	 
	  public static void init(Set<String> set) {
	    set.add("Java1");
	    set.add("Java2");
	    set.add("Java3");
	    set.add("Java4");
	    set.add("Java5");
	  }

}

