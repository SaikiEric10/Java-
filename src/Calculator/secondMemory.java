package Calculator;

import java.math.BigDecimal;

public class secondMemory 
{
	
	public void holdSecondMem() 
	{		
		Displayer disp = new Displayer();
		BigDecimal num1 = new BigDecimal(Main.num1);
		
				
		//通常計算
		if(Main.opeFlag & Main.numFlag)
		{ 
			Main.num2 = Main.num;
			BigDecimal num2 = new BigDecimal(Main.num2);
			
			if(Main.ope == Main.PLUS) 
			{
		     System.out.println("第二メモリ確保"+Main.num2); 
       		 Main.numTotal = num1.add(num2);
	     	 disp.numResultDisp();
			}

			else if(Main.ope == Main.MINUS) 
			{
		     System.out.println("第二メモリ確保"+Main.num2); 
       		 Main.numTotal = num1.subtract(num2);
	     	 disp.numResultDisp();
			}
		}		
		
		//連続でイコールを押す場合
		if(Main.opeEqFlag)
		{
			BigDecimal num2 = new BigDecimal(Main.num2);
			
	       if(Main.ope2 == Main.PLUS)
	       {
	    	   Main.numTotal = Main.numTotal.add(num2);
	    	   disp.numResultDisp();
	       }
	       else if(Main.ope2 == Main.MINUS)
	       {
	    	   Main.numTotal = Main.numTotal.subtract(num2);
	    	   disp.numResultDisp();
	       }
		}
		
		//数字からイコール
		if(Main.opeEqFlag == false & Main.opeFlag == false)
		{
			BigDecimal num2 = new BigDecimal(Main.num2);
			
			Main.num2 = Main.num;
			//num2がゼロだったら
			if(Main.num2 == "")
			{
				Main.num2 = Main.ZERO;
			}
			
			Main.numTotal = num2;
		}
		
		//演算子からイコール
	    if(Main.opeFlag & Main.numFlag == false & Main.num2Flag == false)
     	{
	    	BigDecimal num2 = new BigDecimal(Main.num2);
	    	//ope :+
			if(Main.ope == Main.PLUS)
			{
				Main.numTotal = num2.add(num1);
				Main.num2 = String.valueOf(Main.numTotal);
		        System.out.println("第二メモリ確保"+Main.num2); 
			}
			//ope :-
			else if(Main.ope == Main.MINUS)
			{
				Main.numTotal = num2.subtract(num1);
				Main.num2 = String.valueOf("-"+Main.numTotal);
				System.out.println("第二メモリ確保"+Main.num2); 
			}
			
			Main.dispNum = String.valueOf(Main.numTotal);
			disp.numResultDisp(); 
			Main.num2 = Main.num1;
	    }
	    //num2が格納されていた場合
	    else if(Main.opeFlag & Main.numFlag == false & Main.num2Flag)
	    {
	    	BigDecimal num2 = new BigDecimal(Main.num2);
	    	//ope :+
	    	if(Main.ope == Main.PLUS)
	    	{
	    		Main.numTotal = num1.add(num2);
	    	}
	    	//ope :-
	    	else if(Main.ope == Main.MINUS)
	    	{
	    		Main.numTotal = num1.subtract(num2);
	    	}
	    	
	    	Main.dispNum = String.valueOf(Main.numTotal);
			disp.numResultDisp();
			Main.num2 = Main.num1;
	    }
		
	
	 Main.numFlag = false;
	 Main.num = "";
	
	 Main.opeEqFlag = true;
	 
	 Main.opeFlag = false;
	 Main.ope = "";
	 
	 Main.dotFlag = false;
				
	}
	
}
