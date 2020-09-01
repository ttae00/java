package javaproject_2w;
/*
 * String(���ڿ�)�� �̿��� ���� �̸� ���ϱ�
 * ���ڿ��� �������� �Ǻ��� ����
 * ��Ʈ: String(���ڿ�)�� new�� ������ ���ڿ��� new ���� ������ ���ڿ��� �ִ�.
 * 
 * ���� ���ڿ��� ���� new ������ ������ ���ڿ��� ���� ���۷����� �ٸ����� heap�� �ؽ��ڵ�� �����ϴ�(String�� pool�� �̿��ϱ� ����)
 * ���� ���ڿ��� ���� new ���� ������ ���ڿ��� ���� ���۷����� heap �ؽ��ڵ尡 �����ϴ�.
 * ��) String c1= "����"; String c2="����"
 * sysout(c1==c2) true��
 * 
 */

public class StringMain066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1= "����";
		String c2="ȫ��";
		String cc2="ȫ��";
		String c3= new String("ȫ��");
		
		System.out.println(c1.length());
		
		//== �� ������ ���۷����� ���Ѵ�.
		System.out.println(c1==c2);
		System.out.println("-----");
		System.out.println(c2==cc2);
		System.out.println(c2==c3);
		System.out.println("-----");
		System.out.println(c1.equals(c2));
		//new�� ������ ���ڿ��� ���� ������ ���ڿ� �������� ���Ϸ��� equals()
		//equals()�� �ؽ��ڵ带 ���Ѵ�.
		System.out.println(c2.equals(c3));
		
		//���ϴ� �������� ���ڿ��� �����.
		String c4= String.format("%s-%s", c1,c2);
		System.out.println(c4);
		
		//c1+c2 +�� concat����, c1.concat(c2)�� �����ϴ�. ���ڿ��� �ٿ��� �ϳ��� ���ڿ��� �����.
		String c5= c1+"-"+c2+1+2;
		System.out.println(c5);
		String c6= 1+2+c1+"-"+c2;
		System.out.println(c6);
		}
	

}
