package javaproject_2w;


public class BillboardMain083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data를 객체로 저장
		//빌보드 객체를 생성한다. 왼쪽 빌보드는 설계도이고 오른쪽 빌보드는 생성된 객체이다. 생성하면서 값 초기화한다.
		Billboard083 b1= new Billboard083(1,"Despacito",1,
				  "https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		//객체 출력
		showAbout(b1);
		
		//객체로 전달. 주소를 복사한 후, 주소의 객체 정보를 출력한다.
		Billboard083 b= b1;
		showAbout(b);
		
		
	}
	
	//빌보드 차트의 정보를 붙여서 출력한다.
	public static void showAbout(Billboard083 bb) {
		String sf= String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(),
								bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}

}
