package javaproject_2w;
/*
 * Object �����ϰ� ����ϱ�
 * Object�� Ư¡�� �޼��带 �����ϰ� ����� ����.
 * ��Ʈ: Object�� �ڹ��� �ֻ��� Ŭ������ �߿� �޼��� �� ������ �����Ѵ�. 
 * 
 */
public class UsingObject064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1= new Object();
		Object obj2= new Object();
		
		System.out.println("1 "+obj1.hashCode()); //native 10����
		System.out.println("2 "+Integer.toHexString(obj1.hashCode())); //16����
		
		//== �񱳴� ���� ������ ���۷����� ���Ѵ�. new Ű����� �����ϴ� ���� Ÿ���� ���۷����� ��ü ���� �����ϹǷ� �׻� false
		System.out.println("3 "+obj1==obj2); //��ü�� ������ ���� ������.
		
		//equal �񱳴� 1�� �ּ�(�ؽ��ڵ�)�� ���Ѵ�. �ؽ��ڵ忡 ���� �������̵��� equals �������̵��� �̿��ϸ� equals�� ���� �� �ִ�.
		System.out.println("4 "+obj1.equals(obj2)); //��ü�� �����ϴ�.
		
		//���� Ÿ���� ���۷���(obj1)�� ����ϸ� �ڵ����� ���۷���.toString() �޼��尡 �ȴ�.
		System.out.println("5 "+obj1);
		
		
		System.out.println("6 "+obj2.toString()); //Class@hashCode() = Ÿ��@16���� �ؽ��ڵ�
		
		System.out.println("7 "+obj1.getClass().getName()); //Ŭ���� �̸�
		String str= obj1.getClass().getName() + "@"
				+Integer.toHexString(obj1.hashCode()); //16 ����
		System.out.println("8 "+str); //Ŭ���� �̸�@16���� �ؽ��ڵ�
 		
		//Object Ÿ������ String ��ü�� �����Ѵ�. "�θ� �̸����� �ڽ��� ������ �� �ִ�"�� ���۷����� �������� �����ش�.
		//Object�� ��� ���� Ÿ���� �θ��, ��ü�� ������ �� �׻� ���� �����ȴ�.
		Object objstr= new String("Good"); //������
		System.out.println("9 "+objstr.toString());
		
		//instanceof�� ������ ��ü Ÿ��(�ν��Ͻ�)�� Ȯ���Ѵ�.
		System.out.println("10 "+objstr instanceof Object);
		System.out.println("11 "+objstr instanceof String);
		
		String hello="hello";
		System.out.println("12 "+hello.getClass()); //Ŭ���� �̸�
		
	}

}
