package javaproject_4w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONObject;


//�ٽ� �ϱ�
public class FixerConvert170 {
	
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
	
	public static FixerRate168 convert2(String data, String base) throws Exception{
		
		JSONObject jObject= new JSONObject(data);
		JSONObject rate= jObject.getJSONObject("rates");
		
		FixerRate168 fixerrate= new FixerRate168();
		fixerrate.date=jObject.getString("date");
		fixerrate.base= base;
		
		if(base.equals("USD")) {
			fixerrate.usd= rates.getDouble("USD")/rates.getDouble("USD");
			fixerrate.krw= rates.getDouble("KRW")/rates.getDouble("USD");
		}
		
		
		return fixerrate;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
