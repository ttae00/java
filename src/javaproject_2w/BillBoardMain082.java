package javaproject_2w;
/*
 * ������ ��Ʈ �������� ����ϴ� ������ ���ڿ�
 * ������ ��Ʈ���� ����ϴ� ������ ���ڿ��� ���캸��.
 * ��Ʈ: ������ �Ҽ����� ���� ����, ���ڿ��� ""������ ���� ���� 
 * 
 */
public class BillBoardMain082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rank=1;
		String song= "Despacito";
		
		//data�� �׸��� ��´�.
		int lastweek=1;
		String imagesrc= "https://www.billboard.com/images/pref_images/q61808osztw.jpg";
		String artist="luis fonsi";
		String sf= String.format("%d, %s, %d, %s, %s", rank, song, lastweek, imagesrc, artist);
		System.out.println(sf);

	}

}
