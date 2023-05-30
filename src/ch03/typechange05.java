package ch03;

public class typechange05 {

	public static void main(String[] args) {
		int num1=10,num2=4;
		double dnum1 =num1/num2;
		double dnum2= (double)num1 /num2;
		/*
		 * 소숫점 유지 하려면
		 * double dnum1=(double)num1/num2 혹은(자료형 맞추기)
		 * double dnum2=(num1*1.0)/num2 중 하나 하면됨(소숫점 곱하기)
		*/
		double dnum3=(1.0*num1)/num2;
		System.out.println("dnum1:"+dnum1);
		System.out.println("dnum2:"+dnum2);
		System.out.println("dnum3:"+dnum3);
	

	}

}
