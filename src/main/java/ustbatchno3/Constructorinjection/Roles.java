package ustbatchno3.Constructorinjection;

public class Roles {
		public String charactername;
		public String responsibility;
		
		public Roles(String charactername, String responsibility) {
			
			this.charactername = charactername;
			this.responsibility = responsibility;
		}
	
		public void display()
	{
		System.out.println("My name is "+ charactername +" and my responsibility is " +responsibility);
	}
}
