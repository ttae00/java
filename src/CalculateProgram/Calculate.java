package CalculateProgram;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class Calculate extends JFrame{
	
	public static void main(String[] args) {
		new Calculate();
		//c.setVisible(true);
		
		
	}
	
	JLabel label;
	JLabel info;
	int flag = 0;
	int check = 0;
	

	public Calculate() {
		super("CACULATION");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new BorderLayout(5,5));
		
		NorthPanel NP= new NorthPanel();
		c.add(NP,BorderLayout.EAST);
		
		CenterPanel CP= new CenterPanel();
		c.add(CP,BorderLayout.SOUTH);
		
	
		this.setSize(500,600);
		setVisible(true);
	}
	
	//가장 위쪽 패널
	class NorthPanel extends JPanel{
		public NorthPanel() {
			setLayout(new GridLayout(3,1));
			info= new JLabel("수식을 입력하세요.");
			label= new JLabel("");
			
			info.setFont(new Font("맑은 고딕",0,20));
			info.setHorizontalAlignment(SwingConstants.RIGHT);
			
			label.setFont(new Font("맑은 고딕",0, 40));
			label.setHorizontalAlignment(SwingConstants.RIGHT);
			
			add(info);
			add(label);
			label.addMouseListener(new MyMouse());
		}
	}
	
	//마우스 더블 클릭했을 때 초기화
	class MyMouse extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			if(e.getClickCount()==2) {
				flag = 0;
				label.setText("");
				info.setText("수식을 입력하세요.");
				
				
			}
		}
	}
	
	//가운데 번호 패널
	class CenterPanel extends JPanel{
		public CenterPanel() {
			JButton[] bt = new JButton[16];
			setLayout(new GridLayout(4,4,5,5));
			
			bt[0] = new JButton("7");
			bt[1] = new JButton("8");
			bt[2] = new JButton("9");
			bt[3] = new JButton("/");
			
			bt[4] = new JButton("4");
			bt[5] = new JButton("5");
			bt[6] = new JButton("6");
			bt[7] = new JButton("*");
			
			bt[8] = new JButton("1");
			bt[9] = new JButton("2");
			bt[10] = new JButton("3");
			bt[11] = new JButton("-");
			
			bt[12] = new JButton("C");
			bt[13] = new JButton("0");
			bt[14] = new JButton("=");
			bt[15] = new JButton("+");
			
			
			for(int i= 0; i<bt.length; i++) {
				
				if(i % 4 !=3 && i < 11) {
					bt[i].setFont(new Font("맑은고딕",0,30));
					add(bt[i]);
				
					bt[i].addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
							JButton b= (JButton)e.getSource();
							String oldText = label.getText();
							String text= b.getText();
							String nextText= oldText + text;
						
							int n= nextText.length();
							//텍스트 길이 10이하 
							if(n<=10) label.setFont(new Font("맑은 고딕",0,40));
							//텍스트 길이 10 이상
							else if(n > 10) label.setFont(new Font("맑은 고딕",0,30));
						
						
							//텍스트 길이 25 초과시 추가 입력 불가
							if(n<=25) {
								label.setText(nextText);
								info.setText("수식을 계산 중입니다");
							}
							else if(n> 25) info.setText("입력 가능한 범위 초과하였습니다.");
						}
					});
				}
				else if(i ==12 || i ==14) {
					bt[i].setFont(new Font("맑은고딕",0,30));
					add(bt[i]);
					//'C'버튼 이벤트 리스너 추가: 버튼 클릭 시 뒷 글자 제거
					//flag 변수 활용해 계산 결과가 음수일 때 버튼 추가 입력 불가, 지우는 것만 가능
					bt[12].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							int n= label.getText().length()-1;
							
							if(n==0) {
								label.setText("");
								info.setText("수식을 입력하세요.");
								flag= 0;
								
							}else if(n >0 && n<=10) {
								label.setFont(new Font("맑은 고딕",0,40));
								label.setText(label.getText().substring(0,n));
								info.setText("수식을 지우는 중입니다");
							}else {
								label.setFont(new Font("맑은 고딕",0,35));
								label.setText(label.getText().substring(0, n));
								info.setText("수식을 지우는 중입니다");
							}
						}
					});
					
					//"="버튼 이벤트 리스너 추가: 내부 클래스 활용, 버튼 클릭 시 연산 결과 계산
					bt[14].addActionListener(new CalcListener());
				}
				else if (i % 4 ==3) {
					bt[i].setFont(new Font("맑은고딕",0,30));
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}
				
				else if( i == 13) {
					bt[i].setFont(new Font("맑은고딕",0,30));
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}
			}
			
			
			
			
		}
		
		
		
		
	}
	
	//연산, 숫자 0 버튼 이벤트 리스너: 앞의 글자가 +,-,x,/ 중 하나일 때 첫 문자가 아무것도 없으면 0과 연산 기호 입력 불가
	private class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JButton b= (JButton)e.getSource();
			int n= label.getText().length();
			Character c= label.getText().charAt(n-1);
			
			if(flag == 0 && c != '+' && c != '-' && c != '*' && c != '/' ) {
				String oldText= label.getText();
				String text= b.getText();
				String newText= oldText + text;
				label.setText(newText);
				info.setText("수식을 계산 중입니다.");
			}
		}
		
	}
	
	/* 연산 결과 나타내는 "="버튼 리스너: 버튼 클릭시 메소드 calculator 실행
	 * 버튼 클릭 시 메소드 calculator 실행. 계산 결과가 0미만이거나 10,000,000이상일 때
	 * info label에 경고 문구 추가
	 */
	public class CalcListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s= label.getText();
			double result= Calculator(s);
			label.setFont(new Font("맑은 고딕", 0, 40));
			
			if(result < 0) {
				info.setText("0  이상 계산만 가능합니다.");
				label.setText(Double.toString(result));
				flag =1;
			}
			
			else if(result >= 10000000) {
				info.setText("10,000,000 미만 범위만 계산 가능합니다.");
				label.setText(Double.toString(result));
			}
			
			else label.setText(Double.toString(result));
		}
		
	}
	
	//label의 String 저장할 ArrayList
	//check: 10,000,000 이상 숫자 입력 시 경고 띄우기 위한 변수
	public double Calculator(String ss) {
		
		int i;
		double ans;
		check = 0;
		
		
		//String을 숫자, '.', 문자로 구분하여 각 리스트에 저장
		//'.'은 실수를 계산하기 위해 추가
		ArrayList<Double> v= new ArrayList<Double>();
		ArrayList<String> op= new ArrayList<String>();
		
		op.add(null);
		String str= new String("");
		for(i=0; i< ss.length(); i++) {
			Character c= ss.charAt(i);
			//문자를 문자열로 
			String s= Character.toString(c);
			
			//문자가 숫자라면
			if(Character.isDigit(c)) {
				str += Character.toString(c);
				if(i==ss.length()-1) {
					v.add(Double.parseDouble(str));
				}
			}else if(s.equals(".")) {
				str += s;
				System.out.println(str+"에 "+ s + "를 붙임");
			}else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
				System.out.println(v+ "에 "+ str+ "str 추가, "+ op+ "에 "+ c+ "연산 추가");
			}

		}
		
		//입력된 숫자 중 10,000,000 이상 수 있는지 판단
		for(i = 0; i<v.size(); i++) {
			if(v.get(i)>= 10000000) {
				check =1;
				info.setText("10,000,000 미만의 숫자끼리만 계산할 수 있습니다");
				break;
			}
		}
		
		/* 입력된 문자 중 '*,/' 있다면 먼저 계산
		 * 계산 후 해당 연산 기호와 앞 뒤 숫자 제거, 연산 결과 리스트 v에 새로 추가
		 */
		if(check == 0) {
			for(i= 1; i< v.size(); i++) {
				String s = op.get(i);
				double tmp;
				
				if(s.equals("*")) {
					tmp= v.get(i-1) * v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i-1);
					v.add(i-1, tmp);
					i--;
				}
				else if(s.equals("/")) {
					tmp = v.get(i-1) / v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i-1);
					v.add(i-1, tmp);
					i--;
				}
			}
			
			ans = v.get(0);
			//나머지 '+,-' 계산, 계산 결과 반환
			for(i=1; i< v.size(); i++) {
				String s= op.get(i);
				double n= v.get(i);
				
				if(s.compareTo("+")==0) {
					ans= ans + n;
					System.out.println("+ 연산 결과");
				}
				else if(s.compareTo("-")==0) {
					ans = ans-n;
					System.out.println("- 연산 결과");
				}
				
			}
			return ans;
		}
		return 0;
	}
}
	

