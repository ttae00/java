package javaproject_2w;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;



/*
 * Class를 이용하여 메서드의 생성자 살펴보기
 * Class를 이용하여 클래스에 선언된 메서드와 생성자를 확인해 보자.
 * 힌트: Class에는 모든 생성자와 모든 메서드를 반환하는 메서드가 있다.
 * 
 */

public class UsingClass065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1= new Object();
		
		//클래스에 대한 정보는 java.lang.Class를 이용한다.
		Class classes= obj1.getClass();
		System.out.println(classes.getName()); //클래스 이름
		System.out.println("-----constructor-----");
		
		//클래스의 모든 생성자를 리턴한다. 생성자에 대한 정보는 java.lang.reflect.Constructor를 이용하여 얻는다.
		//모든 생성자를 리턴하므로 배열로 받는다.
		Constructor[] constructor= classes.getDeclaredConstructors();
		//foreach를 이용하여 생성자의 이름을 출력한다.
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
