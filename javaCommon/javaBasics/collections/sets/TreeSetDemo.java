package sets;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	    // 使用自然排序将字符串加入TreeSet集合
	    System.out.println( "字符串（自然排序）：" );
	    Set<String> set = new TreeSet<String>();
	    set.add("java");
	    set.add("linkedhashset");
	    set.add("awesome");
	    set.add("zzz");
	    set.add("treeset");
	 
	    // 元素在添加的时候就已经间接调用compareTo方法进行排序
	    for (Object object : set) {
	      System.out.println( object);
	    }
	   
	    // 使用比较器将字符串按由长至短加入TreeSet集合
	    System.out.println( "字符串（比较器）：" );
	    Set<String> setComparatorByLength =
	        new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));	//排列顺序逆转
	    setComparatorByLength.add( "java");
	    setComparatorByLength.add( "linkedhashset");
	    setComparatorByLength.add( "awesome");
	    setComparatorByLength.add( "zzz");
	    setComparatorByLength.add( "treeset");
	 
	    for (String string : setComparatorByLength) {
	      System.out.println( string);
	    }
	   
	    // 使用自然排序将自定义类加入TreeSet集合
	    System.out.println( "自定义类（自然排序）：" );
	    Set<Person> setObj = new TreeSet<Person>();
	    setObj.add(new Person( "jacob", 25));
	    setObj.add(new Person( "meteor", 23));
	    setObj.add(new Person( "kitty", 22));
	    setObj.add(new Person( "tom", 26));
	    for (Iterator<Person> it = setObj.iterator(); it.hasNext();) {
	      System.out.println( it.next());
	    }
	 
	    // 使用比较器将自定义类加入TreeSet集合
	    System.out.println( "自定义类（比较器）：" );
	    TreeSet<Person> setObjComparatorByAge = new TreeSet<Person>(new ComparatorByAge());
	    setObjComparatorByAge.add( new Person( "jacob", 25));
	    setObjComparatorByAge.add( new Person( "meteor", 23));
	    setObjComparatorByAge.add( new Person( "kitty", 22));
	    setObjComparatorByAge.add( new Person( "tom", 26));
	    for (Iterator<Person> it = setObjComparatorByAge.iterator(); it .hasNext();) {
	      System.out.println( it.next());
	    }

	}

}
