/* @author Brigitte Rollain
 * Date: 30 September 2023
 * */
package AppointmentService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;

class AppointmentTest {

	@Test
	void testAppt() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date (2023, Calendar.OCTOBER, 27);
		Appointment nAppt = new Appointment("7890", nDate, "Examine the code.");
		assertTrue(nAppt.getAppId().equals("7890"));
		assertTrue(nAppt.getAppDate().equals(nDate));
		assertTrue(nAppt.getAppDesc().equals("Examine the code."));
	}
	
	@Test
	void testIdTooLong() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date (2023, Calendar.OCTOBER, 27);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("12345678901", nDate, "Examine the code.");
		});
	}
	
	@Test
	void testIdIsNull() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date (2023, Calendar.OCTOBER, 27);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment(null, nDate, "Examine the code.");
		});
	}
	
	@Test
	void testDateIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("1234567890", null, "Examine the code.");
		});
	}
	
	@Test
	void testDatePast() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date (2023, Calendar.SEPTEMBER, 27);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("1234567890", nDate, "Examine the code.");
		});
	}
	
	@Test
	void testDescTooLong() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date (2023, Calendar.OCTOBER, 27);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("1234567890", nDate, "Appointment to make sure that the code produced by a third company is accurate.");
		});
	}
	
	@Test
	void testDescIsNull() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date (2023, Calendar.OCTOBER, 27);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Appointment("1234567890", nDate, null);
		});
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void testSetDate() {
		
		Date nDate = new Date (2023, Calendar.NOVEMBER, 8);
		
		Appointment nAppt = new Appointment("428", nDate, "Confirm colors for app.");
		nDate = new Date(2024, Calendar.JANUARY, 12);
		
		nAppt.setAppDate(nDate);
		
		assertTrue(nAppt.getAppDate().equals(nDate));
	}
	
	@Test
	void testSetDesc() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date (2023, Calendar.NOVEMBER, 8);
		
		Appointment nAppt = new Appointment("428", nDate, "Confirm colors for app.");
		
		nAppt.setAppDesc("Meet with the client.");
		
		assertTrue(nAppt.getAppDesc().equals("Meet with the client."));
	}

}
