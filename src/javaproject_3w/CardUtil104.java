package javaproject_3w;
/*
 * static ���� ������
 * ��Ʈ: static �޼��带 �̿��Ͽ� ī�尪�� ����� static �迭�� ũ�⸦ Ȯ���Ѵ�. 
 * static ����, �޼���- ��ü ���� ���� ��� �����ϴ�. 
 */
public class CardUtil104 {
	public static final int SUTDA= 2;
	
	//SUIT�� ũ�� SUIT.length�� 2�̴�
	public static final String[] SUIT= {"H","C"};
	//VALU�� ũ�� VALU.length�� 10�̴�
	public static final String[] VALU= {"A","2","3","4","5","6","7","8","9","T"};
	
	public static int toVal(Card103 c) {
		//ī�尪�� 1��° ���� ���������� ��ȯ�Ѵ�. "H6"�� �� '6'�� 6���� ��ȯ�Ͽ� �������� ��´�.
		return toVal(c.getCardVal().charAt(1));
	}
	
	public static int toVal(Card103 c, int index) {
		//ī�尪�� index���� ��´�. "H6"�� �� index�� 0�̸� 'H'��, index�� 1�̸� '6'�̰� ���������� ��ȯ
		return toVal(c.getCardVal().charAt(index));
	}
	
	//�Է¹���  ������� char Ÿ���̴�.
	public static int toVal(char cc) {
		int tot= 0;
		switch(cc) {
		case'A': tot=1; break;
		case'T': tot=10; break;
		case'J': tot=11; break;
		case'Q': tot=12; break;
		case'K': tot=13; break;
		default: tot=cc-'0'; break;
		}
		return tot;
	}

}
