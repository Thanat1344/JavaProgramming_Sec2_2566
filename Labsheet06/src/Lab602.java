import javax.swing.*;
public class Lab602 {

public static void main(String[] args) {

		int inputyear = Integer.parseInt(JOptionPane.showInputDialog(""+"Input Year"));
		
		while(!(checkYear(inputyear))) {
			inputyear = Integer.parseInt(JOptionPane.showInputDialog(""+"Please input year between 1000-3000,\ninput year again"));
		}
		
		JOptionPane.showMessageDialog(null,isLeapYear(inputyear)? inputyear +" is Leap Year":inputyear+" is not Leap Year");
			
	} //end
	
	public static boolean isLeapYear(int year) 
	
	{
		
		if((year % 4 == 0)&&((year % 100 != 0)||year % 400 == 0))
		{
			return true;
		}
		else return false;
	}//end
	
	public static boolean checkYear(int year)
	{
		if(year >= 1000 && year<=3000)
		{
			return true;
		}
		else return false;
	}//end

}