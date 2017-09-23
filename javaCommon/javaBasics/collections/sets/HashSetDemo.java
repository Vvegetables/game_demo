package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * Set�����е�Ԫ����Ψһ�ģ������ظ���ȡ����hashCode��equals��������Ҳ����˵����Ψһ�ԡ�
 * Set������Ԫ�ز���֤��ȡ˳�򣬲�������������
�̳й�ϵ
Collection
    |--Set��Ԫ��Ψһ������֤��ȡ˳��ֻ�����õ�������ȡԪ�ء�
        |--HashSet����ϣ���ṹ�����̰߳�ȫ����ѯ�ٶȽϿ졣Ԫ��Ψһ��ȡ����hashCode��equals������
            |--LinkedHashSet������˫�������Ĺ�ϣ���ṹ�����̰߳�ȫ�����ִ�ȡ˳�򣬱����˲�ѯ�ٶȽϿ��ص㡣
        |--TreeSet��ƽ���������������������ṹ�����̰߳�ȫ������Ȼ�����Ƚ�������Ԫ���Ա�֤Ԫ������
                    Ԫ��Ψһ��ȡ����ComparaTo������Comparator�Ƚ�����
���÷���
Set���ϵķ�����Collection���ϵķ�������һ�¡�
 * 
 *
 */

public class HashSetDemo {

	public static void main(String[] args) {
		//int t = 10;
		//test(t);
		//System.out.println(t);
		//Set���ϱ�֤Ԫ��Ψһ��
		System.out.println("Set���ϱ�֤Ԫ��Ψһ��,���ǲ���֤˳��");
		Set<String> set = new HashSet<String>();
		System.out.println("��ʱhashset��������" + set.size());
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		System.out.println("����Ԫ��֮��hashset��������" + set.size());
		
		//����
		for(Iterator<String> iterator = set.iterator(); iterator.hasNext();){
			System.out.println("set��ֵ��" + iterator.next());
			
		}
		System.out.println("-------------------");
		
		// Set���ϴ洢�Զ�����ʱ�����������дhashCode��equals���������Ǳ�֤Ԫ��Ψһ�Ե�ǰ�ᣬһ�㻹����дtoString������
		System.out.println("Set���ϴ洢�Զ�����ʱ�����������дhashCode��equals���������Ǳ�֤Ԫ��Ψһ�Ե�ǰ�ᣬһ�㻹����дtoString������");
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(new Person("java",10));
		personSet.add(new Person("c++",50));
		personSet.add(new Person("c",60));
		personSet.add(new Person("c",60));
		
		//����
		for(Iterator it = personSet.iterator(); it.hasNext();){
			System.out.println("�˵���Ϣ��" + it.next());
		}
		/**
		 * 1. Comparable�ӿ�
		  �Զ��������ʵ�ָýӿڣ���ô��д�ýӿ�Ψһ�ķ���comparaTo(E)�������ø�����пɱȽ��ԡ�

		   2. Comparator�ӿ�
		  ʵ�ָýӿڵ��౻��֮Ϊ�Ƚ�����һ��ֻ����һ��������������д������ӿڵ�compara(E o1, E o2)������ʵ����������֮��ıȽϡ�
		 */
		/*
	     * ��������ȡ�������ֵ
	     */
	    Set<String> set2 = new HashSet<String>();
	    set2.add("Jacob");
	    set2.add("Java");
	    set2.add("Meteor");
	    set2.add("abc");
	    set2.add("it&java");
	    set2.add("zz");
	    // ����һ��ʹ��Collections.max()������ʹ�õ�����Ȼ���򷽷�����
	    System.out.println(Collections. max(set2));
	    // ��������ʹ����Ȼ����
	    System.out.println( getMax(set2));
	    // ��������ʹ�ñȽ�����ComparatorByLength��
	    System.out.println( getMax(set2, new ComparatorByLength()));
	}
	
	 /**
	   * ʹ�ñȽ�����ȡSet�����е����ֵ��ʹ���ַ������ȱȽ�����
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
	   * ʹ����Ȼ�����ȡSet�����е����ֵ��
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