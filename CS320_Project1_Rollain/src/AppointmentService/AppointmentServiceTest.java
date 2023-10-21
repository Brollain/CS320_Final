/* @author Brigitte Rollain
* Date: 30 September 2023
* */

package AppointmentService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Calendar;

class AppointmentServiceTest {

	@Test
	void testAddAppt() {
		@SuppressWarnings("deprecation")
		Date nDate = new Date(2023, Calendar.NOVEMBER, 12);
		String desc = "Work on app. concepts.";
		
		AppointmentService aService = new AppointmentService();
		assertTrue(aService.apptsList.isEmpty());
		
		aService.addAppointment(nDate, desc);
		
		assertFalse(aService.apptsList.isEmpty());
		
		assertTrue(aService.apptsList.get(0).getAppId().equals("0"));
		assertTrue(aService.apptsList.get(0).getAppDate().equals(nDate));
		assertTrue(aService.apptsList.get(0).getAppDesc().equals(desc));
		
		aService.apptsList.clear();
	}
	
	@Test
	void testDeleteAppt() {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(2023, Calendar.NOVEMBER, 12);
		@SuppressWarnings("deprecation")
		Date date2 = new Date(2023, Calendar.DECEMBER, 8);
		@SuppressWarnings("deprecation")
		Date date3 = new Date(2024, Calendar.FEBRUARY, 23);
		
		AppointmentService aService = new AppointmentService();
		assertTrue(aService.apptsList.isEmpty());
		
		aService.addAppointment(date1, "Meet with client."); // Appointment at Id 0
		aService.addAppointment(date2, "Create base plan."); // Appointment at Id 1
		aService.addAppointment(date1, "Weekly meet."); // Appointment at Id 2
		
		assertTrue(aService.apptsList.size() == 3);
		
		aService.deleteAppointment("1");
		
		assertTrue(aService.apptsList.size() == 2);
		
		aService.apptsList.clear();
	}

}
