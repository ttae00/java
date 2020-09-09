package javaproject_3w;
/*
 * equals overriding�� �̿��Ͽ� ī�尪�� ������ ���� ��ü�� �����
 * ��Ʈ: ī�尪�� ������ ���� ��ü�� ����� ���� equals(), hashCode() �������̵��� �Ѵ�. 
 * 
 */
public class Card105 {
	private String cardVal; //H8

	public String getCardVal() {
		return cardVal;
	}
	
	//�⺻ ������
	public Card105() {
		int deck= (int)(Math.random()*CardUtil104.SUIT.length);//0~1
		int suit=(int)(Math.random()*CardUtil104.VALU.length); //0~9
		
		//������ ī�尪�� ���´�.
		cardVal= CardUtil104.SUIT[deck] + CardUtil104.VALU[suit];
	}
	
	//�׽�Ʈ��
	public Card105(String ss) {
		this.cardVal = ss;
	}
	
	//���� ������
	public Card105(Card105 c) {
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
		Card105 cb= (Card105)obj;
		//ī�尪�� ���� ī�尪�� ������ true�� ��ȯ�Ͽ� ���� ��ü�� �Ѵ�.
		if(cardVal.equals(cb.getCardVal())) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
