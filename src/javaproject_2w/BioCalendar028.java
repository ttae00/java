package javaproject_2w;

public class BioCalendar028 {
	
	public static final int PHYSICAL = 23;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index= PHYSICAL; // ������� ������ ����
		int days= 1200;
		double phyval= 100* Math.sin((days % index) * 2 * Math.PI/index);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�. \n", phyval);
		System.out.printf("���� ��ü ���� %.2f�Դϴ�. \n", phyval);
		// $1�� ù ��° ����  phyval�� 1$ ��ġ�� �����϶�� �ǹ�. %f�� �Ǽ�, %.2f�� �Ҽ���(.) �� �ڸ� ������ ǥ��

	}

}
