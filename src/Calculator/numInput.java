package Calculator;

public class numInput 
{

	Displayer disp = new Displayer();
	
	//1-9処理用メソッド
	void oneToNine()
	{
		//入力前に0が存在していた場合にいらない0だったら消す処理
		if(Main.num.startsWith(Main.ZERO) & Main.dotFlag == false)
		{
			Main.num = Main.num.substring(1);
		}
		 
		Main.numFlag = true;
		Main.num2Flag = false;
		
		Main.opeEqFlag = false;
		
		Main.dispNum = Main.num;
		disp.numDisp();	
	}
	
	//0処理用メソッド
	void zero()
	{
		if(Main.num == Main.ZERO | Main.num == "")
		{
			Main.num = Main.ZERO;
		}
		else
		{
			Main.num += Main.ZERO;
		}
		
		disp.numDisp();
		
		Main.numFlag = true;
		Main.opeEqFlag = false;
	}
	
	//00処理用メソッド
	void zeros()
	{
		if(Main.num == Main.ZERO | Main.num == "")
		{
			Main.num = Main.ZERO;
		}
		else
		{
			Main.num += Main.WZERO;
		}
		
		disp.numDisp();
		
		Main.numFlag = true;
		Main.opeEqFlag = false;
	}
	
	//小数点処理用メソッド
	void decimalPoint()
	{
		Main.numFlag = true;
		if(Main.dotFlag | Main.num.contains(Main.DOT))
		{
			//なにもしない
		}
		else
		{
			if(Main.num == "")
			{
				Main.num = Main.ZERO + Main.DOT;
			}
			else
			{
				Main.num = Main.num + Main.DOT;
			}						
		}
		
		
		
		Main.dotFlag = true;
		
		Main.dispNum = Main.num;
		disp.numDisp();
		
		Main.opeEqFlag = false;
				
	}
	
	
}
