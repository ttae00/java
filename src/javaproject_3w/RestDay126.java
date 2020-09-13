package javaproject_3w;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 126�� ����
 * Calendar�� �̿��Ͽ� ����(�����, �Ͽ���) ���ϱ� 
 * Calendar�� �߻� Ŭ������ Calendar.getInstance()�� �̿��� �����Ѵ�.
 *
 */

/*
 * �ٽ� Ǯ���!
 * Calendar�� String ���� ��¥ ��ȯ�ϱ�
 * ��¥ ��ȯ���� ��������
 * ��Ʈ: String�� Date, Date�� Calendar ������ ��ȯ�� ������.
 * 
 */

public class RestDay126 {
	
	public static boolean isRest(Calendar tod) {
		boolean isRest= false;
		if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY ||
				tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
			isRest= true;
		}
		return isRest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal= Calendar.getInstance();
		int lastDay= cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1; i<=lastDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); //1�� ���� ������ ������
			if(isRest(cal)) {
				System.out.println(toYMD1(cal)+"is Rest Day.");
			}
		}

	}
	
	public static Calendar todate(String ss) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Date dd= new Date();
		try {
			dd= sdf.parse(ss);
		}catch(ParseException e) {

		}
		Calendar cal= Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	
	//Calendar�� ���ڿ���
	public static String toYMD1(Calendar dd) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}
	
	public static String toYMD2(Calendar dd) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(dd.getTime());
	}
	
	public static String goGO(String ss, int day) {
		Calendar cal= todate(ss);
		//-7���� ���ϸ� ������ ��
		cal.add(Calendar.DAY_OF_YEAR, day);
		//Ķ������ ���ڿ���
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}

	//���翡 ���� �κ�
	public static String toWantedDay(String rs, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
