package javaproject_2w;

//enum ����� static final�� ��� ���� �ʰ� �빮�ڷ� �����Ѵ�.
//enum�� int�� ��ȯ�ϰų� ������ �� ����.��ȯ�ؼ� ����ϰ� �ʹٸ� ������ ��Ÿ���� ordinal()�̿�.
//�޼��尡 ���� �⺻ enum�� ���꿡 �������� ������, if �� switch�� ���� �б⹮�� ���.
public class FruitMain031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FRUIT pear= FRUIT.APPLE;
		FRUIT pear2= FRUIT.MANGO;
		System.out.println(pear); //APPLE
		System.out.println(pear.name()); //APPLE
		//������ ����(ordinal)��� 0,1,2 ó�� ���� �ڵ����� ���Եȴ�.
		System.out.println(pear.ordinal()); //����� �� ���� 0 //0
		System.out.println(pear2.ordinal()); // ����� �� ���� 2 //2
		
		FRUIT []fruit= FRUIT.values();
		System.out.println(fruit[0]); //APPLE
		
	}

}
