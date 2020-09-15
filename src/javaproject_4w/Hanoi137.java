package javaproject_4w;
/*
 * �ٽ� �غ���
 * �ϳ��� Ÿ�� �����
 * ��Ʈ: ��� �̿�. 
 * 
 * 
 */
public class Hanoi137 {
	
	int tray =3;
	int bar=3;
	int[][] rings;
	
	public int[][] getRings() {
		return rings;
	}
	public Hanoi137(int tray) {
		this.tray= tray;
		rings= new int[tray][bar];
		for(int i=0; i<rings.length; i++) {
			int x=2*i+1;
			rings[i][0]= x;
		}
	}
	
	public void moveHanoi(int num, char ringA, char ringB, char ringC) {
		if(num==1) {
			System.out.println(ringA +"bar�ʿ� �ִ� ����" + ringB+"bar������ �̵�");
		}else {
			moveHanoi(num-1, ringA, ringC, ringB);
			System.out.println(ringA +"bar�ʿ� �ִ� ����"+ ringB+"bar������ �̵�");
			moveHanoi(num-1, ringC, ringB, ringA);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tray= 4;
		Hanoi137 ha= new Hanoi137(tray);
		
		ha.moveHanoi(tray, 'a', 'b', 'c');
	}

}
