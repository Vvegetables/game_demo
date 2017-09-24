package pat;

/**
 * date.getTime()
 * ��ʱ���������ʱ����Ҫʹ��long�����ݣ�int�ǲ��е�
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class P1018 {

	public static void main(String[] args) throws ParseException {
		
		class People implements Comparable<People>{
			String name;
			int days;
			public People(String name, int days) {
				super();
				this.name = name;
				this.days = days;
			}
			@Override
			public int compareTo(People other) {
				if(this.days > other.days)
					return 1;
				else if(this.days < other.days)
					return -1;
				else
					return 0;
			}
		}
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int valid = 0;
		List<People> result = new ArrayList<People>();
		for(int i = 0; i < count; i++){
			String name = sc.next();
			String date = sc.next();
			valid = (int)getMonthSpace(date);
			if(valid != 0){
				result.add(new People(name,valid));
			}
		}
		int size = result.size();
		Collections.sort(result);
		System.out.println(size + " " + result.get(size - 1).name + " " + result.get(0).name);
		

	}
	
	public static long getMonthSpace(String date2) 
			throws ParseException{
		
		String date1 = "2014/09/06";
		String min = "1814/09/06";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Date c1 = sdf.parse(date1);
		Date c2 = sdf.parse(date2);
		Date c3 = sdf.parse(min);
//		System.out.println(c1.getTime());
//		System.out.println(c2.getTime());
//		System.out.println(c3.getTime());
		long max = (c1.getTime() - c3.getTime()) / (1000*3600*24);
		long days = (c1.getTime() - c2.getTime()) / (1000*3600*24);
		//System.out.println("days:" + days + "max:"+max);
		return days <= 0 || days > max? 0: days;
	}

}