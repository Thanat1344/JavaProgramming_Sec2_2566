import java.text.DecimalFormat;
		import java.util.*;
public class Practice03 {

	public static void main(String[] args) {
		
				DecimalFormat frm = new DecimalFormat("#,###.00");
				Scanner scan = new Scanner(System.in);
				
				final double COMMISSION_RATE = 0.15;
				final int SENTINEL = -1; 

				int sales ,basesalary = 1000; 

				double salary; 

				while (true) {		
					System.out.print("Enter sales in dollars (or -1 to end): ");
					sales = scan.nextInt();
					if (sales == SENTINEL)
					{
						System.out.print("bye");
						break;
					}
					salary = basesalary+(sales*COMMISSION_RATE);
					System.out.println("Salary is: $"+frm.format(salary));
				}
				 
			}
	}
