package pat;

import java.util.Scanner;

/**
 * String -> int(Integer.parse(String))
 * @author home
 *	print("")Ҳ��ռλ��
 *	���Լ����
 */

public class P1024 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		String[] firstF = first.split("/");
		String[] secondF = second.split("/");
		//System.out.println(firstF[1]);
		int firInt = Integer.parseInt(firstF[0]);
		int fir_fenInt = Integer.parseInt(firstF[1]);
		
		int secInt = Integer.parseInt(secondF[0]);
		int sec_fenInt = Integer.parseInt(secondF[1]);
		
		//��һ�����ֵ������ʽ
		
		int maxTemp = maxNum(firInt,fir_fenInt);
		
		int jia = firInt / fir_fenInt;
		int fen = (firInt % fir_fenInt) / maxTemp;
		int mu = fir_fenInt / maxTemp;
		//�ڶ������ֵ������ʽ
		
		maxTemp = maxNum(secInt,sec_fenInt);
		int jia2 = secInt / sec_fenInt;
		int fen2 = (secInt % sec_fenInt) / maxTemp;
		int mu2 = sec_fenInt / maxTemp;
		
		String s_jia = "",s_jia2 = "",s_res = "";
		if(jia != 0){
			s_jia = String.valueOf(jia);
		}
		if(jia2 != 0){
			s_jia2 = String.valueOf(jia2);
		}
		
		//�ӷ�
		//1.ͨ��
		maxTemp = maxNum(fir_fenInt,sec_fenInt);
		//ͨ�ַ�ĸ
		int fenMu = fir_fenInt * sec_fenInt / maxTemp;
		//ͨ�ַ��Ӻ�
		int zi_he = firInt * sec_fenInt / maxTemp + secInt * fir_fenInt / maxTemp;
		//2.����
		maxTemp = maxNum(zi_he,fenMu);
		//�������
		int sumZi = (zi_he % fenMu) / maxTemp;
		//�����ĸ
		int sumMu = fenMu / maxTemp;
		//3.���
		if(zi_he / fenMu == 0){
			//s_res = String.valueOf(zi_he / fenMu);
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ " " + sumZi + "/" + sumMu);
		}else{
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ zi_he / fenMu + " " + sumZi + "/" + sumMu);
		}
		
			
		
		//����
		maxTemp = maxNum(fir_fenInt,sec_fenInt);
		//ͨ�ַ�ĸ
		fenMu = fir_fenInt * sec_fenInt / maxTemp;
		//ͨ�ַ��Ӻ�
		zi_he = firInt * sec_fenInt / maxTemp - secInt * fir_fenInt / maxTemp;
		//2.����
		maxTemp = maxNum(zi_he,fenMu);
		//�������
		sumZi = (zi_he % fenMu) / maxTemp;
		//�����ĸ
		sumMu = fenMu / maxTemp;
		//3.���
		if(zi_he / fenMu == 0){
			//s_res = String.valueOf(zi_he / fenMu);
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ " " + sumZi + "/" + sumMu);
		}else{
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ zi_he / fenMu + " " + sumZi + "/" + sumMu);
		}
		
		//�˷�
		zi_he = firInt * secInt;
		fenMu = fir_fenInt * sec_fenInt;
		//2.����
		maxTemp = maxNum(zi_he,fenMu);
		//�������
		sumZi = (zi_he % fenMu) / maxTemp;
		//�����ĸ
		sumMu = fenMu / maxTemp;
		//3.���
		if(zi_he / fenMu == 0){
			//s_res = String.valueOf(zi_he / fenMu);
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ " " + sumZi + "/" + sumMu);
		}else{
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ zi_he / fenMu + " " + sumZi + "/" + sumMu);
		}
		
		//����
		zi_he = firInt * sec_fenInt;
		fenMu = fir_fenInt * secInt;
		//2.����
		maxTemp = maxNum(zi_he,fenMu);
		//�������
		sumZi = (zi_he % fenMu) / maxTemp;
		//�����ĸ
		sumMu = fenMu / maxTemp;
		//3.���
		if(zi_he / fenMu == 0){
			//s_res = String.valueOf(zi_he / fenMu);
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ " " + sumZi + "/" + sumMu);
		}else{
			System.out.println(s_jia + " " + fen + " / " + mu + " + " 
					+ s_jia2 + " " + fen2 + "/" + mu2 + " = " 
					+ zi_he / fenMu + " " + sumZi + "/" + sumMu);
		}
		
		
	}
	
	public static int maxNum(int fir,int sec){
		if(fir < sec){
			int temp = fir ;
			fir = sec;
			sec = temp;
		}
		if(sec == 0){
			return sec;
		}
		while((fir % sec) != 0){
			int k = fir;
			fir = sec;
			sec = k % fir;
		}
		return sec;
	}

}