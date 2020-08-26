package javaproject_2w;

//static �޼���� ��ü ���� ���ϱ�
public class BioCalendar029 {
	
	public static final int PHYSICAL = 23; // ���(������ ����)

	//static �޼��� ����(Ŭ���� �޼���)
	//static �޼���� �޼��忡 static ���� ���� �޼����, '��ü ���� ����' ȣ�� ����
	//����� ���� static ����, ��ȯŸ���� double, �޼��� �̸��� getBioRhythm
	public static double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days % index)* 2 * Math.PI/index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index= PHYSICAL; // ������� ������ ����
		int days= 1200;
		double phyval= getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�. \n", phyval);
	
	

	}

}
