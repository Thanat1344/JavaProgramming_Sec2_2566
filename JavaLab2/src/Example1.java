
public class Example1 {

	public static void main(String[] args) {
		String bookisbn = "IB-6325-85-4-1";
	    String booktitle = "Basic Java Programming";
	    int bookunit = 5;
		float bookprice = 225.75f;
		
		System.out.println("Book ISBN : " +bookisbn);
		System.out.println("Book Title : " +booktitle);
		System.out.println("Book Unit : " +bookunit+" Books.");
		System.out.println("Book Price : " +bookprice+" Baht. ");
		System.out.println("---------------------------------------------");
		
		double TotalPrice = bookunit * bookprice;
		System.out.println("Total Price is "+TotalPrice);
		double vat = TotalPrice +(TotalPrice*7/100);
		System.out.println("Add VAT 7% is "+vat);
		
	}

}
