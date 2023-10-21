/* @author Brigitte Rollain
* Date: 30 September 2023
* */

package AppointmentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
	private int currentAppId = 0;
	public List<Appointment> apptsList = new ArrayList<Appointment>();

	public AppointmentService() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAppointment(Date date, String aDesc) {
		String stringId = Integer.toString(currentAppId);
		Appointment nAppt = new Appointment(stringId, date, aDesc);
		
		apptsList.add(currentAppId, nAppt);
		
		++currentAppId;
	}
	
	public void deleteAppointment(String id) {
		int intId = Integer.parseInt(id);
		
		apptsList.remove(intId);
	}
	
	/*
	 * public void updateDate (String id, Date date) {
		int intId = Integer.parseInt(id);
		
		apptsList.get(intId).setAppDate(date);
	}
	 * */

}
