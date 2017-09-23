package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * Set集合中的元素是唯一的，不可重复（取决于hashCode和equals方法），也就是说具有唯一性。
 * Set集合中元素不保证存取顺序，并不存在索引。
继承关系
Collection
    |--Set：元素唯一，不保证存取顺序，只可以用迭代器获取元素。
        |--HashSet：哈希表结构，非线程安全，查询速度较快。元素唯一性取决于hashCode和equals方法。
            |--LinkedHashSet：带有双向链表的哈希表结构，非线程安全，保持存取顺序，保持了查询速度较快特点。
        |--TreeSet：平衡排序二叉树（红黑树）结构，非线程安全，按自然排序或比较器存入元素以保证元素有序。
                    元素唯一性取决于ComparaTo方法或Comparator比较器。
常用方法
Set集合的方法和Collection集合的方法几乎一致。
 * 
 *
 */

public class HashSetDemo {

	public static void main(String[] args) {
		//int t = 10;
		//test(t);
		//System.out.println(t);
		//Set集合保证元素唯一性
		System.out.println("Set集合保证元素唯一性,但是不保证顺序");
		Set<String> set = new HashSet<String>();
		System.out.println("此时hashset的容量：" + set.size());
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		System.out.println("添加元素之后hashset的容量：" + set.size());
		
		//遍历
		for(Iterator<String> iterator = set.iterator(); iterator.hasNext();){
			System.out.println("set的值：" + iterator.next());
			
		}
		System.out.println("-------------------");
		
		// Set集合存储自定义类时，建议该类重写hashCode和equals方法，这是保证元素唯一性的前提，一般还会重写toString方法。
		System.out.println("Set集合存储自定义类时，建议该类重写hashCode和equals方法，这是保证元素唯一性的前提，一般还会重写toString方法。");
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(new Person("java",10));
		personSet.add(new Person("c++",50));
		personSet.add(new Person("c",60));
		personSet.add(new Person("c",60));
		
		//遍历
		for(Iterator it = personSet.iterator(); it.hasNext();){
			System.out.println("人的信息：" + it.next());
		}
		/**
		 * 1. Comparable接口
		  自定义类如果实现该接口，那么重写该接口唯一的方法comparaTo(E)，可以让该类具有可比较性。

		   2. Comparator接口
		  实现该接口的类被称之为比较器，一般只具有一个方法，就是重写的这个接口的compara(E o1, E o2)方法，实现两个对象之间的比较。
		 */
		/*
	     * 案例：获取集合最大值
	     */
	    Set<String> set2 = new HashSet<String>();
	    set2.add("Jacob");
	    set2.add("Java");
	    set2.add("Meteor");
	    set2.add("abc");
	    set2.add("it&java");
	    set2.add("zz");
	    // 方法一：使用Collections.max()方法（使用的是自然排序方法）。
	    System.out.println(Collections. max(set2));
	    // 方法二：使用自然排序
	    System.out.println( getMax(set2));
	    // 方法三：使用比较器（ComparatorByLength）
	    System.out.println( getMax(set2, new ComparatorByLength()));
	}
	
	 /**
	   * 使用比较器获取Set集合中的最大值（使用字符串长度比较器）
	   *
	   * @param set
	   * @param comparatorByLength
	   * @return
	   */
	  public static Object getMax(Set<String> set , ComparatorByLength comparatorByLength ) {
	    if (comparatorByLength == null) {
	      throw new NullPointerException();
	    }
	    Iterator<String> it = set.iterator();
	    String max = it.next();
	    while ( it.hasNext()) {
	      String obj = it.next();
	      if (comparatorByLength.compare( obj, max) > 0) {
	        max = obj;
	      }
	    }
	    return max;
	  }
	  /**
	   * 使用自然排序获取Set集合中的最大值。
	   *
	   * @param set
	   * @return
	   */
	  public static Object getMax(Set<String> set ) {
	    Iterator<String> it = set.iterator();
	    String max = it.next();
	    while ( it.hasNext()) {
	      String com = it.next();
	      if (com.compareTo( max) > 0) {
	        max = com;
	      }
	    }
	    return max;
	  }
	
	
	public static void test(int t){
		++t;
		System.out.println(t);
	}

}
