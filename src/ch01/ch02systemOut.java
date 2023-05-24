package ch01;

public class ch02systemOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello \n");
		System.out.print("hello \n");
		System.out.print("hello");
//		f=>format,서식이라는 뜻, 그에 따른 자료형이 존재함
//		%d=>10진수 함수 서식문자
//		%f=> 10진수 실수 서식문자
//		%c=>한문자 서식문자
//		%s=>문자열 서식문자
		System.out.printf("%d %d %d \n",10,20,30);
		System.out.printf("%f %f %f \n",10.1,20.1,30.1);
		System.out.printf("%c %c %c \n",'A','B','C');
		System.out.printf("%s %s %s \n","this is","string","test");
		System.out.printf("%s %s %s \n","this is","string","test");
		System.out.printf("%d.%s : %d\n",1,"국어",100);
		System.out.println("I say"hello"");
	}

}
