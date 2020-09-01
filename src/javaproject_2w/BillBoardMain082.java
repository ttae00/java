package javaproject_2w;
/*
 * 빌보드 차트 정보에서 사용하는 정수와 문자열
 * 빌보드 차트에서 사용하는 정수와 문자열을 살펴보자.
 * 힌트: 정수는 소수점이 없는 숫자, 문자열은 ""사이의 여러 문자 
 * 
 */
public class BillBoardMain082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rank=1;
		String song= "Despacito";
		
		//data를 그릇에 담는다.
		int lastweek=1;
		String imagesrc= "https://www.billboard.com/images/pref_images/q61808osztw.jpg";
		String artist="luis fonsi";
		String sf= String.format("%d, %s, %d, %s, %s", rank, song, lastweek, imagesrc, artist);
		System.out.println(sf);

	}

}
