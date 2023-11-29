import java.util.*;
public class Labsheet04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int currentNumber,previousNumber;
		
		System.out.print("Input number : ");
		previousNumber = scan.nextInt();
		
		while(true) {
		System.out.print("Input number : ");
		currentNumber = scan.nextInt(); {
		if(currentNumber<previousNumber) {
			break;
		}
		   
		}
	    previousNumber = currentNumber;
		}
			System.out.print("Bye Bye ");
		
	}
}