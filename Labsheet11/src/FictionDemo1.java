import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("Input title name : ");
		String title = scan.nextLine();
		 
		System.out.print("Input book year : ");
		int year = scan.nextInt();
		scan.nextLine();
		 
		FictionBook Tell = new FictionBook(title,year);
		
		do
			
		{
			System.out.print("Input author name : ");
			Tell.setAuthorName(scan.nextLine());
			 
			System.out.print("Input email : ");
			Tell.setEmail(scan.nextLine());
			
			}
		while(!(Tell.checkFormatName()||Tell.checkEmail()));
			 
			System.out.println();
			System.out.print(Tell);
	}

}
