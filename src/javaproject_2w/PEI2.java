package javaproject_2w;

public enum PEI2{
	//23, 28, 33�� �����ڸ� ���� enum ������ �ʱ�ȭ �Ѵ�. �� ���� �Ұ�
	//�ѱ۷ε� ������ �Ǵ��� Ȯ��
	
	��ü(23),����(28),����(33);
	
	private final int peiValue;// PEI�� �ִ� ��� ��� ���� �� enum ������ ���� ������ �� �ִ�

	//enum���� �ʱ�ȭ�ϴ� ������
	PEI2(int pie){
		this.peiValue= pie;
	}
	
	//enum ���� ���� ��ȯ�� �Ұ����ϱ� ������ �޼��带 �����ؼ� ����Ѵ�.(����� ���� �޼���)
	public int getPei() {
		return peiValue;
	}
}

