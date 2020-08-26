package javaproject_2w;

//객체를 이용하여 위도, 경도 표현하기
//위도, 경도를 한 묶음으로 객체에 저장
public class GeoPoint033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실수 변수
		double latitude1= 37.521239393939;
		double longtitude1= 127.00744628906245;
		double latitude2= 35.137879119643;
		double longtitude2= 129.04541015625;
		System.out.println(latitude1 + "\t"+ longtitude1);
		
		//(위도,경도) 객체
		Geo033 geo1= new Geo033();
		geo1.latitude= latitude1;
		geo1.longtitude= longtitude1;
		System.out.println(geo1.latitude + "\t" + geo1.longtitude);
		
		}
	}


