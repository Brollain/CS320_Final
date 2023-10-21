package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Brigitte Rollain
 * @Date 16 September 2023
 */
class ContactTest {

	@Test
	void testContact() {
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		assertTrue(nContact.getId().equals("888"));
		assertTrue(nContact.getFirstName().equals("Brigitte"));
		assertTrue(nContact.getLastName().equals("Rollain"));
		assertTrue(nContact.getPhoneNumber().equals("5551237890"));
		assertTrue(nContact.getAddress().equals("213 Someplace Blvd."));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Rick", "Sanchez", "5552347890", "426 Science Ave.");
			});
	}
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Rick", "Sanchez", "5552347890", "426 Science Ave.");
			});
	}
	
	@Test
	void testContactFNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "ThisALongNa", "Sanchez", "5552347890", "426 Science Ave.");
			});
	}
	
	@Test
	void testContactFNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Sanchez", "5552347890", "426 Science Ave.");
			});
	}
	
	@Test
	void testContactLNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Rick", "ThisLastNam", "5552347890", "426 Science Ave.");
			});
	}
	
	@Test
	void testContactLNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Rick", null, "5552347890", "426 Science Ave.");
			});
	}
	
	@Test
	void testContactPNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Rick", "Sanchez", "55523478901", "426 Science Ave.");
			});
	}
	
	@Test
	void testContactPNumIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Rick", "Sanchez", null, "426 Science Ave.");
			});
	}
	
	@Test
	void testContactAddrTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Rick", "Sanchez", "5552347890", "42667 ScientificAdvancem Avenue");
			});
	}
	
	@Test
	void testContactAddrIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Rick", "Sanchez", "5552347890", null);
			});
	}
	
	@Test
	void testSetId(){
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		nContact.setId("42");
		assertTrue(nContact.getId().equals("42"));
	}
	
	@Test
	void testSetIdInvalid() {
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			nContact.setId("88842888428");
			});
	}
	
	@Test
	void testSetFName(){
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		nContact.setFirstName("Ruby");
		assertTrue(nContact.getFirstName().equals("Ruby"));
	}
	
	@Test
	void testSetFNameInvalid() {
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			nContact.setFirstName("AbCdEfGhIjK");
			});
	}
	
	@Test
	void testSetLName(){
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		nContact.setLastName("Gloom");
		assertTrue(nContact.getLastName().equals("Gloom"));
	}
	
	@Test
	void testSetLNameInvalid() {
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			nContact.setLastName("ZyXwUtSrQpO");
			});
	}
	
	@Test
	void testSetPNum(){
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		nContact.setPhoneNumber("1235557890");
		assertTrue(nContact.getPhoneNumber().equals("1235557890"));
	}
	
	@Test
	void testSetPNumInvalid() {
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			nContact.setPhoneNumber("555");
			});
	}
	
	@Test
	void testSetAddress(){
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		nContact.setAddress("567 IDK st.");
		assertTrue(nContact.getAddress().equals("567 IDK st."));
	}
	
	@Test
	void testSetAddrInvalid() {
		Contact nContact = new Contact("888", "Brigitte", "Rollain", "5551237890", "213 Someplace Blvd.");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			nContact.setAddress("1234567890 Razzmatazz Boulevards!");
			});
	}
	

}
