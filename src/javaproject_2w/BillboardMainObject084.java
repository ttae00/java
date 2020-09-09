package javaproject_2w;



/*
 * 빌보드 차트를 객체에 저장하고 출력하기
 * 힌트: varargs(...)는 한 개 이상의 객체를 출력할 수 있다. 
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
		b[1]=b2; // 위 new로 생성해도 좋고, 생성된 객체(b2,b3)를 받아도 된다
		b[2]=b3;
		showAbout(b[0],b[1]); //2개 객체
		showAbout(b); //배열- 3개 객체
	}

	//2개 이상이나 배열에 관해 호출하는 아규먼트 메서드
	public static void showAbout(Billboard083... b) { //객체를 전달하여 출력
		// TODO Auto-generated method stub
		System.out.println("2======================");
		
		//foreach(향상된 for문) 인덱스 없이 순서대로 빌보드 객체 정보를 출력한다.
		for(Billboard083 bill: b) {
		
			showAbout(bill); //1
		}
		System.out.println("======================2");
	}
	
	//1개짜리 아규먼트 메서드
	public static void showAbout(Billboard083 bb) { //객체를 전달하여 출력
		// TODO Auto-generated method stub
		System.out.println("1----------------");
		String sf= String.format("%d, %s,%d, %s",
				bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	}

}
