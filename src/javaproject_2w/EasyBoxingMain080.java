package javaproject_2w;

import java.util.ArrayList;

/*
 * �ڽ�, ��ڽ����� �⺻ Ÿ���� ���� Ÿ������ ��ȯ�ϱ�
 * ��Ʈ: �⺻ Ÿ�԰� ���� Ŭ������ �ڵ����� ���� ��ȯ�ȴ�. 
 * 
 */
public class EasyBoxingMain080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNm1= 123;
		long longNum1=345L;
		double doubleNum=123.123;
		Integer intWrap1= intNm1; // new Integer(intNm1);
		Long longWrap1= longNum1;
		Double doubleWrap1=doubleNum;
		
		//���� Ŭ������ �⺻ Ÿ������ ����(�ڽ��Ѵ�)
		double dd= doubleWrap1;
		
		//�⺻ Ÿ��<->Wrapper�� ĳ���� ���� ��� ����
		Integer intWrap2=intNm1; // Boxing
		
		//���� Ŭ������ �⺻ Ÿ���� ���� ����(��ڽ�)�Ѵ�.
		intNm1= intWrap2; //Unboxing
		System.out.println(intNm1);
		
		
		//List<>�� ���ʸ��� "���� Ÿ�Ը� ����� �� �ִ�"�� ���� ������ List<Integer>�� ����Ѵ�.
		ArrayList<Integer> illists= new ArrayList<>();
		//3�� �����ϴ� �Ͱ� ����.
		illists.add(new Integer(3));
		illists.add(5);
		
		//0�� ���� ��ȯ�Ѵ�. illist.get(0)�� 3, .get(1)�� 5�� ��ȯ�Ѵ�.
		int a= illists.get(0); //<Integer>
		System.out.println(a);
		
		//���� Ÿ�� ���ڿ� "123"�� 123���� ��ȯ�Ѵ�.
		int b= Integer.parseInt("123");
		System.out.println(b);
		System.out.println(illists);
		

	}

}
