import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		String temp = "";
		int countBook = 0 ,i = 1;
		
		while((temp = readFile.readLine()) != null) 
		{
			String[] data = temp.split("\t");
			System.out.println(i+". "+data[0]+"("+data[1]+"), Rating "+data[2]+" publish on "+data[5]);
			countBook++;
			i++;
		}
		readFile.close();
		
	}

}
