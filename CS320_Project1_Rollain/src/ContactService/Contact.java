/**
 * @author Brigitte Rollain
 * @Date 14 September 2023
 */
package ContactService;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	private static final int maxLength = 10;
	private static final int maxAddrLength = 30;
	
	
	
	
	
	public Contact(String id, String fName, String lName, String pNumber, String addr) {
		if (validateId(id)) {
			throw new IllegalArgumentException("Invalid ID");
			}
		if (validateName(fName)) {	
			throw new IllegalArgumentException("Invalid first name");
			}
		if (validateName(lName)) {
			throw new IllegalArgumentException("Invalid last name");
			}
		if (validatePhoneNumber(pNumber)) {
			throw new IllegalArgumentException("Invalid phone number");
			}
		if (validateAddress(addr)) {
			throw new IllegalArgumentException("Invalid address");
			}
		
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = pNumber;
		this.address = addr;
		}
	
	public String getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setId(String id) {
		if (validateId(id)) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.id = id;
	}
	
	public void setFirstName(String fName) {
		if (validateName(fName)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = fName;
	}
	
	public void setLastName(String lName) {
		if (validateName(lName)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lName;
	}
	
	public void setPhoneNumber(String pNumber) {
		if (validatePhoneNumber(pNumber)) {
			throw new IllegalArgumentException("Invalid phone Number");
		}
		this.phoneNumber = pNumber;
	}
	
	public void setAddress(String addr) {
		if (validateAddress(addr)) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = addr;
	}
	
	private boolean validateId(String id) {
		if (id == null || id.length() > maxLength) {
			return true;
			}
		return false;
	}
	
	private boolean validateName (String name) {
		if (name == null || name.length() > maxLength) {
			return true;
			}
		return false;
	}
	
	private boolean validatePhoneNumber (String pNumber) {
		if (pNumber == null || pNumber.length() != maxLength) {
			return true;
			}
		return false;
	}
	
	private boolean validateAddress (String addr) {
		if (addr == null || addr.length() > maxAddrLength) {
			return true;
			}
		return false;
	}

}
