package javaproject_2w;

import java.lang.reflect.Method;

/*
 * 매!우!어!려!움!
 * 리플렉션(Reflection)을 이용하여 클래스 정보 출력하기 
 * Class로 한 클래스에 대한 정보를 출력해 보자.
 * 힌트: Class이 리플렉션을 이용한다.
 * 
 */
public class UsingReflection068 {
	
	//static 메서드(클래스 메서드)
	public static String toModi(int n) {
		//modifier는 제한자
		String s= "";
		switch(n) {
		case 0: s=" ";break;
		case 1: s="public ";break;
		case 2: s="private ";break;
		case 4: s="protected ";break;
		case 8: s="static ";break;
		case 10: s="private static ";break;
		case 9:  //break를 만날 때까지 case 실행(fall through 현상)
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
		//[ 값이 없는게  아니라면
		//아규먼트나 리턴 타입에 "["가 있다면 배열이다.
		if(msg.indexOf("[")!=-1) {
			//"[C"를 포함하고 있으면
			if(msg.contains("[C")) {
				//공백 위치 다음만 뽑아내고 trim()으로 앞 뒤 공백을 없앤다.
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
			System.out.println("--------Method찾기-------");
			Method[] method= classes.getDeclaredMethods();
			
			for(Method m:method) {
				if(m.getModifiers()>4000) {continue; }
				System.out.printf("%s\t\t", toModi(m.getModifiers())); //제한자 종류
				System.out.printf();
			}
		}
	}

}
