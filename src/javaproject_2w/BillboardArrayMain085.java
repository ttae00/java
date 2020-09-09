package javaproject_2w;

import java.util.ArrayList;



/*
 * 빌보드 차트를 리스트에 저장하고 출력하기
 * 빌버드 차트 정보를 객체에 저장한 다음, 객체를 리스트에 저장하고 출력해 보자. 
 * 힌트: 리스트는 향상된 배열로 저장할 때 add, 사용할 때 get을 이용한다.
 * 
 */
public class BillboardArrayMain085 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//빌보드 정보를 한 객체에 저장하고, 이 객체를 리스트에 저장한다. 리스트는 저장하기도 편리하고 제거, 찾기에도 편리하다.
		//ArrayList를 생성한다. Billboard083 객체만 저장하기 위해 <Billboard083>(제너릭)로 제한한다.
		ArrayList<Billboard083> bills= new ArrayList<>();
		bills.add(new Billboard083(1,"Despacito",1,
			"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi"));
		bills.add(new Billboard083(2,"That's What I Like",2,
			"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars"));
		bills.add(new Billboard083(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled"));
		
		System.out.println(bills.size()); //3
		ShowAbout(bills.get(0)); //0번째 Billboard083 객체
		bills.remove(1); //1번째 삭제
		System.out.println(bills.size()); //2
		System.out.println("------------");
		for(Billboard083 bb: bills) {
			System.out.println(bb);
		}
	}

	private static void ShowAbout(Billboard083 bb) { //객체 전달하여 출력
		// TODO Auto-generated method stub
		String sf= String.format("%d, %s, %d, %s, %s"
				,bb.getRank(),bb.getSong(),bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}

}
