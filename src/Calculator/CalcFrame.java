package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class CalcFrame extends JFrame implements ActionListener 
{
			private static final long serialVersionUID = 1L;
	
    numInput input = new numInput();
	firstMemory mem1 = new firstMemory();
	secondMemory mem2 = new secondMemory();
	Displayer disp = new Displayer();
	
	JFrame frame = new JFrame();
	JPanel contentPane = new JPanel();
	JLabel ansLabel = new JLabel();
	
	JButton button00 = new JButton("00");
	JButton button0 = new JButton("0"); 
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3"); 
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton buttonDot = new JButton(".");
	JButton buttonPlus = new JButton("+");
	JButton buttonMinus = new JButton("-");
	JButton buttonMulti = new JButton("x");
	JButton buttonDivide = new JButton("÷");
	JButton buttonClear = new JButton("C");
	JButton buttonEqual = new JButton("=");
	
		
	  public void Calcframe() 
	  {   	
		frame.setTitle("掛算、割り算、Cボタン、エラー処理未実装");
		frame.setBounds(500, 100, 725, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    	    
	    contentPane = (JPanel)frame.getContentPane();
	    contentPane.setLayout(null);
	    contentPane.setVisible(true);
	    //ラベル表示	    
	    ansLabel.setBounds(50,80,600,100);
	    ansLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
	    ansLabel.setBackground(Color.GRAY);
	    ansLabel.setHorizontalAlignment(JLabel.RIGHT);
	    ansLabel.setVerticalAlignment(JLabel.BOTTOM);
	    ansLabel.setFont(new Font("Arial",Font.PLAIN,55));
	    ansLabel.setText(Main.DEFAULT);
	 
	    contentPane.add(ansLabel);
	    //00			        
	    button00.setBounds(175, 725, 90, 60);	    
	    contentPane.add(button00);
	    button00.setVisible(true);
	    button00.addActionListener(this);
	    //0
	    button0.setBounds(35, 725, 90, 60);	    
	    contentPane.add(button0);
	    button0.setVisible(true);
	    button0.addActionListener(this);
	    //1
	    button1.setBounds(35, 625, 90, 60);	    
	    contentPane.add(button1);
	    button1.setVisible(true);
	    button1.addActionListener(this);
	    //2
	    button2.setBounds(175, 625, 90, 60);	    
	    contentPane.add(button2);
	    button2.setVisible(true);
	    button2.addActionListener(this);
	    //3
	    button3.setBounds(315, 625, 90, 60);	    
	    contentPane.add(button3);
	    button3.setVisible(true);
	    button3.addActionListener(this);
	    //4
	    button4.setBounds(35, 525, 90, 60);	    
	    contentPane.add(button4);
	    button4.setVisible(true);
	    button4.addActionListener(this);
	    //5  
	    button5.setBounds(175, 525, 90, 60);	    
	    contentPane.add(button5);
	    button5.setVisible(true);
	    button5.addActionListener(this);
	    //6   
	    button6.setBounds(315, 525, 90, 60);	    
	    contentPane.add(button6);
	    button6.setVisible(true);
	    button6.addActionListener(this);
	    //7	    
	    button7.setBounds(35, 425, 90, 60);	    
	    contentPane.add(button7);
	    button7.setVisible(true);
	    button7.addActionListener(this);
	    //8
	    button8.setBounds(175, 425, 90, 60);	    
	    contentPane.add(button8);
	    button8.setVisible(true);
	    button8.addActionListener(this);
	    //9
	   	button9.setBounds(315, 425, 90, 60);	    
	    contentPane.add(button9);
	    button9.setVisible(true);
	    button9.addActionListener(this);
	    //.	    
	    buttonDot.setBounds(315, 725, 90, 60);	    
	    contentPane.add(buttonDot);
	    buttonDot.setVisible(true);
	    buttonDot.addActionListener(this);
	    //+	  
	    buttonPlus.setBounds(455, 625, 90, 160);	    
	    contentPane.add(buttonPlus);
	    buttonPlus.setVisible(true);
	    buttonPlus.addActionListener(this);
	    //-	  
	    buttonMinus.setBounds(580, 625, 90, 60);	    
	    contentPane.add(buttonMinus);
	    buttonMinus.setVisible(true);
	    buttonMinus.addActionListener(this);
	    //x
	    buttonMulti.setBounds(455, 525, 90, 60);	    
	    contentPane.add(buttonMulti);
	    buttonMulti.setVisible(true);
	    buttonMulti.addActionListener(this);
	    
	    buttonDivide.setBounds(580, 525, 90, 60);	    
	    contentPane.add(buttonDivide);
	    buttonDivide.setVisible(true);
	    buttonDivide.addActionListener(this);
	    
	    buttonClear.setBounds(580, 225, 90, 60);	    
	    contentPane.add(buttonClear);
	    buttonClear.setVisible(true);
	    buttonClear.addActionListener(this);
	    //=	    
	    buttonEqual.setBounds(580, 725, 90, 60);	    
	    contentPane.add(buttonEqual);
	    buttonEqual.setVisible(true);
	    buttonEqual.addActionListener(this);
	    	    
	    //最後にフレームsetVisibleメソッド利用でボタンが表示されない現象を解決
	    frame.setVisible(true);   
	   	    	    
	   } 
	
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
		
		//1-9が入力された時
		if(obj == button1 | obj == button2 | obj == button3 | obj == button4 | obj == button5 | obj == button6 | obj == button7 | obj == button8 | obj == button9) 
		{			
			Main.num = Main.num + ((AbstractButton) obj).getText();
			input.oneToNine();					 			
		}
		//0が入力された時
		if(obj == button0)
		{
			input.zero();
		}
		//00が入力された時
		if(obj == button00)
		{
			input.zeros();
		}
		//.が入力された時
		if(obj == buttonDot)
		{
			input.decimalPoint();
		}
	
		//演算子のどれかが入力された時
		else if(obj == buttonPlus | obj == buttonMinus | obj == buttonMulti | obj == buttonDivide) 
		{					
			mem1.holdFirstMem();
			Main.ope = ((AbstractButton) obj).getText();
			Main.ope2 = ((AbstractButton) obj).getText();
		}
		//イコールが入力された時
		else if(obj == buttonEqual)
		{	
			mem2.holdSecondMem();			
		}	
		else if(obj == buttonClear)
		{
			//未実装
		}
		
		//最終画面表示
		ansLabel.setText(Main.dispNum);
	}	   
	}

