package javaproject_4w;

public class CakeEatings157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CakePlate157 cake = new CakePlate157(); //������ �غ�
		CakeEater157 eater= new CakeEater157(cake); //������ ����
		CakeMaker157 baker= new CakeMaker157(cake); //������ ����
		
		//�켱������ ������ �� ���� ȣ���� ���ɼ� -> �� ���� ���� ���ɼ��� ����
		//baker.setPriority(6);
		baker.start();
		eater.start();
		
		
	}

}
