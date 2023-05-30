package ch03;

public class typechange06 {

	public static void main(String[] args) {
		/* short vs char
		char와 short는 같은 size(2byte)를 가지나
		short는 양,음수를 지원/char은 양수만 지원
		short char간의 데이터 교환시 동일 한 값을 저장하더라도
		표현하는 범위가 다르기 대문에 각각 다른값이 나올 수도 있다.
		*/
		char n1 =60000;
		short n2 = (short)n1;
		System.out.println(n2);
		//음수
		
		//양수
		int n3 =(char)n2;
		System.out.println(n3);
		

	}

}
