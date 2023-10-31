package Calculator;

import java.math.BigDecimal;

//第一メモリ保存用（演算子キーを押した時の処理)
public class firstMemory 
{
	
	Displayer disp = new Displayer();
	
	//holdFirstMemメソッド
	public void holdFirstMem() 
	{
		 
		//numが空白だった場合にエラーが起きないようにする処理
		if (Main.num == "")
		{
			Main.num = Main.ZERO;
		}
							
		//初回計算
		if(Main.opeFlag == false & Main.opeEqFlag == false)
		{
	    	Main.num1 = Main.num;	
	    	System.out.println("第一メモリ確保"+ Main.num1);
		}
		
		//3項計算
		else if(Main.opeFlag & Main.numFlag)
		{ //+の場合
			
			BigDecimal num1 = new BigDecimal(Main.num1);
			BigDecimal num = new BigDecimal(Main.num);
			
		  if(Main.ope == Main.PLUS) 
		  {
			num1 = num1.add(num);
			Main.num1 = num1.toString();
			System.out.println("第一メモリ確保"+ Main.num1);
			disp.numOpeDisp();
			
		  } //-の場合
		  else if(Main.ope == Main.MINUS)
		  {
			num1 = num1.subtract(num);
			Main.num1 = num1.toString();
			System.out.println("第一メモリ確保"+ Main.num1);		  
			disp.numOpeDisp();			
		  }
		    
		}
		//イコール押した後のリザルトを演算したい場合に行う処理
		 if(Main.opeEqFlag)
		 {
			 Main.num1 = String.valueOf(Main.numTotal);			 
			 Main.dispNum = Main.num1;
			 System.out.println("第一メモリ確保"+ Main.num1);
			 
			 disp.numOpeDisp();
			 
		 }
		  		
		Main.numFlag = false;
		Main.num = "";				
		
		Main.num1Flag = true;		
		Main.opeFlag = true;		
		Main.opeEqFlag = false;
		Main.dotFlag = false;
		
				
	}
	
		
}

 