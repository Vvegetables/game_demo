package sets;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	    // ʹ����Ȼ�����ַ�������TreeSet����
	    System.out.println( "�ַ�������Ȼ���򣩣�" );
	    Set<String> set = new TreeSet<String>();
	    set.add("java");
	    set.add("linkedhashset");
	    set.add("awesome");
	    set.add("zzz");
	    set.add("treeset");
	 
	    // Ԫ������ӵ�ʱ����Ѿ���ӵ���compareTo������������
	    for (Object object : set) {
	      System.out.println( object);
	    }
	   
	    // ʹ�ñȽ������ַ������ɳ����̼���TreeSet����
	    System.out.println( "�ַ������Ƚ�������" );
	    Set<String> setComparatorByLength =
	        new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));	//����˳����ת
	    setComparatorByLength.add( "java");
	    setComparatorByLength.add( "linkedhashset");
	    setComparatorByLength.add( "awesome");
	    setComparatorByLength.add( "zzz");
	    setComparatorByLength.add( "treeset");
	 
	    for (String string : setComparatorByLength) {
	      System.out.println( string);
	    }
	   
	    // ʹ����Ȼ�����Զ��������TreeSet����
	    System.out.println( "�Զ����ࣨ��Ȼ���򣩣�" );
	    Set<Person> setObj = new TreeSet<Person>();
	    setObj.add(new Person( "jacob", 25));
	    setObj.add(new Person( "meteor", 23));
	    setObj.add(new Person( "kitty", 22));
	    setObj.add(new Person( "tom", 26));
	    for (Iterator<Person> it = setObj.iterator(); it.hasNext();) {
	      System.out.println( it.next());
	    }
	 
	    // ʹ�ñȽ������Զ��������TreeSet����
	    System.out.println( "�Զ����ࣨ�Ƚ�������" );
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
