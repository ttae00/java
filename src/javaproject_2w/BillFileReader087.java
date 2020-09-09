package javaproject_2w;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* ������ ������ ��Ʈ ���� ���� �о���̱�
 * ��Ʈ: ���ڿ�(�ؽ�Ʈ)�� ���� ���� BufferedReader�� ����Ѵ�
 * �����ؾ� �� ��: BufferedReader( FileReader )
 * 
 */
public class BillFileReader087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br= new BufferedReader(
				new FileReader("billboard\\bill.txt"))){
			String msg="";
			while((msg=br.readLine())!=null) {
				System.out.println(msg);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
