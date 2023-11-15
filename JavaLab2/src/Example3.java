import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
       Scanner console = new Scanner(System.in);
       System.out.print("Input product name : ");
       String productionName = console.nextLine();
       System.out.print("Input product unit : ");
       int productunit = console.nextInt();
       System.out.print("Input price per unit : ");
       float productPerUnit = console.nextFloat();
       System.out.println();
       float price = productunit*productPerUnit;
       System.out.println("Total Price is "+frm.format(price)+ "\tBaht.");
       double vat =price+(price*7/100);
       System.out.println("Add VAT 7%  is "+frm.format(vat)+ "\tBaht.");
       
       
       
       
       
	}

}
