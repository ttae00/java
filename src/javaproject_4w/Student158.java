package javaproject_4w;

import java.io.Serializable;

/*
 * 다시 해보기 (어려움)
 * 객체 직렬화, 제너릭을 이용하여 객체 저장하기
 * 객체 직렬화, 제너릭을 이용하여 객체 저장하기
 * 힌트: 직렬화는 Serializable을 구현한다. 사용하기 직전에 타입을 결정하기 위해 제너릭을 사용한다.
 * 
 */

public class Student158 implements Cloneable, Serializable{
	
	private static final long serialVersionUID = 12234214234L;
	private String name;
	private int age;
	private String addr;
	
	public Student158(String name, int age, String addr) {
		
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String string) {
		name= string;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		age = i;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String string) {
		addr= string;
	}

	@Override
	public String toString() {
		return name+ " "+age+" " +addr;
	}
	
	//clone
	public Object clone() { //멤버가 기본 타입과 String으로만 구성
		try {
			return super.clone();
		}catch(CloneNotSupportedException e) {
			return this;
		}
	}
	// 여기서부터
	
}
