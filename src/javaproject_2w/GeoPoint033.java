package javaproject_2w;

//��ü�� �̿��Ͽ� ����, �浵 ǥ���ϱ�
//����, �浵�� �� �������� ��ü�� ����
public class GeoPoint033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ǽ� ����
		double latitude1= 37.521239393939;
		double longtitude1= 127.00744628906245;
		double latitude2= 35.137879119643;
		double longtitude2= 129.04541015625;
		System.out.println(latitude1 + "\t"+ longtitude1);
		
		//(����,�浵) ��ü
		Geo033 geo1= new Geo033();
		geo1.latitude= latitude1;
		geo1.longtitude= longtitude1;
		System.out.println(geo1.latitude + "\t" + geo1.longtitude);
		
		}
	}


