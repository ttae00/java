/*
 * 계산 프로그램 연습용 
 * 
 * 
 */

package CalculateProgram;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * JPanel : 컴포넌트들을 그룹 별로 묶어서 처리할 때 사용하는 컨테이너
 * JLabel: 컴포넌트에 텍스트와 이미지를 모두 넣을 수 있다(getText,setText(STR)로 텍스트 설정
 * 
 */

public class MyFrame extends JFrame implements ActionListener{
	
	
	
	
	JPanel displayPanel;
	JPanel buttonPanel;
	JPanel debugPanel;
	
	JTextField display;
	
	JButton[] buttons; //0~9까지 10개의 버튼
	JButton btnPlus; //+버튼
	JButton btnMinus;//-버튼
	JButton btnMutiply;//x 버튼
	JButton btnDivide; // 나누기
	JButton btnEqual;
	JButton btnCE; //전체 삭제
	JButton btnDelete; //한 글자 삭제
	
	
	JLabel prev;
	JLabel operator;
	JLabel flag;
	
	//JButton btnDebug;
	//JLabel debugMsg;
	
	public MyFrame() {
		
		super("CACULATION");
		//this.setTitle("CACULATION");
		
		this.setSize(300,400);
		//종료 이벤트 처리
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new BorderLayout());
		
		//3개의 panel 객체를 만들고 각자 layout을 설정해보겠다
		displayPanel= new JPanel();
		buttonPanel = new JPanel();
		debugPanel = new JPanel();
		
		//FlowLayout은 왼쪽에서 오른쪽으로 배치
		displayPanel.setLayout(new FlowLayout());
		
		buttonPanel.setLayout(new GridLayout(0,4,5,5));
		debugPanel.setLayout(new FlowLayout());
		
		
		/*display*/
		
		//display에 있는 panel에 component를 만들어서 붙인다.
		display= new JTextField(11); //글자수가 '11자'가 들어가게 한다
		display.setText("0"); //초기 계산기 화면 0
		display.setHorizontalAlignment(JTextField.RIGHT); //field내 글씨를 오른쪽 정렬
		
		Font font= new Font("Serif", Font.BOLD, 30); //
		display.setFont(font);
		
		displayPanel.add(display);
		
		/*button 객체 생성*/
		
		buttons = new JButton[10];
		
		//버튼 객체 생성하기
		for(int i=0; i<buttons.length; i++) {
			buttons[i]= new JButton(Integer.toString(i)); // i를 string 값으로 받고 싶다.
			buttons[i].addActionListener(this);
			
		}
		
		btnPlus= new JButton("+");
		btnMinus= new JButton("-");
		btnMutiply= new JButton("*");
		btnDivide= new JButton("/");
		btnEqual= new JButton("=");
		btnCE= new JButton("CE");
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMutiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnEqual.addActionListener(this);
		btnCE.addActionListener(this);
		
		// 1 2 3 +
		// 4 5 6 -
		// 7 8 9 *
		// 0 / = CE
		
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(buttons[3]);
		buttonPanel.add(btnPlus);
		
		
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(buttons[6]);
		buttonPanel.add(btnMinus);
		
		buttonPanel.add(buttons[7]);
		buttonPanel.add(buttons[8]);
		buttonPanel.add(buttons[9]);
		buttonPanel.add(btnMutiply);
		
		buttonPanel.add(buttons[0]);
		buttonPanel.add(btnDivide);
		buttonPanel.add(btnEqual);
		buttonPanel.add(btnCE);
		
		//debugPanel에 debugMsg와 btnDebug를 만들어서 붙이겠다.
		
		prev= new JLabel("");
		operator= new JLabel("");
		flag= new JLabel("");
		
		debugPanel.add( new JLabel("PREV: "));
		debugPanel.add(prev);
		
		debugPanel.add( new JLabel("OPERATOR: "));
		debugPanel.add(operator);
		
		debugPanel.add( new JLabel("FLAG: "));
		debugPanel.add(flag);
		
		
		
		/*debugMsg = new JLabel("Start Debug");
		btnDebug = new JButton("Debug Button");
		
		btnDebug.addActionListener(this); //리스너를 이벤트소스에 등록한다
		
		debugPanel.add(debugMsg);
		debugPanel.add(btnDebug); */
		
		
		//frame에 panel 붙이기
		//위쪽에 displayPanel 붙이기
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(debugPanel, BorderLayout.SOUTH);
		
		//this.pack() 묶기
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MyFrame frame= new MyFrame();
		//frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		double op1, op2;
		double result;
		
		//result list 추가, bt....
		List<Double> res= new ArrayList<>();
		
		for(int i=0; i<buttons.length; i++) {
			if(e.getSource() == buttons[i]) {
				//가장 첫번 째 숫자 입력
				if(display.getText().equals("0")) {
					System.out.println("뭐냐");
					display.setText(""+i);
				}else {
					//기존꺼 있으니까 그 다음 누르는 숫자
					System.out.println("2번쨰 ");
					if(operator.getText().equals("")) {
						display.setText( display.getText() + i);
					}else {
						System.out.println("요건?");
						if(flag.getText().equals("")) {
							display.setText(""+i);
							flag.setText("#");
						}else {
							System.out.println("마지막!!");
							display.setText( display.getText()+i);
						}
					}
				}
			}
		}
		
		if(e.getSource()==btnEqual) {
			//double op1, op2, result;
			op1= Double.parseDouble(prev.getText());
			op2= Double.parseDouble(display.getText());
			
			if(operator.getText().equals("+")) {
				result= op1+ op2;
				display.setText(""+ result);
				res.add(result);
				System.out.println(res);
			}
			if(operator.getText().equals("-")) {
				result= op1 - op2;
				display.setText(""+ result);
				res.add(result);
				System.out.println(res);
			}
			
			if(operator.getText().equals("*")) {
				result= op1 * op2;
				display.setText(""+ result);
				res.add(result);
				System.out.println(res);
			}
			if(operator.getText().equals("/")) {
				result= op1 / op2;
				display.setText(""+ result);
				res.add(result);
				System.out.println(res);
			}
			
			
		
		}
		
		if(e.getSource() == btnPlus) {
			prev.setText(display.getText());
			operator.setText("+");
			flag.setText("");
		}
		
		if(e.getSource() == btnMinus) {
			prev.setText(display.getText());
			operator.setText("-");
			flag.setText("");
		}
		if(e.getSource() == btnMutiply) {
			prev.setText(display.getText());
			operator.setText("*");
			flag.setText("");
		}
		if(e.getSource() == btnDivide) {
			prev.setText(display.getText());
			operator.setText("-");
			flag.setText("");
		}
		
		if(e.getSource() ==btnCE) {
			display.setText("0");
			prev.setText("");
			operator.setText("");
			flag.setText("");
		}
		
		
	}
	
}
