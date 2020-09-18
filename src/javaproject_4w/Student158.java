package javaproject_4w;

import java.io.Serializable;

/*
 * �ٽ� �غ��� (�����)
 * ��ü ����ȭ, ���ʸ��� �̿��Ͽ� ��ü �����ϱ�
 * ��ü ����ȭ, ���ʸ��� �̿��Ͽ� ��ü �����ϱ�
 * ��Ʈ: ����ȭ�� Serializable�� �����Ѵ�. ����ϱ� ������ Ÿ���� �����ϱ� ���� ���ʸ��� ����Ѵ�.
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
	public Object clone() { //����� �⺻ Ÿ�԰� String���θ� ����
		try {
			return super.clone();
		}catch(CloneNotSupportedException e) {
			return this;
		}
	}
	// ���⼭����
	
}
