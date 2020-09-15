package javaproject_3w;
/* 
 * 13���� �ݿ��� ���ϱ�
 * Calendar�� �̿��Ѵ�.
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThirTeenFriday128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Date�� ���ڿ���, ���ڿ��� Date�� ��ȯ�� �� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//������ �������� Calendar��ü�� �����Ѵ�
		Calendar cal = Calendar.getInstance();
		
		int currentyear= cal.get(Calendar.YEAR); //���� ����
		int count=0;
		
		for(int year= 2000; year <=currentyear; year++) { //���� 2000����� �������
			for(int month= 0; month < 12; month++) { //1���� 0, 12����  11
				cal.set(year, month, 13); //������ �� ����
				if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY ) {
					
					System.out.println((++count)+ "\t" + sdf.format(cal.getTime()));
				}
			}
		}
	}

}
