package javaproject_2w;
/*
 * StringBuffer�� ���ڿ� ����,����, �߰��ϱ�
 * String�� ��������� �ٸ� Ư¡�� ���� StringBuffer�� ��������.
 * ��Ʈ: String�� + �Ǵ� concat �������� ���ο� ���ڿ��� ������ ���ο� �ּҸ� ������ StringBuffer�� �ּҴ� �����ϴ�
 */
public class StringBufferMain069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer ����
		StringBuffer sb1= new StringBuffer();
		//�ٲ� ���ڿ��� �ٽ� �������� ������ ���� ���ڿ��� �Ǵ� Ư¡�� immutable
		//1. ��� ���̴� �Լ� mutable(�ٲ� ���ڿ��� �ٽ� �������� �ʾƵ� ���� ���ڿ��� �ٲ�)
		sb1.append("�ȳ��ϼ���")
			.append("�� ������")
			.append("��ε�!");
		System.out.println(sb1);
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//2. replace
		//0��°���� (2-1)�������� ���ڿ� "�ȳ�"�� �����ϰ� �ٲ۴�.
		sb1.replace(0, 2, "�� ���Ⱑ ���ܿ�");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//3. reverse
		sb1.reverse();
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//4. delete
		//10��°���� (15-1)������ ���ڿ��� �����. �ڸ��� 0���� �����Ѵ�.
		sb1.delete(10, 15);
		System.out.println(sb1.toString());
		
		//5. cal by reference, shallow copy
		replaces(sb1);
		System.out.println(sb1.toString());
	}

	public static void replaces(StringBuffer sb) {
		// TODO Auto-generated method stub
		sb.reverse();
		sb.replace(0,3,"GOGO");
		
	}
	

}
