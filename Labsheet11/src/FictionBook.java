import java.time.Year;

public class FictionBook implements Author,Book {
        private String author_name;
        private String email;      
        private String title;
        private int    publicYear;
        private String Firstname;
        private String Lastname;
        private int space;
        
        
        public FictionBook(String title,int publicYear) {
        	this.title = title;
        	this.publicYear = publicYear;
        }
        public void setAuthorName(String name) {
        	this.author_name = name;
        }
        public void setEmail(String email) {
        	this.email = email;
        }
        public boolean checkFormatName() {
        	if(author_name.indexOf(" ") != -1) {
        		return true;
        	}
        	else 
        		 return false;
        }
        	
     	
        public String getFirstname() {
        	space = author_name.indexOf(" ");
        	return author_name.substring(0,space);       	
        }
        public String getLastname() {
        	space = author_name.indexOf(" ");
        	return author_name.substring(space+1);
        }
        public boolean checkEmail() {
 			if(email.endsWith("hotmail.com")||email.endsWith("windowslive.com")) {
 				return true;
 			}
 			else return false;
 	}
        public String getTitle() {
        	return this.title;
        }
        
        public int totalPublicYear() {
         		return Year.now().getValue()-publicYear ;
        	}
        public String toString() {
        	return title+" write by "+getLastname()+"."+getFirstname()+"("+email+")"+"\nPublished for "+totalPublicYear()+" years.";
        }

   }



