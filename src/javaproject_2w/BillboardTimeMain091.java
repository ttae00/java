package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


/*
 * �ٽ� �ϱ� (��¥�� ���� ����)
 * �̹� �� ������ ��Ʈ ���� ��¥ ã��
 * �̹� �� ������ ��Ʈ�� ���� ��¥�� ã�ƺ���
 * ��Ʈ: String�� Ư�� ���ڿ��� ��ġ�� ã�� indexOf, �ڸ��� subString�� �̿��Ͽ� ��¥�� ã�´�. 
 * 
 */
public class BillboardTimeMain091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newUrls="https://www.billboard.com/charts/hot-100/";
		
		String s="";
		URL url= null;
		try {
			url= new URL(newUrls); //�ּ� ã��
			
			//�ּ����� ���� �ȱ�
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
			String line="";
			
			while((line= br.readLine())!=null){ //�� �پ� �о���δ�
				if(!line.trim().equals("")) { //���ڿ��� �ִٸ�
					//<time datetime= "2018-08-13">August 13, 2018</time>
					if(line.trim().contains("<time datetime=")) { //ã��
						System.out.println("����");
						s= line.trim();
							//ù ����">"�� ã�� ">" ������ ������.
							s=s.substring(0,s.indexOf(">")-1); //<time datetime= "2018-08-13"
							//��-��-�� �տ� �ִ� ���ڿ��� �����Ѵ�.
							s=s.substring(s.indexOf("\"")+1).trim(); 
							break;
							
					}
				}
			}
			
			
			
		}catch(Exception e) {
			System.out.println("�Ľ� ����");
		}
		
		System.out.println("������ ��Ʈ ��¥: " + s);

	}

}
