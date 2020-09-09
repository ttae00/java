package javaproject_2w;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * �ٽ� Ǯ���
 * ������ ��Ʈ ������ ���Ϸ� �����ϱ�
 * ��Ʈ: ���ڿ�(�ؽ�Ʈ)�� ������ ���� PrintWriter�� ����Ѵ�. 
 * �����ؾ� �� ��: java.io, PrintWriter, FileWriter(�ѱ� ó�� ����)
 */
public class BillFileWriter086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billboard083 b1= new Billboard083(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		Billboard083 b2 =new Billboard083(2,"That's What I Like",2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
		Billboard083 b3 =new Billboard083(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");
		
		ArrayList<Billboard083> bblist= new ArrayList<>();
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		//System.out.println(bblist);
		
		//billboard��� ������ �����
		File f= new File("billboard");
		//billboard ������ �������� �ʴ´ٸ� make directory
		if(!f.exists()) {f.mkdirs();}
		
		//try(PrintWriter ����){} ������ �ڹ�7���� �߰��� �������� finally�� ������� �ʰ� {}�� ������ �ڵ����� PrintWriter�� close�Ѵ�.
		//PrintWriter(FileWriter)�� �̿��Ͽ� ������ �����Ѵ�
		//billboard ���丮�� bill.txt ���� �̸����� �����Ѵ�. bill.txt�� �̹� �ִٸ� ������ ��� ����� ����(false) �����Ѵ�.
		try(PrintWriter pw= new PrintWriter(new FileWriter("billboard\\bill.txt",false), 
				//�� �� �����ϰ� �ڵ����� ������ Ȯ���ϰ� �����ϵ��� �Ѵ�(true)
				true)){
			for(Billboard083 bb: bblist) {
				pw.println(bb);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
