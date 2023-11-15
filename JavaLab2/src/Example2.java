import java.text.*;//1. import library for Format number
public class Example2 {

	public static void main(String[] args) {
		//2. define object call decimalformat class
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET = 299;
		int numberofcustomer = 5;
		
		float totalprice = BUFFET * numberofcustomer;
		System.out.println("Buffet of  "+numberofcustomer+" customers is "+ totalprice);
		float servicecharge = totalprice + (totalprice*3/100);
		System.out.println("Add Service Charge 3% is "+ servicecharge);
		
		

	}

}
