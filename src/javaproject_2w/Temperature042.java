package javaproject_2w;

//�ݺ���
public class Temperature042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<101; i++) {
			
			//������ �Ǽ��� �ٲ� �� 9.0/5 ó�� ���� ������ ���� �Ǽ��� �ٲ���
			double fahrenheit= 9.0/5*i+32; //for ��� ����
			System.out.printf("���� %d��= ȭ�� %.2f��\n",i,fahrenheit);
		}

	}

}
