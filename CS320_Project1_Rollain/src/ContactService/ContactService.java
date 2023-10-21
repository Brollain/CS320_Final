/**
 * @author Brigitte Rollain
 * @Date 15 September 2023
 */
package ContactService;

import java.util.List;
import java.util.ArrayList;

public class ContactService {
	
	private int currentId = 0;
	public List<Contact> contactsList = new ArrayList<Contact>();

	public ContactService() {
	}
	
	public void addContact(String firstName, String lastName, 
			String phoneNumber, String address) {
		String convertId= Integer.toString(currentId);
		Contact newContact = new Contact(convertId, firstName, lastName, phoneNumber, address);
		
		contactsList.add(currentId, newContact);
		
		++currentId;
	}
	
	public void deleteContact(String id) {
		int intId = Integer.parseInt(id);
		
		contactsList.remove(intId);
	}
	
	public void updateFirstName (String id, String fName) {
		int intId = Integer.parseInt(id);
		
		contactsList.get(intId).setFirstName(fName);
	}
	
	public void updateLastName (String id, String lName) {
		int intId = Integer.parseInt(id);
		
		contactsList.get(intId).setLastName(lName);
	}
	
	public void updatePhoneNumber (String id, String pNum) {
		int intId = Integer.parseInt(id);
		
		contactsList.get(intId).setPhoneNumber(pNum);
	}
	
	public void updateAddress (String id, String addr) {
		int intId = Integer.parseInt(id);
		
		contactsList.get(intId).setAddress(addr);
	}

	
}
