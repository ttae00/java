package javaproject_2w;

//if && ||
public class JCalendar041 {
	
	//��� �޼���� ��ü�� ������ �� ���۷���(Jcal)�� ȣ���ؾ���
	public boolean isLeapYear(int year) {
		boolean isS=false;
	
		//�Էµ� ������ 4�� ��������� 100�� ����� �ƴϸ� 400�� ����̴�.
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			isS=true;
		}
		return isS;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JCalendar041 Jcal= new JCalendar041();
		System.out.println(Jcal.isLeapYear(2017));
	}

}
