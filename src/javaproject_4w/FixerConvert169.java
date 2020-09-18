package javaproject_4w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 * 
 * �� ��ũ������ �̿��Ͽ� ȯ�� ���ϱ�
 * ��Ʈ: URL�� BufferedReader�� �̿��Ͽ� �� �����͸� ��ũ�����Ѵ�.
 *
 */


/* 1. URL�� �̿��Ͽ� �ּҸ� ã�´�
 * 2. �� �����͸� �����ϴ� �ּ����� ���(openStream(), ���� �ȱ�)�� �غ��Ѵ� 
 * 3. ��带 ����(BufferedReader, ȣ�� ����)�� �ְ� ���͸� �����Ѵ�
 * 4. ���Ϳ��� �� �پ� �д´�. �� �پ� ���� ���ڿ��� �ٿ��� ���� ���� ���ڿ��� �����.
 * 5. ���� ���� ���ڿ��� JSON���� ��ȯ�ϰ�, JSON���� �����͸� �о� DTO(FixerRate)�� �����Ѵ�.
 */
public class FixerConvert169 {

	public static String conversion(String date, String base) {
		
		//���� ����. try{} �ۿ����� ����ϱ� ���� try{} ���� �����Ѵ�.
		BufferedReader br= null;
		
		//JSON �����͸� �����ϴ� �ּҸ� �Է��Ѵ�.
		String newUrls1= "http://data.fixer.io/api/%s?access_key=97042483f2b64c6bfe1dbfbf4a2bd1b3&symbols=KRW,JPY,CNY,USD,EUR";
		
		//��¥�� ȭ���� ������ �Է��Ѵ�.
		String newUrls= String.format(newUrls1, date, base);
		URL url= null;
		//���� ���� ���ڿ��� ����(���ͺ� ���ڿ�)= ���ڿ��� �Է��ص� ���� �ּҸ� �����Ͽ� �޸𸮸� �Ƴ���.
		//���ڿ��� ���̴� ������ �ַ� ����ϰ�, ��� ���̸� String���� �� ��ȯ�ؾ� �Ѵ�.
		StringBuffer sb= new StringBuffer();
		
		try {
			url= new URL(newUrls); //http://data.fixer.io/api
			System.out.println(newUrls);
			br= new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
			String msg="";
			
			//http://data.fixer.io/api �� �о���δ�.
			while((msg=br.readLine())!=null) {
				sb.append(msg);
			}
			
		}catch(Exception e) {
			
		}
		//��� ���� ���ڿ��� String���� ��ȯ�Ѵ�.
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��¥ ������ �غ��Ѵ�. "��-��-��"�� ���ڿ��� ��� ���ؼ��̴�.
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal= Calendar.getInstance();
		String date= sdf.format(cal.getTime());
		String base= "USD";
		
		String fixerrate= FixerConvert169.conversion(date, base);
		System.out.println(fixerrate);
		
		String base2= "JPY";
		String fixerrate2= FixerConvert169.conversion(date, base2);
		System.out.println(fixerrate2);
		
		String base3= "CNY";
		String fixerrate3= FixerConvert169.conversion(date, base3);
		System.out.println(fixerrate3);
		
	}

}
