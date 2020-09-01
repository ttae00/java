package javaproject_2w;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

/*
 * System���� ���� �ҿ� �ð� ���ϱ�
 * 0���� 100000������ ���� ��� �� �ɸ��� �ð��� ���غ���.
 * ��Ʈ: System.currentTimeMills()�� �̿��Ѵ�. 
 * 
 */
public class SystemTest071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long ltime= System.currentTimeMillis(); //1970.1.1����
		//�Ϸ�� 24*60*60*1000= 86,400,000 �и�����
		System.out.println(ltime);
		
		//long totSum=0;
		//10���� ����� �ݺ��Ѵ�. 
		for(int i=0; i<=100000; i++) {
			//totSum = totSum + i;
			System.out.print("");
		}
		//System.out.println(totSum);
		
		long ltime2= System.currentTimeMillis();
		//���� ��- ���� ��= ���꿡 �ɸ� �ð�
		System.out.println((ltime2-ltime));
		
		//1970.1.1���� ������� �� �� �������� ���Ѵ�.
		System.out.println(ltime2/1000/60/60/24/365+ "��");
		
		//�ý��� ȯ�溯���� ��ȯ�Ѵ�. OS ���� ������ �����Ѵ�. �ڹ� VM ����, ���� �и���("\" or "/") ��.
		//�ý��� ������ (key,value)�� ������ �� �迭 Properties�� ��ȯ�Ѵ�.
		Properties pro=System.getProperties();
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		
		//Date�� ��������� ��� �ð��� �Է��ϸ� ���ÿ� ���� ������ ���� �� �ִ�.
		System.out.println(new Date(System.currentTimeMillis())); //����
		
		//--------------java.util.*����----------------//
		//��� System.property
		//(key,value)�� ������ �� �迭 Properties���� ��� Ű�� ��´�.
		Enumeration<Object> en= pro.keys();
		int i=0;
		//Ű�� �ִٸ� Ű���� ���, Ű ���� ���� value�� ��´�.
		while(en.hasMoreElements()) {
			String keys=(String)en.nextElement();
			System.out.println((++i+" ")+ keys + " : "+ pro.getProperty(keys));
		}
	}
}
