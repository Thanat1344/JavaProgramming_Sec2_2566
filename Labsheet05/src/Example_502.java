import java.util.*;
import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//1.input email from dialog box
         String yourEmail = JOptionPane.showInputDialog("Input your e-mail: ");
        //2.check email start with @ or space bar or not
         while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) {
        	  yourEmail = JOptionPane.showInputDialog("Input your e-mail, agian:");
        	        			
         }
         //3.check email and with hotmail.com or gmail.com or not
         if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")){
        	 JOptionPane.showMessageDialog(null,"Your e-mail is "+ yourEmail);
         }else {
        	 JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
         }
	}

}
