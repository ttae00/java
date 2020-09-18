package javaproject_4w;

public class CakeEatings157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CakePlate157 cake = new CakePlate157(); //빵접시 준비
		CakeEater157 eater= new CakeEater157(cake); //빵접시 공유
		CakeMaker157 baker= new CakeMaker157(cake); //빵접시 공유
		
		//우선순위가 높으면 더 많이 호출할 가능성 -> 더 먼저 끝날 가능성이 높다
		//baker.setPriority(6);
		baker.start();
		eater.start();
		
		
	}

}
