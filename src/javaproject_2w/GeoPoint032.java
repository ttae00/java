package javaproject_2w;

//1����, 2���� �迭
/*
 * �迭�� ���� Ÿ���̴�. �迭�� new�� �����ϴ� ���� �Ҵ� �迭��, new�� ������� �ʴ� ���� �Ҵ� �迭�� �ֵ�.
 * �ش� ���� ���� �Ҵ� �迭. ���� �Ҵ� �迭�� �� ��° ������ �� �� ����.
 * ex) double []latlng1={37.5, 127.0} //����, �ʱ�ȭ
 * latlng1= {36.4, 128.4} //�� ��° ���� �Ұ���
 * */
public class GeoPoint032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ǽ� ����
		double latitude1= 37.521239393939;
		double longtitude1= 127.00744628906245;
		double latitude2= 35.137879119643;
		double longtitude2= 129.04541015625;
		System.out.println(latitude1 + "\t"+ longtitude1);
		
		//�Ǽ� 1���� �迭
		double []latlng1= {latitude1,longtitude1};
		double []latlng2= {latitude2,longtitude2};
		System.out.println(latlng1[0]+"\t" + latlng1[1]);
		
		//�Ǽ� 2���� �迭
		double [][]latlng= {{latitude1, longtitude1},
							{latitude2, longtitude2}};
		System.out.println(latlng[0][0]+ "\t" + latlng[0][1]);
		}
	}


