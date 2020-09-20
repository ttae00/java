package CalculateProgram;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * JPanel : ������Ʈ���� �׷� ���� ��� ó���� �� ����ϴ� �����̳�
 * JLabel: ������Ʈ�� �ؽ�Ʈ�� �̹����� ��� ���� �� �ִ�(getText,setText(STR)�� �ؽ�Ʈ ����
 * 
 */

public class MyFrame extends JFrame implements ActionListener{
	
	
	JPanel displayPanel;
	JPanel buttonPanel;
	JPanel debugPanel;
	
	JTextField display;
	
	JButton[] buttons; //0~9���� 10���� ��ư
	JButton btnPlus; //+��ư
	JButton btnMinus;//-��ư
	JButton btnMutiply;//x ��ư
	JButton btnDivide; // ������
	JButton btnEqual;
	JButton btnCE; //��ü ����
	JButton btnDelete; //�� ���� ����
	
	JButton btnDebug;
	JLabel debugMsg;
	
	public MyFrame() {
		
		super("CACULATION");
		//this.setTitle("CACULATION");
		
		this.setSize(300,400);
		//���� �̺�Ʈ ó��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLayout(new BorderLayout());
		
		//3���� panel ��ü�� ����� ���� layout�� �����غ��ڴ�
		displayPanel= new JPanel();
		buttonPanel = new JPanel();
		debugPanel = new JPanel();
		
		//FlowLayout�� ���ʿ��� ���������� ��ġ
		displayPanel.setLayout(new FlowLayout());
		
		buttonPanel.setLayout(new GridLayout(0,4,5,5));
		debugPanel.setLayout(new FlowLayout());
		
		
		/*display*/
		
		//display�� �ִ� panel�� component�� ���� ���δ�.
		display= new JTextField(11); //���ڼ��� '11��'�� ���� �Ѵ�
		display.setText("0"); //�ʱ� ���� ȭ�� 0
		display.setHorizontalAlignment(JTextField.RIGHT); //field�� �۾��� ������ ����
		
		Font font= new Font("Serif", Font.BOLD, 30); //
		display.setFont(font);
		
		displayPanel.add(display);
		
		/*button*/
		
		buttons = new JButton[10];
		
		//��ư ��ü �����ϱ�
		for(int i=0; i<buttons.length; i++) {
			buttons[i]= new JButton(Integer.toString(i)); // i�� string ������ �ް� �ʹ�.

		}
		
		btnPlus= new JButton("+");
		btnMinus= new JButton("-");
		btnMutiply= new JButton("*");
		btnDivide= new JButton("/");
		btnEqual= new JButton("=");
		btnCE= new JButton("CE");
		
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
		
		//debugPanel�� debugMsg�� btnDebug�� ���� ���̰ڴ�.
		debugMsg = new JLabel("Start Debug");
		btnDebug = new JButton("Debug Button");
		
		btnDebug.addActionListener(this); //�����ʸ� �̺�Ʈ�ҽ��� ����Ѵ�
		
		debugPanel.add(debugMsg);
		debugPanel.add(btnDebug);
		
		
		//frame�� panel ���̱�
		//���ʿ� displayPanel ���̱�
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(debugPanel, BorderLayout.SOUTH);
		
		//this.pack() ����
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MyFrame frame= new MyFrame();
		//frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnDebug) {
			
			if(debugMsg.getText().equals("Start Debug")) {
				debugMsg.setText("on working");				
			}else {
				debugMsg.setText("Start Debug");
				
			}
		}
	}
	
}
