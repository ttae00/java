package javaproject_3w;
/*
 * �ٽ� �غ���
 * ���ڿ� Ư¡�� �̿��Ͽ� ���� ���� ���ϱ�
 * ���� ���� ���� �����
 * ��Ʈ: "f2"�� ���� ���� "1"�� 1��, "2"�� 1���̸�, ���ڿ��� ���̸� "1121" 
 * 
 */
public class AntQuiz125 {
	//s= "112111"
	public String ant(String s) {
		String t="";
		char c= s.charAt(0); //'1'
		int count= 1;
		for(int i=1; i<s.length(); i++) {
			if(c== s.charAt(i)) {
				count++;
			}else {
				t= t+c+count;
				c= s.charAt(i);
				count =1;
			}
		}
		
		t=t+c+count;
		return t;
	}
	
	public void ant(int stage) {
		String s="11";
		for(int i= 0; i<stage; i++) {
			System.out.println(s);
			s=ant(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AntQuiz125 quiz= new AntQuiz125();
		quiz.ant(12);
	}

}
