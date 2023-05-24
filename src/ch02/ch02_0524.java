package ch02;

public class ch02_0524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		2진수=>10진수
		// 10101100 = 172
		// 10011010 = 
		// 01101001 =
		// 10010010 =
		
		// 192 = 11000000
		// 224 = 11100000
		// 252 = 11111100
		// 12  = 00001100
		// 15  = 00001111
		
		System.out.printf("10진수 :%d\n",0b0001111); //ob뒤 2진 데이타
		System.out.printf("10진수 :%d\n",173); // 10진수
		System.out.printf("10진수 :%d\n",0255);// 8진수(0:8진수를 의미하는 접두사)
		System.out.printf("10진수 :%d\n",0xAD);// 0x:16진수를 의미하는 접두사
		
		System.out.printf("8진수 :%o\n",173);
		System.out.printf("8진수 :%o\n",0255);
		System.out.printf("8진수 :%o\n",0xAD);
		
		System.out.printf("16진수 :%x\n",173);
		System.out.printf("16진수 :%x\n",0255);
		System.out.printf("16진수 :%x\n",0xAD);
	}

}
