package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;



/*
 * �ٽ� ����
 * ������ ��Ʈ ������Ʈ���� ���� �о����
 * ������Ʈ �ּҸ� ã�� URLŬ������ �̿��Ѵ�. 
 * 
 */
public class BillboardMain089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newUrls="https://www.billboard.com/charts/hot-100/";
		URL url= null;
		try {
			url= new URL(newUrls); //�߼� ã��
			
			//�ּ����� ���� �ȱ�
			BufferedReader br= new BufferedReader(
					new InputStreamReader(url.openStream(),"euc-kr"),8);
			String line= null;
			//�� �پ� �о
			while((line= br.readLine())!= null) {
				//System.out.println(line);
				//������ �ƴϸ� ����Ѵ�.
				if(!line.trim().equals("")) {
					System.out.println(line.trim());
				}
			}
		}catch(Exception e) {
			System.out.println("������ �Ľ� ����");
		}
	}

}
