package javaproject_3w;
/*
 * ���ٿ� ::(Double colon)�� �̿��Ͽ� ī�� �����ϱ�
 * ��Ʈ: �� ���� Ŭ���� ���� ���ٿ� ::�� �̿��Ͽ� ������ ����� 
 * 
 * Card105 ����+ �޼��� �߰�
 */
public class Card109 {
	private String cardVal; //H8

	public String getCardVal() {
		return cardVal;
	}
	
	//�⺻ ������
	public Card109() {
		int deck= (int)(Math.random()*CardUtil104.SUIT.length);//0~1
		int suit=(int)(Math.random()*CardUtil104.VALU.length); //0~9
		
		//������ ī�尪�� ���´�.
		cardVal= CardUtil104.SUIT[deck] + CardUtil104.VALU[suit];
	}
	
	//�׽�Ʈ��
	public Card109(String ss) {
		this.cardVal = ss;
	}
	
	//���� ������
	public Card109(Card109 c) {
		this(c.getCardVal());
		//this.cardVal= c.getCardVal(); //����
			
	}

	@Override
	public String toString() {
		return "["+ cardVal +"]";
	}

	//�ڵ� ���� equals �������̵��� ���������� hashcode �������̵��� �ؾ� ���� ��ü�� ���� �� �ִ�.
	@Override
	public int hashCode() {
		//���������� 2�ڸ� �̻��� �Ҽ�(Prime Number)�� ���Ѵ�.
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
		return result;
	}
	//�ҽ��� �����ϸ� ī�尪�� ī�尪�� �ϴ��Ϸ� ���Ѵ�.
	@Override
	//���� Ÿ���� �⺻������ ���� ī�尪�� ������ ���� ��ü�� �ƴϴ�. ���� ���� ���� ��쿡 ���� ��ü�� ������� equals() �������̵��Ѵ�.
	public boolean equals(Object obj) {
		
		//�θ��� Object�� equals() �޼��尡 equals(Object) ó�� �ƱԸ�Ʈ�� Object�� �޴´�.
		//�׷��Ƿ� �������̵��� equals(Object)�̳�, ī��� ��ȯ�ϱ� ���� (Card)�� ĳ���� �Ͽ� ī�� Ÿ������ ��ȯ�Ѵ�.
		Card109 cb= (Card109)obj;
		//ī�尪�� ���� ī�尪�� ������ true�� ��ȯ�Ͽ� ���� ��ü�� �Ѵ�.
		if(cardVal.equals(cb.getCardVal())) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//�߰��� static �� ���� �޼���
	public static int compareCard(Card109 c1, Card109 c2) {
		return c1.getCardVal().compareTo(c2.getCardVal());
	}
	
	public static int compareRCard(Card109 c1, Card109 c2) {
		return -c1.getCardVal().compareTo(c2.getCardVal());
	}
	
}
