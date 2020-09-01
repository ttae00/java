package javaproject_2w;

import java.lang.reflect.Method;

/*
 * ��!��!��!��!��!
 * ���÷���(Reflection)�� �̿��Ͽ� Ŭ���� ���� ����ϱ� 
 * Class�� �� Ŭ������ ���� ������ ����� ����.
 * ��Ʈ: Class�� ���÷����� �̿��Ѵ�.
 * 
 */
public class UsingReflection068 {
	
	//static �޼���(Ŭ���� �޼���)
	public static String toModi(int n) {
		//modifier�� ������
		String s= "";
		switch(n) {
		case 0: s=" ";break;
		case 1: s="public ";break;
		case 2: s="private ";break;
		case 4: s="protected ";break;
		case 8: s="static ";break;
		case 10: s="private static ";break;
		case 9:  //break�� ���� ������ case ����(fall through ����)
		case 137: s="public static ";break;
		case 17: s="public final ";break;
		case 257: s="public native";break;
		case 260: s="protected native";break;
		case 273: s="public final native";break;
		default: s="xxxx"; break;
		}
		return s;
	}
	
	public static String toRe(String msg) {
		String s="";
		//[ ���� ���°�  �ƴ϶��
		//�ƱԸ�Ʈ�� ���� Ÿ�Կ� "["�� �ִٸ� �迭�̴�.
		if(msg.indexOf("[")!=-1) {
			//"[C"�� �����ϰ� ������
			if(msg.contains("[C")) {
				//���� ��ġ ������ �̾Ƴ��� trim()���� �� �� ������ ���ش�.
				s= msg.substring(msg.indexOf(" ")+1).trim();
				s=s.replace("[C", "char[]");
			}else if(msg.contains("[L")) {
				s= msg.substring(msg.indexOf(" ")+1).trim();
				s= s.replace("[L","").replace(";", "");
				s= s.concat("[]");
			}else if(msg.contains("[B")) {
				s=msg.substring(msg.indexOf(" ")+1).trim();
				s= s.replace("[B","byte[]");
			}
				
		}else if(msg.indexOf(" ")!=-1) {
			s=msg.substring(msg.indexOf(" ")+1).trim();
		}else {
			s= msg.trim();
		}
		 return s;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj= new Object();
		try {
			//Class classes = obj1.getClass();
			Class classes = Class.forName("java.lang.String");
			//ClassNotFoundException
			System.out.println("--------Methodã��-------");
			Method[] method= classes.getDeclaredMethods();
			
			for(Method m:method) {
				if(m.getModifiers()>4000) {continue; }
				System.out.printf("%s\t\t", toModi(m.getModifiers())); //������ ����
				System.out.printf();
			}
		}
	}

}
