/*
 * @author Brigitte Rollain
 * Date: 30 September 2023
 * */

package AppointmentService;

import java.util.Date;

public class Appointment {
	private String appointmentID;
	private Date appointmentDate;
	private String appointmentDesc;
	
	private static final int appIDLength = 10;
	private static final int appDescLength = 50;
	
	/**
	 * 
	 */
	public Appointment(String appId, Date appDate, String appDesc) {
		validateId(appId);
		validateDate(appDate);
		validateDesc(appDesc);
		
		
		this.appointmentID = appId;
		this.appointmentDate = appDate;
		this.appointmentDesc = appDesc;
	}
	
	private void validateId(String appId) {
		if (appId == null || appId.length() > appIDLength) {
			throw new IllegalArgumentException("Invalid ID");
		}
	}
	
	private void validateDate(Date appDate) {
		if (appDate == null || appDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date");
		}
	}
	
	private void validateDesc(String appDesc) {
		if (appDesc == null || appDesc.length() > appDescLength) {
			throw new IllegalArgumentException("Invalid Date");
		}
	}
	
	public String getAppId() {
		return this.appointmentID;
	}
	
	public Date getAppDate() {
		return this.appointmentDate;
	}
	
	public String getAppDesc() {
		return this.appointmentDesc;
	}
	
	public void setAppDate(Date appDate) {
		validateDate(appDate);
		
		this.appointmentDate = appDate;
	}
	
	public void setAppDesc(String appDesc) {
		validateDesc(appDesc);
		
		this.appointmentDesc = appDesc;
	}

}
