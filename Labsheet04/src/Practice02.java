import java.util.*;
import java.text.DecimalFormat;
public class Practice02 {

	public static void main(String[] args) {
		final int Salary_Ceiling = 6000; DecimalFormat frm = new DecimalFormat("#,###.00");
		
          final double EMPLOYYEE_RATE_55_AND_BELOW = 0.2;
          final double EMPLOYYER_RATE_55_AND_BELOW = 0.17;
          final double EMPLOYYEE_RATE_55_TO_60 = 0.2;
          final double EMPLOYYER_RATE_55_TO_60  = 0.13;
          final double EMPLOYYEE_RATE_60_TO_65 = 0.075;
          final double EMPLOYYER_RATE_60_TO_65 = 0.09;
          final double EMPLOYYEE_RATE_65_ABOVE = 0.05;
          final double EMPLOYYER_RATE_65_ABOVE = 0.075;
          
          Scanner scan = new Scanner(System.in);
          int contributablesalary;
          int salary,age;
          
          double employeecontribution,employercontribution,totalcontribution;
          
          System.out.print("Enter The Monthly Salary :$ ");
                salary = scan.nextInt();
          System.out.print("Enter The Age : ");
                age = scan.nextInt();
          contributablesalary = Math.min(salary,Salary_Ceiling);
          
          if(age<=55) {
        	  
        	  employeecontribution=contributablesalary*EMPLOYYEE_RATE_55_AND_BELOW;      	  
        	  employercontribution=contributablesalary*EMPLOYYER_RATE_55_AND_BELOW;       	  
        	  totalcontribution=employercontribution+employeecontribution;
        	       	 
          }
          
          else if(age<=60) {
        	  
        	  employeecontribution=contributablesalary+EMPLOYYEE_RATE_55_TO_60;      	  
        	  employercontribution=contributablesalary+EMPLOYYER_RATE_55_TO_60;
        	  totalcontribution=employercontribution+employeecontribution;
          }
          
          else if(age<=65) {
        	  
        	  employeecontribution=contributablesalary*EMPLOYYEE_RATE_60_TO_65;
        	  employercontribution=contributablesalary*EMPLOYYER_RATE_60_TO_65;
        	  totalcontribution=employercontribution+employeecontribution;
          }
          
          else {
        	  
        	  employeecontribution=contributablesalary*EMPLOYYEE_RATE_65_ABOVE;
        	  employercontribution=contributablesalary*EMPLOYYER_RATE_65_ABOVE;
        	  totalcontribution=employercontribution+employeecontribution;
          }
          System.out.println("The Employee's contribution is :$ "+frm.format(employeecontribution));
          
          System.out.println("The Employer's contribution is :$ "+frm.format(employercontribution));
          
          System.out.println("The total contribution is :$ "+frm.format(totalcontribution));
	}

}
