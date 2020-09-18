package javaproject_4w;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * ����ó����� ����2
 * ��ü�� ���� ���Ͽ� �����ϴ� ���, ���� �б�, ���� ����� ���� ����.
 * ��Ʈ: ��ü �񱳴� Comparator<Product>�� compare() �޼��带 �����Ѵ�
 * 
 * */
public class ProductReader160 {
	
	private List<String> list= new ArrayList<>();
	public boolean isExist(String fname) {
		boolean isE= false;
		File f= null;
		try {
			f= new File(fname);
			if(f.exists()) {
				isE= true;
			}
			
		}catch(Exception ee) {
			log(ee.getMessage());
		}
		return isE;
	}
	
	
	public int listSize() {
		return list.size();
		
	}
	
	public void readTexts(String fname) {
		list.clear();
		//����(FileReader)�� �ȴ´�. ����� FileReader�� �����Ѵ�. ���� �� �Ѱ� �־�� ��
		FileReader fr= null;
		//ȣ��(BufferedReader)�� �غ��Ѵ�. ������ ���۸����� �����Ѵ�.
		BufferedReader br= null;
		File ff= null;
		try {
			if(isExist(fname)) {
				ff= new File(fname);
				fr= new FileReader(ff);
				br= new BufferedReader(fr);
			}
			
			//�� �پ� �о ����Ʈ�� �����Ѵ�.
			String msg="";
			while((msg=br.readLine())!=null) {
				list.add(msg);
			}
		}catch(Exception ee) {
			log(ee.getMessage());
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception eee) {
				log(eee.getMessage());
			}
		}
	}
	
	public String readText(String fname) {
		String msg="";
		FileReader fr= null;
		BufferedReader br= null;
		File ff= null;
		
		try {
			if(isExist(fname)) {
				ff= new File(fname);
				fr= new FileReader(ff);
				br= new BufferedReader(fr);
			}
			//���ٸ� �д´�
			msg= br.readLine();
		}catch(Exception ee) {
			log(ee.getMessage());
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception eee) {
				log(eee.getMessage());
			}
		}
		return msg;
	}
	
	public String getText(int i) {
			if(i+1>list.size()) {
				return "";
				
			}
			//����Ʈ���� ������  ��ġ �� ���� �д´�.
			return list.get(i);
	}
	
	private void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error-------->:"+msg);
	}
	
	//����Ʈ�� ��ȯ�Ѵ�.
	public List<String> getAllLines(){
		return list;
	}
	
	
}
