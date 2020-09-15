package javaproject_4w;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��...��...
 * ������ ������ ����
 * java.nio.Files.copy()�� �̿��Ѵ� 
 * 
 */
public class FilesCopys132 {
	
	/*23424123123.txt�� ���� long.txt�� ����� ������ 20170503\23424123123.txt���� "������\����"�� �����Ѵ�.
	 * long Ÿ���� Date Ÿ������ ��ȯ�ϰ� SimpleDateFormat�� �̿��Ͽ� "������" ������ ���ڿ��� ��ȯ�Ѵ�.
	 * �׸���  "������" ���丮�� �ش� ������ �����Ѵ�.
	 */

	public static void copyUsingFiles(File source, File target) {
		try {
			//source ������ target ���Ϸ� �����Ѵ�. java.nio.files.copy()�� ���� ó���� �ʿ��ϴ�
			Files.copy(source.toPath(), target.toPath());
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ff= new File("upload");
		//upload ���丮�� ��� ������ ã�´�
		File[] ffs= ff.listFiles();
		
		//2017-05-03 01:23
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat fds= new SimpleDateFormat("yyyyMMdd"); //20170503
		
		for(File fff:ffs) {
			
			//�����θ� ��´�
			String absfile= fff.getAbsolutePath();
			
			if(fff.isFile()) {
				//���� ��� �� ������ "\" ���� ���� �̸��� ��´�. ���� ��� upload\20170526\1495788293207.png���� 1495788293207.png�� ��´�.
				String f= (absfile).substring(absfile.lastIndexOf("\\")+1);
				String fre= "";
				if(f.indexOf('.')>=0) {
					fre= f.substring(0,f.indexOf('.'));
				}
				//long Ÿ���� Date�� ��ȯ��Ų��.
				Date longDay = new Date(Long.parseLong(fre)); //long->Date
				//��-��-�� ��:�� ������ ���ڿ��� ��ȯ��Ų��.
				String fname= sdf.format(longDay); //Date->String
				
				String newFname= fds.format(longDay); //23424123123
				System.out.println(fname+ "\t\t" + newFname); //Date -> String
				//23424123123.txt -> 20170503/23424123123.txt
				File newFile= new File("upload\\" + newFname); //�ű���� �ϴ� ���丮
				File toFile= new File("upload\\" + newFname+"\\"+f); //�ű���� ����
				
				if(!newFile.exists()) {
					boolean iss= newFile.mkdir(); //�������� ������ ������
					if(iss) {
						copyUsingFiles(fff, toFile); //���� ����
					}
				}else {
					copyUsingFiles(fff, toFile); //���� ����
				}
				
				
			}
		}
		
		
	}

}
