
public class PersonalInfo {
	private Person name;
	private Date dDay;
	private int PersonID;
	

    PersonalInfo(){
    	name = new Person();
    	dDay= new Date();
    	PersonID = 0;
    }
	   PersonalInfo(String first,String last,int month,int day,int year,int ID){
			name = new Person(first,last);		
			dDay = new Date (month, day, year);
			PersonID = ID;
		}
		
		public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
			name.setName(first, last);
			dDay.setDate(month, day, year);
			PersonID = ID;
		}
		
	
		public String toString() {
			return "Name: " + name.toString() + "\n" + "Date of birth: "+dDay.toString()+"\n"+"Personal ID: "+PersonID;
		}
	

   
}