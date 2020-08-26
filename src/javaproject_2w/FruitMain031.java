package javaproject_2w;

//enum 상수는 static final을 사용 하지 않고 대문자로 선언한다.
//enum을 int로 변환하거나 대입할 수 없다.변환해서 사용하고 싶다면 순서를 나타내는 ordinal()이용.
//메서드가 없는 기본 enum은 연산에 적합하지 않으며, if 나 switch와 같은 분기문에 사용.
public class FruitMain031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FRUIT pear= FRUIT.APPLE;
		FRUIT pear2= FRUIT.MANGO;
		System.out.println(pear); //APPLE
		System.out.println(pear.name()); //APPLE
		//선언한 순서(ordinal)대로 0,1,2 처럼 값이 자동으로 대입된다.
		System.out.println(pear.ordinal()); //선언될 때 순서 0 //0
		System.out.println(pear2.ordinal()); // 선언될 때 순서 2 //2
		
		FRUIT []fruit= FRUIT.values();
		System.out.println(fruit[0]); //APPLE
		
	}

}
