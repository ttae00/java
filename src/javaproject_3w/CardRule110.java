package javaproject_3w;
/*
 * �ٽ� �غ���
 * ī�� ����(����) ���� ����� 
 * ī�� ������ ���� ����(����)�� ����� ����.
 * ��Ʈ: �� ī���� ���� ������ �� ī�忡 100�� ���ϰ� ī�尪�� �ٸ��� �� ī�尪�� �տ� ���� ���� �ڸ��� 10�� ���Ѵ�.
 * 
 */
public class CardRule110 {
	
	public int toV(Card109 c) {
		int count= 0;
		switch(c.getCardVal().charAt(1)) {
		case 'A': count=1;break;
		case 'T': count=10;break;
		default: count=c.getCardVal().charAt(1)-'0'; break;// '7'-'0'
		}
		return count;
	}
	
	//�� SUIT C
	public boolean isLight(Card109 c) { //�� ��� SUIT�� C
		boolean isL= false;
		if(c.getCardVal().charAt(0)=='C') {
			isL = true;
		}
		return isL;
	}
	
	//��(C)�̸鼭 ����� 1,3,8 -> C1, C3, C8
	private boolean is138(Card109 c) {
		boolean isC= false;
		if(isLight(c)) {
			if(c.getCardVal().charAt(1)=='1'||
			c.getCardVal().charAt(1)=='3'||
			c.getCardVal().charAt(1)=='8'){
				isC= true;
			}	
		}
		return isC; 
	}
	//������ �������� �̿�: ���ؼ� 11, ���ؼ� 24-> 3,8
	public int rule(Card109 c1, Card109 c2) {
		int count= 0;
		if(is138(c1) && is138(c2)) {
			// �� ó�� 1,3,8
			if((toV(c1)*toV))
		}
	}
} 

