package javaproject_2w;

//case
public class BioSwitch036 {
	//���ǿ� ���� ��ü,����,�������� ���

	public static String textInfor(int index, double value) {
		String result= "";
		switch(index) {
		case 23: result= "��ü ����: "; break;
		case 28: result= "���� ����: "; break;
		case 33: result= "���� ����: "; break;
		
		} 
		//���ڿ�+�⺻ Ÿ���� ���ڿ�. "hello"+1+2 �� hello12, 1+2+"hello"�� 3hello
		return result + (value*100);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index= 23; //��ü ����
		double value = 0.86;
		String st= textInfor(index, value); //static �޼��� ȣ�� , new x
		System.out.println(st);
	}

}
