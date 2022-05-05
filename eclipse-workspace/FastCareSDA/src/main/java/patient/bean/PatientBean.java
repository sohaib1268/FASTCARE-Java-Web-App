package patient.bean;

import java.io.Serializable;

public class PatientBean implements Serializable {
    /**
     * 
     */
	private static final long serialVersionUID = 1L;
    private String ID;
    private String username;
    private String passcode;
    private String location;
    private String emailAddress;
    
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String password) {
		this.passcode = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
    
    
   
}