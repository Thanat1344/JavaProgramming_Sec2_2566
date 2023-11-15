import javax.swing.*;
import java.text.DecimalFormat;
public class Example4 {

	public static void main(String[] args) {
		 DecimalFormat frm = new DecimalFormat("#,###.00");
	     String productname = JOptionPane.showInputDialog("Input product name : ");
	     
         //String strUnit = JOptionPane.showInputDialog("Input product unit");
         //convert string to int
	     //int unitPrice = Integer.parseInt(strUnit);*/
	     
	     int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
	     float priceperunit = Float.parseFloat(JOptionPane.showInputDialog("input price per unit"));
	     
	     double TotalPrice = unitPrice * priceperunit ;
         double vat = TotalPrice +(TotalPrice*7/100);
         
         //show message from dialog box
         JOptionPane.showMessageDialog(null,"Total Price is " + frm.format(TotalPrice) + " Baht." + "\nAdd VAT 7% is " + frm.format(vat) + " Baht.");
	}

}
