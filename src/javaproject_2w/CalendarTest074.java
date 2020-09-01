package javaproject_2w;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar�� ��ƿ� �� ���ϱ�
 * �޷¿� ���õ� Ŭ������ ������ ���� ����.
 * ��Ʈ: System.currentTimeMills(), Date, Calendar�� ������ ������. 
 * Date�� long�� String ���� �޼��常 �־ ����� �� �ִ� �޼��尡 ����.
 * Calendar�� �߻� Ŭ�����̱� ������ new �� ���� ���ϰ� getInstance() static �޼���� �����ؼ� ����Ѵ�.
 * 1��~12�� ��� 0��~11��, �Ͽ����� 1, ������� 7�� ���ȴ�.
 */
public class CalendarTest074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mills= System.currentTimeMillis();
		System.out.println(mills/1000/24/60/60); //��ĥ ���
		
		Date d= new Date();
		System.out.println(d);
		Date dd= new Date(d.getTime()+24*60*60*1000); //�Ϸ� ��
		System.out.println(dd);
		
		Calendar cal1970= Calendar.getInstance();
		//1970.1.1�� ������ �����Ѵ�. ���� 0~11���� �Ǿ� �����Ƿ� 1���� 1-1=0�� �Է��Ѵ�.
		cal1970.set(1970,1-1,1); //0��~11��, 1970.1.1
		
		Calendar today= Calendar.getInstance(); //����
		printCalendar(today);
		long minus= today.getTimeInMillis()- cal1970.getTimeInMillis();
		System.out.println(minus); //1970.1.1~ ���� msec
		System.out.println(minus/1000/24/60/60); //1970����� ��ĥ �����°�?
		
		
	}
	//Ķ���� ����
	public static void printCalendar(Calendar c) {
		System.out.println("----------------");
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //��ĥ
		System.out.println(c.get(Calendar.AM_PM)); //1 PM, 0 AM
	}

}
