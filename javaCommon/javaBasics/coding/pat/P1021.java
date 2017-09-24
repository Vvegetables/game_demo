package pat;

/**
 * ��Ҫ�˽��������ʽ----���Ǵ�ͷ
 * ����nextInt ֮��һ��Ҫ��һ��nextLine����
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		String[] valid = new String[count];
		int validCount = 0;
		int[] encpty = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		char[] check = {'1','0','X','9','8','7','6','5','4','3','2'};
		String identity;
		for(int i = 0; i < count; i++){
			identity = sc.nextLine();
			if(isNumeric(identity)){
				valid[validCount++] = identity;
				//System.out.println("1:"+identity);
			}else{
				System.out.println(identity);
			}
		}
		//String[] result = new String[validCount];
		int resultCount = 0;
		for(int i = 0; i < validCount; i++){
			char check2 = valid[i].charAt(17);
			int sum = 0;
			for(int j = 0; j < 17; j++){
				sum += (valid[i].charAt(j) - '0') * encpty[j]; 
			}
			if(check2 != check[sum % 11]){
				System.out.println(valid[i]);
			}else{
				++resultCount;
			}
		}
		if(resultCount == count){
			System.out.println("All passed");
		}
		

	}
	public static boolean isNumeric(String str){ 
		Pattern pattern = Pattern.compile("^[0-9]{17}(\\d|X)?"); 
		Matcher isNum = pattern.matcher(str);
		if( !isNum.matches() ){
		   return false; 
		} 
		return true; 
	}

}