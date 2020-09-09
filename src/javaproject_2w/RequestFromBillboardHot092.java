package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/*
 * 매우 어려움
 * 찾으려는 날짜의 빌보드 차트를 리스트에 저장하기
 * 찾으려는 날짜의 빌보드 차트 내용을 읽어 리스트에 저장해보자
 * 힌트: IO의 BufferedReader를 이용하여 읽은 문자열을 ArrayList에 저장한다 
 * 
 */
public class RequestFromBillboardHot092 {
	
	ArrayList<String> htmls= new ArrayList<String>();
	boolean isConnection= false;
	
	
	public RequestFromBillboardHot092() {
		htmls.clear();
	}

	public void getAllHtml(String newUrls) {
		
		htmls.clear();
		URL url= null;
		
		try {
			url = new URL(newUrls); //주소 찾기
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"eur-kr"),8);
			String line="";
			
			while((line= br.readLine())!= null) {
				if(!line.trim().equals("")) {
					htmls.add(line.trim());
					break;
				}
				
			}
			
			isConnection = true;
		}catch(Exception e) {
			isConnection= false;
			System.out.println("파싱 에러");
		}
	}
	
	public void printHtml() {
		for(String s: htmls) {
			System.out.println(s);
		}
	}
	
	public String getTimeDate(String newUrls) {
		
		String s="";
		URL url= null;
		
		try {
			url= new URL(newUrls);
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
			String line="";
			
			while((line= br.readLine())!= null) {
				if(!line.trim().equals("")) {
					if(line.contains("<time datetime=")) {
						s=line.trim();
						s= s.substring(0,s.indexOf(">")-1);
						s= s.substring(s.indexOf("\"")+1).trim();
						break;
					}
				}
			}
			isConnection= true;
			//System.out.println("날짜: "+s);
			
		}catch(Exception e) {
			isConnection = false;
			System.out.println("빌보드 파싱 에러");
		}
		return s;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	RequestFromBillboardHot092 rfw= new RequestFromBillboardHot092();
	String a= "https://www.billboard.com/charts/hot-100/";
	String rs= rfw.getTimeDate(a);
	//System.out.println("이번 주 : "+ rs);
	//rs=RestDay075.to(rs,1);
	//rfw.getAllHtml(a);
	//rfw.getAllHtml(a+rs);
	//rfw.printHtml();
	rfw.getAllHtml(a);
	}

}
