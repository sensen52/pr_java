package ch03;

public class typechange2 {

	public static void main(String[] args) {
	

		
		/*
		 * 강제 형변환
		 * 좁은 번위공간에 큰 값을 넣으려고 하는 경우
		 * 기본적으로 불가능하기 떄문에 강제로 자료형을 바꾸어 전달한다
		 * 데이터 솔실의 염려가 있다
		 * */
		int intValue =44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue =500;
		intValue = (int)longValue;
		System.out.println(intValue);
	 //데이터 손실
		double doubleValue =3.14;
		intValue =(int)doubleValue;
		System.out.println(intValue);
	}

}
