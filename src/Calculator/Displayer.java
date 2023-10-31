package Calculator;

import java.text.DecimalFormat;

public class Displayer
{

	final DecimalFormat decFormat = new DecimalFormat("###,###");
	
	public void numDisp() 
	{				 
		Main.dispNum = Main.num;		     
		dispNumSize();
		dispNumFormat();
	}
	
	public void numOpeDisp()
	{		
		Main.dispNum = Main.num1;
		dispNumSize();
		dispNumFormat();
	}
	
	public void numResultDisp()
	{				
		Main.dispNum = String.valueOf(Main.numTotal);
		dispNumSize();
		dispNumFormat();
	}
		
	public void dispNumFormat() 
	{
		if(Main.dispNum.contains(Main.DOT))
		{
			Main.strLeft = Main.dispNum.substring(0,Main.dispNum.indexOf(Main.DOT));			
	        Main.strRight = Main.dispNum.substring(Main.dispNum.indexOf(Main.DOT),Main.dispNum.length());
			
			if(Main.dispNum.endsWith(Main.DOT)) 
			{
			Main.dispNum = decFormat.format(Double.parseDouble(Main.strLeft));
	    	}
	 		else if(Main.dispNum.endsWith(Main.DOT) == false);
			{
				Main.dispNum = decFormat.format(Double.parseDouble(Main.strLeft)) + Main.strRight;
			}

		}			
		else if (Main.dispNum.contains(Main.DOT) == false)
		{
			Main.dispNum = decFormat.format(Double.parseDouble(Main.dispNum)) + Main.DOT;
			
		}
		
	}
	
	public void dispNumSize()
	{
		//dispNumが12文字を超えていた場合の処理
		if(Main.dispNum.length() > 12)
		{
			//小数点： T   負の数： T
			if(Main.dispNum.contains(Main.DOT) & Main.dispNum.startsWith(Main.MINUS))
				{
				    //文字列の末端を切り落とすためのループ
				    while(Main.dispNum.length() > 14)
				    {
				    	Main.dispNum = Main.dispNum.substring(0,Main.dispNum.length() - 1);
				    }
				  //ループ中に小数点が消えていた時の処理
				    if(Main.dispNum.contains(Main.DOT) == false)
				    {
				    	Main.dispNum = Main.dispNum.substring(0,Main.dispNum.length() - 1);
				    }
				
				}			
			//小数点： T    負の数： F
			else if(Main.dispNum.contains(Main.DOT) & Main.dispNum.startsWith(Main.MINUS) == false)
				{ 
				 //文字列の末端を切り落とすためのループ
			     	while(Main.dispNum.length() > 13)
			        {
			     		Main.dispNum = Main.dispNum.substring(0,Main.dispNum.length() - 1);
			        }
			     	//ループ中に小数点が消えていた時の処理
			     	if(Main.dispNum.contains(Main.DOT) == false)
				    {
				    	Main.dispNum = Main.dispNum.substring(0,Main.dispNum.length() - 1);
				    }
				}
			//小数点：  F   負の数： T
			else if(Main.dispNum.contains(Main.DOT) == false & Main.dispNum.startsWith(Main.MINUS))
			{
				 //文字列の末端を切り落とすためのループ
				while(Main.dispNum.length() > 13)
		        {
		     		Main.dispNum = Main.dispNum.substring(0,Main.dispNum.length() - 1);
		        }
			}
			//小数点： F    負の数： F
			else if(Main.dispNum.contains(Main.DOT) == false & Main.dispNum.startsWith(Main.MINUS) == false)
			{
				 //文字列の末端を切り落とすためのループ
				while(Main.dispNum.length() > 12)
		        {
		     		Main.dispNum = Main.dispNum.substring(0,Main.dispNum.length() - 1);
		        }
			}
						
		}
	}
	
	
}
