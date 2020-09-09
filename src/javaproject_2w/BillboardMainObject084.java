package javaproject_2w;



/*
 * ������ ��Ʈ�� ��ü�� �����ϰ� ����ϱ�
 * ��Ʈ: varargs(...)�� �� �� �̻��� ��ü�� ����� �� �ִ�. 
 * 
 */
public class BillboardMainObject084 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billboard083 b1= new Billboard083(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		Billboard083 b2 =new Billboard083(2,"That's What I Like",2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
		Billboard083 b3 =new Billboard083(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");
		
		showAbout(b1);
		showAbout(b2);
		showAbout(b1,b2);
		showAbout(b1,b2,b3);
		
		Billboard083[] b = new Billboard083[3];
		b[0]= new Billboard083(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		b[1]=b2; // �� new�� �����ص� ����, ������ ��ü(b2,b3)�� �޾Ƶ� �ȴ�
		b[2]=b3;
		showAbout(b[0],b[1]); //2�� ��ü
		showAbout(b); //�迭- 3�� ��ü
	}

	//2�� �̻��̳� �迭�� ���� ȣ���ϴ� �ƱԸ�Ʈ �޼���
	public static void showAbout(Billboard083... b) { //��ü�� �����Ͽ� ���
		// TODO Auto-generated method stub
		System.out.println("2======================");
		
		//foreach(���� for��) �ε��� ���� ������� ������ ��ü ������ ����Ѵ�.
		for(Billboard083 bill: b) {
		
			showAbout(bill); //1
		}
		System.out.println("======================2");
	}
	
	//1��¥�� �ƱԸ�Ʈ �޼���
	public static void showAbout(Billboard083 bb) { //��ü�� �����Ͽ� ���
		// TODO Auto-generated method stub
		System.out.println("1----------------");
		String sf= String.format("%d, %s,%d, %s",
				bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	}

}
