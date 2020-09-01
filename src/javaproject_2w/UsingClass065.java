package javaproject_2w;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;



/*
 * Class�� �̿��Ͽ� �޼����� ������ ���캸��
 * Class�� �̿��Ͽ� Ŭ������ ����� �޼���� �����ڸ� Ȯ���� ����.
 * ��Ʈ: Class���� ��� �����ڿ� ��� �޼��带 ��ȯ�ϴ� �޼��尡 �ִ�.
 * 
 */

public class UsingClass065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1= new Object();
		
		//Ŭ������ ���� ������ java.lang.Class�� �̿��Ѵ�.
		Class classes= obj1.getClass();
		System.out.println(classes.getName()); //Ŭ���� �̸�
		System.out.println("-----constructor-----");
		
		//Ŭ������ ��� �����ڸ� �����Ѵ�. �����ڿ� ���� ������ java.lang.reflect.Constructor�� �̿��Ͽ� ��´�.
		//��� �����ڸ� �����ϹǷ� �迭�� �޴´�.
		Constructor[] constructor= classes.getDeclaredConstructors();
		//foreach�� �̿��Ͽ� �������� �̸��� ����Ѵ�.
		for(Constructor con: constructor) {
			System.out.println(con.getName());
		}
		System.out.println("------Method------");
		Method[] method= classes.getMethods();
		for(Method m: method) {
			System.out.println(m.getName());
		}
	}

}
