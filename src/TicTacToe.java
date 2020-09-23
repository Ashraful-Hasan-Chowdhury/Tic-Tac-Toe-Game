import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame {
	
	static	BorderLayout bdr=new BorderLayout();
	
	static	JPanel pnlMain=new JPanel();
	static	JPanel pnlM=new JPanel();
	static	JPanel pnlNorth=new JPanel();
	static	JPanel pnlSouth=new JPanel();
		
	static	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
		
	static	JLabel lblD=new JLabel();
	
	static int t[][]=new int[5][5];
	static int i,j=0;
	
	public void TicTacToe()
	{
		init();
		cmp();
	}
	private void cmp() {
		btn1 = new JButton();
		btn2 = new JButton();
		btn3 = new JButton();
		btn4 = new JButton();
		btn5 = new JButton();
		btn6 = new JButton();
		btn7 = new JButton();
		btn8 = new JButton();
		btn9 = new JButton();
		
		add(pnlM);
		pnlM.setLayout(new BorderLayout());
		pnlM.add(pnlNorth, bdr.NORTH);
		pnlNorth.setLayout(new FlowLayout(1,5,50));
		pnlNorth.setBackground(Color.ORANGE);
		pnlNorth.add(lblD);
		
		pnlM.add(pnlMain, bdr.CENTER);
		pnlMain.setLayout(new GridLayout(3,3));
		pnlMain.add(btn1);
		pnlMain.add(btn2);
		pnlMain.add(btn3);
		pnlMain.add(btn4);
		pnlMain.add(btn5);
		pnlMain.add(btn6);
		pnlMain.add(btn7);
		pnlMain.add(btn8);
		pnlMain.add(btn9);
		
		btn1.setBackground(Color.lightGray);
		btn2.setBackground(Color.lightGray);
		btn3.setBackground(Color.lightGray);
		btn4.setBackground(Color.lightGray);
		btn5.setBackground(Color.lightGray);
		btn6.setBackground(Color.lightGray);
		btn7.setBackground(Color.lightGray);
		btn8.setBackground(Color.lightGray);
		btn9.setBackground(Color.lightGray);
		
		btn1.setFont(new Font("Arial", Font.PLAIN, 40));
		btn2.setFont(new Font("Arial", Font.PLAIN, 40));
		btn3.setFont(new Font("Arial", Font.PLAIN, 40));
		btn4.setFont(new Font("Arial", Font.PLAIN, 40));
		btn5.setFont(new Font("Arial", Font.PLAIN, 40));
		btn6.setFont(new Font("Arial", Font.PLAIN, 40));
		btn7.setFont(new Font("Arial", Font.PLAIN, 40));
		btn8.setFont(new Font("Arial", Font.PLAIN, 40));
		btn9.setFont(new Font("Arial", Font.PLAIN, 40));
		
		i=0;
		if(i%2==0)
		{
			lblD.setText("Player One's Turn");
		}
		else
		{
			lblD.setText("Player Two's Turn");
		}
		
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[1][1]==0)
				{
					btn1.setBackground(Color.BLACK);
					btn1.setForeground(Color.RED);
					if(i%2==0)
					{
						btn1.setText("X");
						t[1][1]=1;
					}
					else
					{
						btn1.setText("O");
						t[1][1]=2;
					}
					i++;
					D();
					result();
					
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn1, "you cannot select this one");
				}
			}
		});
		
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[1][2]==0)
				{
					btn2.setBackground(Color.BLACK);
					btn2.setForeground(Color.RED);
					if(i%2==0)
					{
						btn2.setText("X");
						t[1][2]=1;
					}
					else
					{
						btn2.setText("O");
						t[1][2]=2;
					}
					i++;
					D();
					result();
					
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn2, "you cannot select this one");
				}
			}
		});
		
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[1][3]==0)
				{
					btn3.setBackground(Color.BLACK);
					btn3.setForeground(Color.RED);
					if(i%2==0)
					{
						btn3.setText("X");
						t[1][3]=1;
					}
					else
					{
						btn3.setText("O");
						t[1][3]=2;
					}
					i++;
					D();
					result();
					
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn3, "you cannot select this one");
				}
			}
		});
		
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[2][1]==0)
				{
					btn4.setBackground(Color.BLACK);
					btn4.setForeground(Color.RED);
					if(i%2==0)
					{
						btn4.setText("X");
						t[2][1]=1;
					}
					else
					{
						btn4.setText("O");
						t[2][1]=2;
					}
					i++;
					D();
					result();
					
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn4, "you cannot select this one");
				}
			}
		});
		
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[2][2]==0)
				{
					btn5.setBackground(Color.BLACK);
					btn5.setForeground(Color.RED);
					if(i%2==0)
					{
						btn5.setText("X");
						t[2][2]=1;
					}
					else
					{
						btn5.setText("O");
						t[2][2]=2;
					}
					i++;
					D();
					result();
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn5, "you cannot select this one");
				}
			}
		});
		
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[2][3]==0)
				{
					btn6.setBackground(Color.BLACK);
					btn6.setForeground(Color.RED);
					if(i%2==0)
					{
						btn6.setText("X");
						t[2][3]=1;
					}
					else
					{
						btn6.setText("O");
						t[2][3]=2;
					}
					i++;
					D();
					result();
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn6, "you cannot select this one");
				}
			}
		});
		
		btn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[3][1]==0)
				{
					btn7.setBackground(Color.BLACK);
					btn7.setForeground(Color.RED);
					if(i%2==0)
					{
						btn7.setText("X");
						t[3][1]=1;
					}
					else
					{
						btn7.setText("O");
						t[3][1]=2;
					}
					i++;
					D();
					result();
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn7, "you cannot select this one");
				}
			}
		});
		
		btn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[3][2]==0)
				{
					btn8.setBackground(Color.BLACK);
					btn8.setForeground(Color.RED);
					if(i%2==0)
					{
						btn8.setText("X");
						t[3][2]=1;
					}
					else
					{
						btn8.setText("O");
						t[3][2]=2;
					}
					i++;
					D();
					result();
					
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn8, "you cannot select this one");
				}
			}
		});
		
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t[3][3]==0)
				{
					btn9.setBackground(Color.BLACK);
					btn9.setForeground(Color.RED);
					if(i%2==0)
					{
						btn9.setText("X");
						t[3][3]=1;
					}
					else
					{
						btn9.setText("O");
						t[3][3]=2;
					}
					i++;
					D();
					result();
					
				
				}
				else
				{
					JOptionPane.showMessageDialog(btn9, "you cannot select this one");
				}
			}
		});
		
	}
	
	public void D()
	{
		if(i%2==0)
		{
			lblD.setText("Player One's Turn");
		}
		else
		{
			lblD.setText("Player Two's Turn");
		}
	}
	
	public void result()
	{
		playerOne();
		playerTwo();
		if(j>0)
		{
			dispose();
			
		}
	}
	private void playerTwo() {
		
		
	if(t[1][1]==2 && t[1][2]==2 && t[1][3]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else	if(t[2][1]==2 && t[2][2]==2 && t[2][3]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else	if(t[3][1]==2 && t[3][2]==2 && t[3][3]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else	if(t[1][1]==2 && t[2][1]==2 && t[3][1]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else	if(t[1][2]==2 && t[2][2]==2 && t[3][2]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else	if(t[1][3]==2 && t[2][3]==2 && t[3][3]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else	if(t[1][1]==2 && t[2][2]==2 && t[3][3]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else	if(t[1][3]==2 && t[2][2]==2 && t[3][1]==2)
		{
			JOptionPane.showMessageDialog(null,"Player Two Won!");
			lblD.setText("Player Two Won!");
			j++;
		}
	else
	{
		if(i>=9)
		{
			JOptionPane.showMessageDialog(null,"Drawn!");
			lblD.setText("Drawn!");
			j++;
		}
		
	}
		
	}
	private void playerOne() {
		
		if(t[1][1]==1 && t[1][2]==1 && t[1][3]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else	if(t[2][1]==1 && t[2][2]==1 && t[2][3]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else	if(t[3][1]==1 && t[3][2]==1 && t[3][3]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else	if(t[1][1]==1 && t[2][1]==1 && t[3][1]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else	if(t[1][2]==1 && t[2][2]==1 && t[3][2]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else	if(t[1][3]==1 && t[2][3]==1 && t[3][3]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else	if(t[1][1]==1 && t[2][2]==1 && t[3][3]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else	if(t[1][3]==1 && t[2][2]==1 && t[3][1]==1)
		{
			JOptionPane.showMessageDialog(null,"Player One Won!");
			lblD.setText("Player One Won!");
			j++;
		}
		else
		{
			if(i>=9)
			{
				JOptionPane.showMessageDialog(null,"Drawn!");
				lblD.setText("Drawn!");
				j++;
			}
			
		}

	}
	
	
	private void init() {
		setVisible(true);
		setSize(600,500);
		setTitle("Tic Tac Toe");
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args)
	{
		TicTacToe ob=new TicTacToe();
		ob.TicTacToe();
	}
}
