import java.io.*;
import java.util.Scanner;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		Header();
		int i=1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String firname = readFile.next().substring(0,1).toUpperCase();
			String lasname = readFile.next();
			String grade = readFile.next();
			readFile.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+firname+"."+lasname+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		
		readFile.close();

		//Level(id);
		//Status(grade);
	}


	private static void Header() {
         System.out.println("No."+"\t"+"ID"+"\t\t"+"Level"+"\t"+"Name"+"\t\t"+"grade"+"\t"+"Status");
         System.out.println("*********************************************************************");
       }
     
	
    private static String Level(String id) {
    	 if(id.substring(0,2).equals("18")) {
      	   return "4th";
    }
    	 else return "3th";
    }  			 
    
    private static String Status(String grade) {
    	float gradeCheck = Float.parseFloat(grade);
    	if(gradeCheck >=2.00)return "Pass";
    	else if(gradeCheck >= 1.00 ||gradeCheck < 2.00)return "Critical";
    	else return "Retired";
    }
  }
   