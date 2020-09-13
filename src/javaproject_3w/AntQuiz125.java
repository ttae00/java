package javaproject_3w;
/*
 * 다시 해보기
 * 문자열 특징을 이용하여 개미 퀴즈 구하기
 * 개미 수열 퀴즈 만들기
 * 힌트: "f2"의 다음 수는 "1"이 1개, "2"가 1개이며, 문자열로 붙이면 "1121" 
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
