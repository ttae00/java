package javaproject_2w;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

/*
 * ������ ��Ʈ ������ ������ ���丮 ã��
 * ������ ��Ʈ ������ ����� ���丮�� ã�ƺ���(billboard)
 * ��Ʈ: File Ŭ������ �̿��Ͽ� ���丮�� ã�� ���丮�� �ִ� ������ ã�´�
 * 
 */
public class BillFiles088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.io.file Ŭ������ ���Ͽ� ���õ� Ŭ������ ������ �����Ѵ�.
		File f= new File("billboard"); // billboard ���丮
		//���丮 ���ο� ���Ե� ��� ������ �迭�� ��ȯ�Ѵ�
		File[] fd= f.listFiles(); //�ٷ� �Ʒ� ���ϵ�(�ڽ� ����)
		
		for(File ff:fd) {
			String fname= ff.getName(); //���ϸ�
			String post= fname.substring(fname.lastIndexOf(".")+1); //Ȯ����(���ϸ�.Ȯ����)
			System.out.println(fname+" "+post);
			
			System.out.println(ff.getAbsolutePath()); //��ü ���
			
			//������¥�� �Է��Ͽ� Date ��ü�� ��¥ ������ ��´�.
			System.out.println(new Date(ff.lastModified())); //������
			try(BufferedReader br= new BufferedReader(new FileReader(ff.getAbsolutePath()))){
				String msg= "";
				while((msg=br.readLine())!=null) {
					System.out.println(msg);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("=============================");
			
		}
		

	}

}
