package javaproject_2w;

//1차원, 2차원 배열
/*
 * 배열은 참조 타입이다. 배열은 new로 생성하는 동적 할당 배열과, new를 사용하지 않는 정적 할당 배열이 있따.
 * 해당 경우는 정적 할당 배열. 정적 할당 배열은 두 번째 대입을 할 수 없다.
 * ex) double []latlng1={37.5, 127.0} //선언, 초기화
 * latlng1= {36.4, 128.4} //두 번째 대입 불가능
 * */
public class GeoPoint032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실수 변수
		double latitude1= 37.521239393939;
		double longtitude1= 127.00744628906245;
		double latitude2= 35.137879119643;
		double longtitude2= 129.04541015625;
		System.out.println(latitude1 + "\t"+ longtitude1);
		
		//실수 1차원 배열
		double []latlng1= {latitude1,longtitude1};
		double []latlng2= {latitude2,longtitude2};
		System.out.println(latlng1[0]+"\t" + latlng1[1]);
		
		//실수 2차원 배열
		double [][]latlng= {{latitude1, longtitude1},
							{latitude2, longtitude2}};
		System.out.println(latlng[0][0]+ "\t" + latlng[0][1]);
		}
	}


