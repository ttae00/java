package javaproject_2w;

public enum PEI2{
	//23, 28, 33를 생성자를 통해 enum 값으로 초기화 한다. 값 변경 불가
	//한글로도 컴파일 되는지 확인
	
	신체(23),감정(28),지성(33);
	
	private final int peiValue;// PEI에 있는 모든 상수 값을 이 enum 변수를 통해 저장할 수 있다

	//enum값을 초기화하는 생성자
	PEI2(int pie){
		this.peiValue= pie;
	}
	
	//enum 값은 정수 변환이 불가능하기 때문에 메서드를 선언해서 사용한다.(사용자 정의 메서드)
	public int getPei() {
		return peiValue;
	}
}

