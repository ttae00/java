package javaproject_2w;


public class BillboardMain083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data�� ��ü�� ����
		//������ ��ü�� �����Ѵ�. ���� ������� ���赵�̰� ������ ������� ������ ��ü�̴�. �����ϸ鼭 �� �ʱ�ȭ�Ѵ�.
		Billboard083 b1= new Billboard083(1,"Despacito",1,
				  "https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		//��ü ���
		showAbout(b1);
		
		//��ü�� ����. �ּҸ� ������ ��, �ּ��� ��ü ������ ����Ѵ�.
		Billboard083 b= b1;
		showAbout(b);
		
		
	}
	
	//������ ��Ʈ�� ������ �ٿ��� ����Ѵ�.
	public static void showAbout(Billboard083 bb) {
		String sf= String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(),
								bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}

}
