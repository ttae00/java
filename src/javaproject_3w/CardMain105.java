package javaproject_3w;

public class CardMain105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card105 c1 = new Card105("H4"); //������(String �ƱԸ�Ʈ)
		Card105 c2 = new Card105("H4");
		
		System.out.println(c1.hashCode()); //
		System.out.println(c2.hashCode()); //
		System.out.println(c1.getCardVal());//���� ����
		System.out.println(c2.getCardVal());
		//���� new�� ������ ��ü�� �ؽ��ڵ尡 ���� �� ������, �������̵� �߱� ������ ������ ������ equals()�� true
		System.out.println(c1.equals(c2)); //hashcode��- �������̵�
		
		//���� ���� ���� �� ���� ��ü�� �����ϰ� �ʹٸ�, hashCode(),equals()�� �������̵�����!
		
		}

}
