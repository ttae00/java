package javaproject_2w;

//���, switch case
public class BioSwitch037 {
	
	//���
	/*
	 * public static final int PHYSICAL =23; public static final int EMOTIONAL =28;
	 * public static final int INTELLECTUAL =33;
	 */
	
	//�ѱ۷� ���� �� ������ Ȯ��
	public static final int ��ü =23;
	public static final int ���� =28;
	public static final int ���� =33;
	
	//static �޼��� ����
	public static String textInfor(int index, double value) {
		String result= "";
		switch(index) {
		case ��ü: result= "��ü ����: "; break;
		case ����: result= "���� ����: "; break;
		case ����: result= "���� ����: "; break;
		default:result= "�̰���: "; break;
		
		} 
		//���ڿ�+�⺻ Ÿ���� ���ڿ�. "hello"+1+2 �� hello12, 1+2+"hello"�� 3hello
		return result + (value*100);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index= ��ü; //��ü ����
		double value = 0.86;
		String st= textInfor(index, value); //static �޼��� ȣ�� , new x
		System.out.println(st);
	}

}
