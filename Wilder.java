
public class Wilder {
	private String firstname;
    private boolean present;
    
    //Constructors
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.present = false;
    }
    
    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }
    
    //Getters
    public String getFirstname() {
        return this.firstname;
    }
    public boolean isPresent() {
        return this.present;
    }

  //Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setPresent(boolean present) {
    	this.present = present;
    }
    
    //Who am I
    public String whoAmI() {
    	if (this.present) { 
    	   return ("My name is " + this.firstname + " and I am present");
    	}
    	else {
    		return ("My name is " + this.firstname + " and I'm not present");
    	}
    }
   

}
