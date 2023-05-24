package ch02;

public class ch02_자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------");
		byte n5 =-128;
		byte n6 =-30;
		byte n7 =30;
		byte n8 =127;
		byte n9 =(byte)-129;//문제 발생 왜? 자료형에 맞지 않다 byte가 표현할 수 있는 범위를 넘어섬 ,강제 형변환
		System.out.printf("%d\n",n9);
		System.out.println(0b10101101);//음수가 왜 아니야?
		System.out.println(Integer.toBinaryString(-192));
		
		/*
		int n1=0b10101101;
		int n2 = 173;
		int n3 =0255;
		int n4 =0xad;
		System.out.printf("%d %d %d %d \n",n1,n2,n3,n4);
		
		//--------------------------------------------------
		
		/*정수 short -2byte 정수 부호 0 |char 2byte 정수부호x(양수만)
		
		char n1 = 65535;//(0-2^16-1)
		short n2 = 32767; //(-2^15 ~12^15-1)(-32868~+32767)
		char n3 =60000;
		short n4 = n3; //short는 양수만 담는 범위라서
		System.out.printf("%d\n",n4);
		
	
		//------------------------------------
		정수 long 8byte 정수부호0
		long n1=10;
		long n2=20;//t,l(리터럴 접미사): long자료형사용하여 값저장
		long n3 = 100000000000L;//상수풀에서 부터 아웃!, 리터럴 접미사를 붙여주면(long)자동형변환 
		long n4 = 100000000000L;
			*/
		/*
		//-------------------------------------------
		// 실수
		// 유리수와 무리수의 통칭
		// 소숫점 이하값을 가지는 수 123.456
		// float:4바이트 실수(6-9자리까지 유효범위)
		// double:8바이트 실수(15-18자리까지 유효범위),기본 자료형
		
		// 정밀도 확인
		float n1= 0.123456789123456789F;//F:float 자료형으로 하겠다 
		double n2 =0.123456789123456789;
		System.out.println(n1);
		System.out.println(n2);
		*/
		
		
		//--------------------
				//단일문자 char 2byte 정수
				//--------------------
//				char ch1 = 'a';
//				System.out.println(ch1);
//				System.out.println((int)ch1); // 011000001
		//	
//				
//				char ch2 = 98;
//				System.out.println(ch2);
//				System.out.println((int)ch2); // 011000010
//				
//				char ch3 = 'b'+1;
//				System.out.println(ch3);
//				System.out.println((int)ch3); // 011000011
//				
//				byte ch4 = 'c'+2;
//				System.out.println((char)ch4);
//				System.out.println(ch4); // 011000011

//				char ch5  = 0xac00;
//				char ch6 = 44032;
//				
//				System.out.println(ch5);
//				System.out.println(ch6);
//				System.out.println((char)(0b1010110000000000+1));

//				char ch6 = 0xac00+1;
//				System.out.printf("%c %c\n", ch5,ch6);
//				
//				// \\u :유니코드값 이스케이프문자
//				System.out.printf("%c\n", '\uACa1');

//				System.out.printf("TEST : %c\n", '\uabcd');


//				char n = 10;
//				System.out.printf("HELLO %c WORLD", n);


				//--------------------
				//문자열 : String (클래스자료형)
				//--------------------

				//기본자료형(원시타입)
//				byte n1;
//				short n2;
//				double n3;
//				long n4;

				//클래스자료형
				//클래스자료형으로 만든변수는 '참조변수'라고 하고
				//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//				int n1 = 10;
//				byte n2 = 20;
//				char n3 = 40;
//				
//				String name = "홍길동";
//				String job = "프로그래머";
//				System.out.println(name);
//				System.out.println(job);

				//--------------------
				//boolean : 논리형(true/false 저장)
				//--------------------

//				boolean flag = (10>11); 	// 참(긍정)
//				if(flag) 
//				{
//					System.out.println("참인경우 실행");
//				}
//				else 
//				{
//					System.out.println("거짓인경우 실행");
//				}





			}	
		}