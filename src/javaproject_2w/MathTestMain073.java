package javaproject_2w;
/*
 * ���� ���� �޼��� ����ϱ� 
 * ���� ����ϴ� ���� �޼��带 ����� ����.
 * ��Ʈ: Math Ŭ������ ���п� ���õ� �޼��带 �����Ѵ�.
 * 
 */
public class MathTestMain073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constant(���)
		System.out.println("Math.E : "+ Math.E);
		System.out.println("Math.PI : "+ Math.PI);
		
		//Method
		System.out.println("Math.abs(-5) ���밪: "+Math.abs(-5));
		System.out.println("Math.ceil(4.34) �ø�: "+Math.ceil(4.34));
		//round�� ���� Ÿ���� int, rint�� ���� Ÿ���� double
		System.out.println("Math.round(4.34) �ݿø�: "+Math.round(4.34));
		System.out.println("Math.floor(4.34) ����: "+(int)Math.floor(4.34));
		System.out.println("Math.rint(4.34) �ݿø�: "+ Math.rint(4.34));
		System.out.println("Math.max(45,78) : "+ Math.max(45,78));
		System.out.println("Math.min(45,78) : "+ Math.min(45,78));
		System.out.println("Math.pow(2,4) : "+ Math.pow(2,4));
		System.out.println("Math.log(30) : " +Math.log(30));
		System.out.println("Math.exp(3) : " +Math.exp(30));
		System.out.println("Math.sqrt(10) : " +Math.sqrt(10));
		
		//random
		double r= Math.random(); // 0<=r <1 �Ǽ�
		System.out.println("Math.random(): "+r);
		
		
		
	}

}
