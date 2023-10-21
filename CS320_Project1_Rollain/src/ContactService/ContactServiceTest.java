package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ContactServiceTest {

	@Test
	void testAddContact() {
		String fName = "Brigitte";
		String lName = "Rollain";
		String pNum = "5551237890";
		String addr = "213 Someplace Blvd.";
		
		ContactService cService = new ContactService();
		assertTrue(cService.contactsList.isEmpty());
		
		cService.addContact(fName, lName, pNum, addr);
		
		assertFalse(cService.contactsList.isEmpty());
		
		assertTrue(cService.contactsList.get(0).getId().equals("0"));
		assertTrue(cService.contactsList.get(0).getFirstName().equals(fName));
		assertTrue(cService.contactsList.get(0).getLastName().equals(lName));
		assertTrue(cService.contactsList.get(0).getPhoneNumber().equals(pNum));
		assertTrue(cService.contactsList.get(0).getAddress().equals(addr));
		
		cService.contactsList.clear();
		}
	
	@Test
	void testDeleteContact() {
		ContactService cService = new ContactService();
		assertTrue(cService.contactsList.isEmpty());
		
		cService.addContact("Rick", "Sanchez", "5552347890", "426 Science Ave."); // Contact at Id 0
		cService.addContact("Invader", "Zim", "1235557890", "909 Galactic St."); // Contact at Id 1
		cService.addContact("Edgar", "Raven", "7895551234", "626 Nevermore Rd."); // Contact at Id 2
		
		assertTrue(cService.contactsList.size() == 3);
		
		cService.deleteContact("1");
		
		assertTrue(cService.contactsList.size() == 2);
		
		cService.contactsList.clear();
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService cService = new ContactService();
		assertTrue(cService.contactsList.isEmpty());
		
		cService.addContact("Rick", "Sanchez", "5552347890", "426 Science Ave."); // Contact at Id 0
		cService.addContact("Invader", "Zim", "1235557890", "909 Galactic St."); // Contact at Id 1
		cService.addContact("Edgar", "Raven", "7895551234", "626 Nevermore Rd."); // Contact at Id 2
		
		assertTrue(cService.contactsList.get(0).getFirstName().equals("Rick"));
		
		cService.updateFirstName("0", "Beth");
		assertTrue(cService.contactsList.get(0).getFirstName().equals("Beth"));
		
		cService.contactsList.clear();
		
	}
	
	@Test
	void testUpdateLastName() {
		ContactService cService = new ContactService();
		assertTrue(cService.contactsList.isEmpty());
		
		cService.addContact("Rick", "Sanchez", "5552347890", "426 Science Ave."); // Contact at Id 0
		cService.addContact("Invader", "Zim", "1235557890", "909 Galactic St."); // Contact at Id 1
		cService.addContact("Edgar", "Raven", "7895551234", "626 Nevermore Rd."); // Contact at Id 2
		
		assertTrue(cService.contactsList.get(0).getLastName().equals("Sanchez"));
		
		cService.updateLastName("0", "Smith");
		assertTrue(cService.contactsList.get(0).getLastName().equals("Smith"));
		
		cService.contactsList.clear();
		
	}
	
	@Test
	void testUpdatePNum() {
		ContactService cService = new ContactService();
		assertTrue(cService.contactsList.isEmpty());
		
		cService.addContact("Rick", "Sanchez", "5552347890", "426 Science Ave."); // Contact at Id 0
		cService.addContact("Invader", "Zim", "1235557890", "909 Galactic St."); // Contact at Id 1
		cService.addContact("Edgar", "Raven", "7895551234", "626 Nevermore Rd."); // Contact at Id 2
		
		assertTrue(cService.contactsList.get(1).getPhoneNumber().equals("1235557890"));
		
		cService.updatePhoneNumber("1", "5558886600");
		assertTrue(cService.contactsList.get(1).getPhoneNumber().equals("5558886600"));
		
		cService.contactsList.clear();
		
	}
	
	@Test
	void testUpdateAddress() {
		ContactService cService = new ContactService();
		assertTrue(cService.contactsList.isEmpty());
		
		cService.addContact("Rick", "Sanchez", "5552347890", "426 Science Ave."); // Contact at Id 0
		cService.addContact("Invader", "Zim", "1235557890", "909 Galactic St."); // Contact at Id 1
		cService.addContact("Edgar", "Raven", "7895551234", "626 Nevermore Rd."); // Contact at Id 2
		
		assertTrue(cService.contactsList.get(2).getAddress().equals("626 Nevermore Rd."));
		
		cService.updateAddress("2", "828 Heart Ln.");
		assertTrue(cService.contactsList.get(2).getAddress().equals("828 Heart Ln."));
		
		cService.contactsList.clear();
		
	}
	
	

}
