package javaproject_3w;

public class CardMain103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csuit1= "H", cvalu1="6";
		String csuit2= "H", cvalu2="3";
		
		//��ü ����. ī�� ���۷���= new ī��(); ���·� ��ü ����
		//���� ī��� Ŭ���� ���� ī��� �� �޸𸮿� ������ ��ü, ī��()�� �ʱ�ȭ�ϴ� ������.
		//new Ű����� �ؽ��ڵ�� ���۷����� ��� �ٸ��� �����.
		Card103 c1= new Card103("H6");
		Card103 c2= new Card103(csuit1+cvalu1);
		Card103 c3= new Card103();
		Card103 c4= new Card103(csuit2+cvalu2);
		
		System.out.printf("%s,%s,%s,%s\n",c1,c2,c3,c4);
		System.out.println(c1.equals(c2)); //�ؽ��ڵ�� �ٸ�. ���� ������.
		System.out.println(c1.getCardVal().equals(c2.getCardVal())); //�� ����
		//���� Ÿ���� equals()�� ��
		
	}

}
