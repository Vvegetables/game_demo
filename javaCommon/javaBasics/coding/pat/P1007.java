package pat;

import java.math.BigInteger;
import java.util.Scanner;

public class P1007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger bg = sc.nextBigInteger();
		BigInteger sub = sc.nextBigInteger();
		BigInteger[] result = bg.divideAndRemainder(sub); 
		System.out.println(result[0] + " " + result[1]);

	}

}
