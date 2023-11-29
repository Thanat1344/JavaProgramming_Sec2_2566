import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
     
		Scanner scan = new Scanner(System.in);
		int x,y,num,total;
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		
		while(true) {	
			
		if (y<x) {
			
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
			break;
			
		         }
	                } 
		
		num = x;
		System.out.println();
		
		while(x<y)
		{
			x++;
			total = num + x;
			System.out.println(num+"+"+x+"="+total);
			num = total;
		}
			
	}
			
}

