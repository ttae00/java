package javaproject_1w;

public class BioCalendar027 {
	public static final int PHYSICAL = 23;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=PHYSICAL;                  // ������� ������ ����
		int days=1200;   
		// Math.PI 3.14���� ���ǵǾ� �ִ� ���
		double vals=(days % index) * 2 * Math.PI / index ;
		System.out.println( Math.toDegrees(vals) +"��");
		//2*PI*r ������ ������ ȯ��
		//toDegrees() : ������ȯ
	}

}
