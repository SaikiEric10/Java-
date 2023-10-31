package Calculator;

import java.math.BigDecimal;

public class Main
{	
	
	public static final String WZERO = "00";
	public static final String ZERO = "0";
	public static final String DOT = ".";
	public static final String DEFAULT = "0.";
	public static final String PLUS = "+";
	public static final String MINUS = "-";
	public static final String MULTI = "x";
	public static final String DIVIDE = "÷";
	public static final String EQUAL = "=";
	public static final String ERRORDISPLAY = "E";
	public static final String TRILLION = "000000000000";
	public static final String MINUSONE = "-1";
	
	public static String num = ZERO;
	public static String num1 = ZERO;
	public static String num2 = ZERO; 
	public static BigDecimal numTotal;
	public static String dispNum = ZERO;
	public static String ope;
	public static String ope2;
	public static String opeEq;
	public static String strLeft;
	public static String strRight;
	
    public static Boolean numFlag = false;
    public static Boolean num1Flag = false;
    public static Boolean num2Flag = false;
    public static Boolean opeFlag = false;
    public static Boolean opeEqFlag = false;
    public static Boolean dotFlag = false;
    public static Boolean erFlag = false;
    public static Boolean trillionFlag = false;
    
	
	public static void main(String[] args) 
	{
		
	CalcFrame open = new CalcFrame();	
	open.Calcframe();
			
	}

}
	
	

	

