package pat;

/*
 * 
 * 此题掌握BigInteger、long型数据
 * Scanner 可以直接输入大数据
 * 
 */
//Scanner循环输入
//Scanner cin=new Scanner(System.in);// 读入
//while(cin.hasNext())   //等同于!=EOF
//{
//   int n;
//   BigInteger m;
//   n=cin.nextInt(); //读入一个int;
//   m=cin.BigInteger();//读入一个BigInteger;
//System.out.print(m.toString());
//}

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P1001 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		//System.out.println(Long.MAX_VALUE);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++){
			
//			long first = sc.nextLong();
//			long second = sc.nextLong();
//			long third = sc.nextLong();
			//int tt = 10;
			//BigInteger bb = new BigInteger("10");
			BigInteger bf = sc.nextBigInteger();
			BigInteger bs = sc.nextBigInteger();
			BigInteger bt = sc.nextBigInteger();
			if(bf.add(bs).subtract(bt).signum() == 1){
				System.out.println("Case #" + (i + 1) + ": true");
			}else{
				System.out.println("Case #" + (i + 1) + ": false");
			}
			
		}
		//System.out.println(-2147483648 + -2147483648);
	}

}
