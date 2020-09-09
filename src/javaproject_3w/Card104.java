package javaproject_3w;

public class Card104 {
	private String cardVal; 
	
	public String getCardVal() {
		return cardVal;
	}

	//�⺻(����Ʈ) ������
	public Card104() {
		//0~1 ����
		int suit=(int)(Math.random()*CardUtil104.SUIT.length);
		
		//0~9 ����?
		int valu= (int)(Math.random()*CardUtil104.VALU.length);
		
		//������ ī�尪�� ���´�.
		cardVal = CardUtil104.SUIT[suit]+ CardUtil104.VALU[valu];
		
	}
	
	//�׽�Ʈ��
	public Card104(String s) {
		this.cardVal = s; //���ڿ��� ����
	}
	//���� ������
	/*ī������ڿ� �ƱԸ�Ʈ�� ī�� ��ü�� �޴� ���� ���� �����ڶ�� �Ѵ�. �Է¹��� �ٸ� ī���� ���� �޾� ī�尪�� �ʱ�ȭ�Ѵ�. 
	 ���� ������ �ٸ� ��ü�� ���� �� ����Ѵ�.*/
	public Card104(Card104 c) {
		this(c.getCardVal()); //���ڿ��� �� ����
		//this.cardVal= c.getCardVal(); //����
	}
	
	//����ʵ��� ���� �������� �ʰ� ���캼 �� �ִ� toString() �޼��带 �������̵��Ѵ�.
	@Override
	public String toString() {
		return "["+ cardVal + "]";
	}

}
