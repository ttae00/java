package javaproject_2w;

import java.util.ArrayList;



/*
 * ������ ��Ʈ�� ����Ʈ�� �����ϰ� ����ϱ�
 * ������ ��Ʈ ������ ��ü�� ������ ����, ��ü�� ����Ʈ�� �����ϰ� ����� ����. 
 * ��Ʈ: ����Ʈ�� ���� �迭�� ������ �� add, ����� �� get�� �̿��Ѵ�.
 * 
 */
public class BillboardArrayMain085 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ ������ �� ��ü�� �����ϰ�, �� ��ü�� ����Ʈ�� �����Ѵ�. ����Ʈ�� �����ϱ⵵ ���ϰ� ����, ã�⿡�� ���ϴ�.
		//ArrayList�� �����Ѵ�. Billboard083 ��ü�� �����ϱ� ���� <Billboard083>(���ʸ�)�� �����Ѵ�.
		ArrayList<Billboard083> bills= new ArrayList<>();
		bills.add(new Billboard083(1,"Despacito",1,
			"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi"));
		bills.add(new Billboard083(2,"That's What I Like",2,
			"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars"));
		bills.add(new Billboard083(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled"));
		
		System.out.println(bills.size()); //3
		ShowAbout(bills.get(0)); //0��° Billboard083 ��ü
		bills.remove(1); //1��° ����
		System.out.println(bills.size()); //2
		System.out.println("------------");
		for(Billboard083 bb: bills) {
			System.out.println(bb);
		}
	}

	private static void ShowAbout(Billboard083 bb) { //��ü �����Ͽ� ���
		// TODO Auto-generated method stub
		String sf= String.format("%d, %s, %d, %s, %s"
				,bb.getRank(),bb.getSong(),bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}

}
