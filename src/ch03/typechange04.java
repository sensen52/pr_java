package ch03;

public class typechange04 {

	public static void main(String[] args) {
		
		/*
		정수 연산식(int보다 작은 변수자료형(shor, char,byte)
	    int로 자동형변환
		*/
		
		byte x=10;
		byte y=20;
		byte result1 =(byte)(x+y);//컴파일 에러 x,y는 각각 in형 자료료 담아서 처리가
		                            // 왼쪽 byte형으로 저장시 작은 공간에 큰 자료형 타입 넣으려는 문자
		// 덧셈 연산자로 값이 되면서 int가 됨 그래서 안되는것
		//int result1 =x+y; 
		System.out.println(result1);

		
		//---------------------------------------------------
		
		/*
		 * 정수 연산식(int보다 큰 변수 자료형(long))큰 타입으로 자동 형 변환
		*/
		
		byte var1=10;
		int var2=100;
		long var3 =1000L;
		//int result =(int)var1+(int)var2+(int)var3; 
		//젤 큰 자료형으로 모두 자동 형변환이 됨
	
		long result2 = var1+var2+var3;
		System.out.println(result2);
		
		//---------------------------------
		
		/*
		 * 실수 연산식
		 * 큰 타입으로 자동 형 변환
		 * */
		
		int intvar =10;
		float flvar =3.3F;
		double dbvar =5.5;
		double result3 =intvar +flvar +dbvar;
		System.out.println(result3);
	}

}
