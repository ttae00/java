package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/*
 * ������ ��Ʈ �� ����Ʈ���� ������ �о� ����Ʈ�� �����ϱ�
 * ������ �о� ����Ʈ�� ������ ����. 
 * ��Ʈ: ������Ʈ �ּҿ��� ���ڿ��� �� �پ� �о ����Ʈ�� �����Ѵ�.
 */
public class BillboardArrayMain090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String�� ������ �� �ִ� ArrayList ��ü ����. ����Ʈ�� ������ ������Ʈ���� ���� ������ ����
		ArrayList<String> str= new ArrayList<String>();
		//������ ������Ʈ ���
		String newUrls="https://www.billboard.com/charts/hot-100/";
		
		//������Ʈ ��θ� ã�� URLŬ������ �����Ѵ�.
		URL url= null;
		try {
			//������Ʈ ��θ� �Է��ϰ� URL ��ü�� �����ؼ� �ּҸ� ã�´�
			url= new URL(newUrls);//�ּ� ã��
			
			//�ּ����� ���� �ȱ�, �ּҿ��� ������ ������ �б� ���� BufferedReader ��ü�� �����Ѵ�.
			//�ּ����� �����ϰ� �ѱ��� ������ �ʵ��� "euc-kr"�� �����ϰ� ���� ȣ��(url)�� �����Ѵ�.
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
	
			String line= null;
			//������Ʈ���� �� �̻� ���� ���� ���� ������ �� �پ� �д´�.
			while((line=br.readLine())!=null) {
				
				//���� ���ڿ��� ������ �ƴϸ� ���� ���ڿ��� ����Ʈ�� �����Ѵ�
				if(!line.trim().equals("")) {
					//System.out.println(line.trim());
					str.add(line.trim());
				}
			}
		//	System.out.println(str);
		}catch(Exception e) {
			System.out.println("billboard parsing error!!");
		}
		
		//����for�� �̿��Ͽ� ����Ʈ�� ����� ������ �� �پ� ����Ѵ�.
		for(String str1: str) {
			System.out.println(str1);
		}
		
	}

}
