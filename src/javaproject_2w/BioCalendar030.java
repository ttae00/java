package javaproject_2w;

//��� �޼��带 �̿��Ͽ� ��ü ���� ���ϱ�
//non static �޼���(���), new ���� �̿��Ͽ� ��ü�� �����ؾ� �Ѵ�.
public class BioCalendar030 {
	
	public static final int PHYSICAL = 23; // ���(������ ����)

	//��� �޼���(non static) ����
	public double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days % index)* 2 * Math.PI/index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index= PHYSICAL; // ������� ������ ����
		int days= 1200;
		BioCalendar030 bio= new BioCalendar030(); // getBio- ��� �޼����� ��ü�� ������
		
		//��� �޼��� ȣ��
		double phyval= bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�. \n", phyval);

	}

}
