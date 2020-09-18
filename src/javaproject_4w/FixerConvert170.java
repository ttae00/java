package javaproject_4w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONObject;


//다시 하기
public class FixerConvert170 {
	
	public static String conversion(String date, String base) {
		
		//필터 선언. try{} 밖에서도 사용하기 위해 try{} 위에 선언한다.
		BufferedReader br= null;
		
		//JSON 데이터를 제공하는 주소를 입력한다.
		String newUrls1= "http://data.fixer.io/api/%s?access_key=97042483f2b64c6bfe1dbfbf4a2bd1b3&symbols=KRW,JPY,CNY,USD,EUR";
		
		//날짜와 화폐의 종류를 입력한다.
		String newUrls= String.format(newUrls1, date, base);
		URL url= null;
		//여러 줄의 문자열을 만듦(뮤터블 문자열)= 문자열을 입력해도 원래 주소를 유지하여 메모리를 아낀다.
		//문자열을 붙이는 과정에 주로 사용하고, 모두 붙이면 String으로 형 변환해야 한다.
		StringBuffer sb= new StringBuffer();
		
		try {
			url= new URL(newUrls); //http://data.fixer.io/api
			System.out.println(newUrls);
			br= new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
			String msg="";
			
			//http://data.fixer.io/api 를 읽어들인다.
			while((msg=br.readLine())!=null) {
				sb.append(msg);
			}
			
		}catch(Exception e) {
			
		}
		//모두 붙인 문자열을 String으로 변환한다.
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
