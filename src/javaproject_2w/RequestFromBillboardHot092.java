package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/*
 * �ſ� �����
 * ã������ ��¥�� ������ ��Ʈ�� ����Ʈ�� �����ϱ�
 * ã������ ��¥�� ������ ��Ʈ ������ �о� ����Ʈ�� �����غ���
 * ��Ʈ: IO�� BufferedReader�� �̿��Ͽ� ���� ���ڿ��� ArrayList�� �����Ѵ� 
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
			url = new URL(newUrls); //�ּ� ã��
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
			System.out.println("�Ľ� ����");
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
			//System.out.println("��¥: "+s);
			
		}catch(Exception e) {
			isConnection = false;
			System.out.println("������ �Ľ� ����");
		}
		return s;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	RequestFromBillboardHot092 rfw= new RequestFromBillboardHot092();
	String a= "https://www.billboard.com/charts/hot-100/";
	String rs= rfw.getTimeDate(a);
	//System.out.println("�̹� �� : "+ rs);
	//rs=RestDay075.to(rs,1);
	//rfw.getAllHtml(a);
	//rfw.getAllHtml(a+rs);
	//rfw.printHtml();
	rfw.getAllHtml(a);
	}

}
