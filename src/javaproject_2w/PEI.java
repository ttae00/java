package javaproject_2w;

public enum PEI{
	//23, 28, 33�� �����ڸ� ���� enum ������ �ʱ�ȭ �Ѵ�. �� ���� �Ұ�
	PHYSICAL(23),EMOTIONAL(28),INTELLECTUAL(33);
	
	private final int peiValue;// PEI�� �ִ� ��� ��� ���� �� enum ������ ���� ������ �� �ִ�

	//enum���� �ʱ�ȭ�ϴ� ������
	PEI(int pie){
		this.peiValue= pie;
	}
	
	//enum ���� ���� ��ȯ�� �Ұ����ϱ� ������ �޼��带 �����ؼ� ����Ѵ�.(����� ���� �޼���)
	public int getPei() {
		return peiValue;
	}
}

//�����ڿ� ����� ���ǰ� ���� enum�� ��
enum FRUIT {
	APPLE, BANANA, MANGO
}
