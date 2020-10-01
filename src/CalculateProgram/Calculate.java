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
	
	//���� ���� �г�
	class NorthPanel extends JPanel{
		public NorthPanel() {
			setLayout(new GridLayout(3,1));
			info= new JLabel("������ �Է��ϼ���.");
			label= new JLabel("");
			
			info.setFont(new Font("���� ���",0,20));
			info.setHorizontalAlignment(SwingConstants.RIGHT);
			
			label.setFont(new Font("���� ���",0, 40));
			label.setHorizontalAlignment(SwingConstants.RIGHT);
			
			add(info);
			add(label);
			label.addMouseListener(new MyMouse());
		}
	}
	
	//���콺 ���� Ŭ������ �� �ʱ�ȭ
	class MyMouse extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			if(e.getClickCount()==2) {
				flag = 0;
				label.setText("");
				info.setText("������ �Է��ϼ���.");
				
				
			}
		}
	}
	
	//��� ��ȣ �г�
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
					bt[i].setFont(new Font("�������",0,30));
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
							//�ؽ�Ʈ ���� 10���� 
							if(n<=10) label.setFont(new Font("���� ���",0,40));
							//�ؽ�Ʈ ���� 10 �̻�
							else if(n > 10) label.setFont(new Font("���� ���",0,30));
						
						
							//�ؽ�Ʈ ���� 25 �ʰ��� �߰� �Է� �Ұ�
							if(n<=25) {
								label.setText(nextText);
								info.setText("������ ��� ���Դϴ�");
							}
							else if(n> 25) info.setText("�Է� ������ ���� �ʰ��Ͽ����ϴ�.");
						}
					});
				}
				else if(i ==12 || i ==14) {
					bt[i].setFont(new Font("�������",0,30));
					add(bt[i]);
					//'C'��ư �̺�Ʈ ������ �߰�: ��ư Ŭ�� �� �� ���� ����
					//flag ���� Ȱ���� ��� ����� ������ �� ��ư �߰� �Է� �Ұ�, ����� �͸� ����
					bt[12].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							int n= label.getText().length()-1;
							
							if(n==0) {
								label.setText("");
								info.setText("������ �Է��ϼ���.");
								flag= 0;
								
							}else if(n >0 && n<=10) {
								label.setFont(new Font("���� ���",0,40));
								label.setText(label.getText().substring(0,n));
								info.setText("������ ����� ���Դϴ�");
							}else {
								label.setFont(new Font("���� ���",0,35));
								label.setText(label.getText().substring(0, n));
								info.setText("������ ����� ���Դϴ�");
							}
						}
					});
					
					//"="��ư �̺�Ʈ ������ �߰�: ���� Ŭ���� Ȱ��, ��ư Ŭ�� �� ���� ��� ���
					bt[14].addActionListener(new CalcListener());
				}
				else if (i % 4 ==3) {
					bt[i].setFont(new Font("�������",0,30));
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}
				
				else if( i == 13) {
					bt[i].setFont(new Font("�������",0,30));
					add(bt[i]);
					bt[i].addActionListener(new MyListener());
				}
			}
			
			
			
			
		}
		
		
		
		
	}
	
	//����, ���� 0 ��ư �̺�Ʈ ������: ���� ���ڰ� +,-,x,/ �� �ϳ��� �� ù ���ڰ� �ƹ��͵� ������ 0�� ���� ��ȣ �Է� �Ұ�
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
				info.setText("������ ��� ���Դϴ�.");
			}
		}
		
	}
	
	/* ���� ��� ��Ÿ���� "="��ư ������: ��ư Ŭ���� �޼ҵ� calculator ����
	 * ��ư Ŭ�� �� �޼ҵ� calculator ����. ��� ����� 0�̸��̰ų� 10,000,000�̻��� ��
	 * info label�� ��� ���� �߰�
	 */
	public class CalcListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s= label.getText();
			double result= Calculator(s);
			label.setFont(new Font("���� ���", 0, 40));
			
			if(result < 0) {
				info.setText("0  �̻� ��길 �����մϴ�.");
				label.setText(Double.toString(result));
				flag =1;
			}
			
			else if(result >= 10000000) {
				info.setText("10,000,000 �̸� ������ ��� �����մϴ�.");
				label.setText(Double.toString(result));
			}
			
			else label.setText(Double.toString(result));
		}
		
	}
	
	//label�� String ������ ArrayList
	//check: 10,000,000 �̻� ���� �Է� �� ��� ���� ���� ����
	public double Calculator(String ss) {
		
		int i;
		double ans;
		check = 0;
		
		
		//String�� ����, '.', ���ڷ� �����Ͽ� �� ����Ʈ�� ����
		//'.'�� �Ǽ��� ����ϱ� ���� �߰�
		ArrayList<Double> v= new ArrayList<Double>();
		ArrayList<String> op= new ArrayList<String>();
		
		op.add(null);
		String str= new String("");
		for(i=0; i< ss.length(); i++) {
			Character c= ss.charAt(i);
			//���ڸ� ���ڿ��� 
			String s= Character.toString(c);
			
			//���ڰ� ���ڶ��
			if(Character.isDigit(c)) {
				str += Character.toString(c);
				if(i==ss.length()-1) {
					v.add(Double.parseDouble(str));
				}
			}else if(s.equals(".")) {
				str += s;
				System.out.println(str+"�� "+ s + "�� ����");
			}else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
				System.out.println(v+ "�� "+ str+ "str �߰�, "+ op+ "�� "+ c+ "���� �߰�");
			}

		}
		
		//�Էµ� ���� �� 10,000,000 �̻� �� �ִ��� �Ǵ�
		for(i = 0; i<v.size(); i++) {
			if(v.get(i)>= 10000000) {
				check =1;
				info.setText("10,000,000 �̸��� ���ڳ����� ����� �� �ֽ��ϴ�");
				break;
			}
		}
		
		/* �Էµ� ���� �� '*,/' �ִٸ� ���� ���
		 * ��� �� �ش� ���� ��ȣ�� �� �� ���� ����, ���� ��� ����Ʈ v�� ���� �߰�
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
			//������ '+,-' ���, ��� ��� ��ȯ
			for(i=1; i< v.size(); i++) {
				String s= op.get(i);
				double n= v.get(i);
				
				if(s.compareTo("+")==0) {
					ans= ans + n;
					System.out.println("+ ���� ���");
				}
				else if(s.compareTo("-")==0) {
					ans = ans-n;
					System.out.println("- ���� ���");
				}
				
			}
			return ans;
		}
		return 0;
	}
}
	

